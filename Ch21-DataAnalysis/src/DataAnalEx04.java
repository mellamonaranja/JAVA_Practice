import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import weka.classifiers.Evaluation;
import weka.classifiers.lazy.IBk;
import weka.core.Instances;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.AddNoise;

public class DataAnalEx04 {
	
	public void glassIBK(String fileName, int k, boolean isCrossValidate, int percentage) throws Exception, IOException {
		
		int numfolds=10;
		int numfold=0;
		int seed=1;
		
		Instances data=new Instances(
				new BufferedReader(
						new FileReader(
								"C:\\Program Files\\Weka-3-9\\data\\"+fileName+".arff")));
						
		AddNoise filter=new AddNoise();
		filter.setPercent(percentage);
		filter.setInputFormat(data);
		
		data=Filter.useFilter(data, filter);
		
		
		Instances training=data.trainCV(numfolds, numfold, new Random(seed));
//		using the random date to training
		Instances test=data.testCV(numfolds, numfold);
//		and test with left data after training
		
		training.setClassIndex(training.numAttributes()-1);
		test.setClassIndex(test.numAttributes()-1);
		
		Evaluation ev=new Evaluation(training);
		
		IBk model=new IBk();
		model.setCrossValidate(isCrossValidate);
		
		model.setKNN(k);
		
		ev.crossValidateModel(model, training, numfolds, new Random(seed));
		model.buildClassifier(training);
		
		ev.evaluateModel(model, test);
		
		System.out.println("classified the number of data is "+ (int)ev.numInstances()
		+ ", the number of correct number is "+(int)ev.correct()
		+ ", the rate of correct number is "+ String.format("%.1f", ev.correct()/ev.numInstances()*100)+" %"
		+ ", classified IBk model is "+ isCrossValidate+ " and k is "+k
		+ ", percentage is "+percentage
		+ ", the number of cluster which suggested is "+ model.getKNN())
		;
		
	}

	public static void main(String[] args) throws Exception{
		DataAnalEx04 obj=new DataAnalEx04();
		
		String fileName="glass";
		System.out.println("==="+fileName+"===");
		
		obj.glassIBK(fileName, 100,true,0);
		obj.glassIBK(fileName, 100,true,10);
		obj.glassIBK(fileName, 100,true,20);
		obj.glassIBK(fileName, 100,true,30);
		
		for(int i=1;i<10;i++) {
			obj.glassIBK(fileName, 10*i, true, 50);	
			
			System.out.println(obj);
		}
	}

}
