import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;

public class DataAnalEx02 {

	public void weatherNorminalNaiveBayes(Classifier obj) throws Exception {
		int numfolds=10;
		int numfold=0;
		int seed=1;
		
		Instances data=new Instances(
		new BufferedReader(new FileReader("C:\\Program Files\\Weka-3-9\\data\\weather.nominal.arff")));
		
		Instances training=data.trainCV(numfolds, numfold, new Random());
		Instances test=data.testCV(numfolds, numfold);
		
		training.setClassIndex(training.numAttributes()-1);
//		declare the last value as the class valiable
		
		test.setClassIndex(test.numAttributes()-1);
		
		Evaluation ev=new Evaluation(training);
		Classifier model=obj;
		ev.crossValidateModel(model, training, numfolds, new Random(seed));
		model.buildClassifier(training);
		ev.evaluateModel(model, test);
		
		System.out.println("classified the number of data is "+ (int)ev.numInstances()
//		instances is the number of data
		+ ", the number of correct number is "+(int)ev.correct()
		+ ", the rate of correct number is "+ String.format("%.1f", ev.correct()/ev.numInstances()*100)+"%"
		+ ", classified model is "+obj);
	}
	
	public static void main(String[] args) throws Throwable {
		DataAnalEx02 obj=new DataAnalEx02();
		System.out.println("===weather.norminal===");
		
		obj.weatherNorminalNaiveBayes(new NaiveBayes());
		
	}


}
