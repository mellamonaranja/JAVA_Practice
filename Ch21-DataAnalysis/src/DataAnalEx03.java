import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import javax.swing.JFrame;

import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;

public class DataAnalEx03 {
	
	public void breastCancerJ48crossValidation(boolean isUnpruned) throws Exception {
		int numfolds=10;
		int numfold=0;
		int seed=1;
		
		Instances data=new Instances(
				new BufferedReader(
						new FileReader(
								"C:\\Program Files\\Weka-3-9\\data\\breast-cancer.arff")));
		
		Instances training=data.trainCV(numfolds, numfold, new Random(seed));
		Instances test=data.testCV(numfolds, numfold);
		
		training.setClassIndex(training.numAttributes()-1);
		test.setClassIndex(test.numAttributes()-1);
		
		Evaluation ev=new Evaluation(training);
		
		J48 model=new J48();
		model.setUnpruned(isUnpruned);

		ev.crossValidateModel(model, training, numfolds, new Random(seed));
		model.buildClassifier(training);
		
		ev.evaluateModel(model, test);
		
		System.out.println("classified the number of data is "+ (int)ev.numInstances()
		+ ", the number of correct number is "+(int)ev.correct()
		+ ", the rate of correct number is "+ String.format("%.1f", ev.correct()/ev.numInstances()*100)+" %"
		+ ", classified J48 model which unprunded is "+isUnpruned);
//		if true, prune otherwise un-prune
		
		System.out.println(model);
		
		this.treeViewInstances(data, model, ev);
	}
	
	public void treeViewInstances(Instances data, J48 tree, Evaluation ev) throws Exception {
		String graphName="";
		graphName+="the rate of correct number is "+String.format("%.2f", ev.pctCorrect()+" %");
		
		TreeVisualizer panel=new TreeVisualizer(null, tree.graph(), new PlaceNode2());
		
		JFrame frame=new JFrame(graphName);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(panel);
		frame.setSize(new Dimension(800,500));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		panel.fitToScreen();
		System.out.println(graphName);
	}

	public static void main(String[] args) throws Exception {
		DataAnalEx03 obj=new DataAnalEx03();
		System.out.println("===breast-cancer===");
		
		obj.breastCancerJ48crossValidation(false);
		obj.breastCancerJ48crossValidation(true);
	}

}
