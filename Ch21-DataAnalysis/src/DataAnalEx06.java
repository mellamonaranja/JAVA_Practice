import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.SimpleLogistic;
import weka.core.Instances;
import weka.filters.unsupervised.instance.RemoveWithValues;

public class DataAnalEx06 {

	public static void main(String[] args) throws Exception {
		DataAnalEx06 obj=new DataAnalEx06();
		
		System.out.println("=====");
		System.out.println("non apply filter");
		obj.RemoveWithValues(false);
		
		System.out.println("=====");
		System.out.println("apply filter");
		obj.RemoveWithValues(true);
	}
	
	public void RemoveWithValues(boolean isFilter) throws Exception {
		int numfolds=10;
		int numfold=0;
		int seed=1;
		
		Instances data=new Instances(
				new BufferedReader(
						new FileReader("C:\\Program Files\\Weka-3-9\\data\\labor.arff")));
		
		if(isFilter) {
			RemoveWithValues filter=new RemoveWithValues();
			filter.setAttributeIndex("5");
			filter.setNominalIndices("1");
			
			filter.setInputFormat(data);
			filter.useFilter(data, filter);
		}
		
		Instances training=data.trainCV(numfolds, numfold, new Random(seed));
		Instances test=data.testCV(numfolds, numfold);
		
		training.setClassIndex(training.numAttributes()-1);
		test.setClassIndex(test.numAttributes()-1);
		
		Evaluation ev=new Evaluation(training);
		
		Classifier model=new SimpleLogistic();
		ev.crossValidateModel(model, training, numfolds, new Random(seed));
		
		model.buildClassifier(training);
		
		ev.evaluateModel(model, test);
		
		System.out.println(ev.toSummaryString());
	}

}
