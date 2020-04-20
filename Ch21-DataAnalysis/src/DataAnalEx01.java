import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.rules.OneR;
import weka.classifiers.rules.ZeroR;
import weka.core.Instances;

public class DataAnalEx01 {
	
	public void diabetesValidationOneR(Classifier obj, boolean isUseTrainingSet, int minBucketSize) throws Exception {
		int numfolds = 10;
		int numfold = 0;
		int seed=1;
		
		//getting the data
		Instances data=new Instances(
//		a set of instance is Instances
				new BufferedReader(
						new FileReader(
						"C:\\Program Files\\Weka-3-9\\data\\diabetes.arff")));
		
		Instances training=null;
		Instances test=null;
		
		if(isUseTrainingSet) {
			training=new Instances(data);
			test=new Instances(data);
			//assign the class variable
		}else {
			training=data.trainCV(numfolds, numfold, new Random(seed));
			test=data.testCV(numfolds, numfold);
		}
		
		training.setClassIndex(training.numAttributes()-1);
		test.setClassIndex(test.numAttributes()-1);
		
		//creating the cross check model
		Evaluation ev=new Evaluation(training);
//		create the cross check model through training
		Classifier model=obj;
//		Classifier is the parent of every model
		
		if(obj instanceof OneR) {
			((OneR)model).setMinBucketSize(minBucketSize);
//			model has been downcasting to OneR
//			therefore can be put any OneR objects
		}
		
		if(!isUseTrainingSet) {
			ev.crossValidateModel(model, training, numfolds, new Random(seed));
//			classifier, data, numFolds, random
		}
		
		//implement the model
		model.buildClassifier(training);
		//evaluate the model
		ev.evaluateModel(model, test);
		
		System.out.println("classified the number of data is "+(int)ev.numInstances()
				+ ", the number of correct number is "+(int)ev.correct()
				+ ", the rate of correct number is "+String.format("%.1f", ev.correct()/ev.numInstances()*100)+"%"
				+ ", minBucketSize is "+minBucketSize
				+ ", classfied model is "+((obj instanceof ZeroR) ? "ZeroR":"OneR")
				+ ", "
				+((isUseTrainingSet)? "training/test" : "cross check"));
		System.out.println(model);
		
	}

	public static void main(String[] args) throws Exception {
		DataAnalEx01 obj=new DataAnalEx01();
		System.out.println("===diabetes===");
		obj.diabetesValidationOneR(new ZeroR(), false, 6);
//		obj, isUseTrainingSet, minBucketSize
		obj.diabetesValidationOneR(new OneR(), false, 6);
		
		obj.diabetesValidationOneR(new OneR(), true, 1);
//		true means using the same UseTrainingSet
		
	}

}
