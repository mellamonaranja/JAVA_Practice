import javabayes.Helpers.BayesNetHelper;
import javabayes.InferenceGraphs.InferenceGraph;
import javabayes.InferenceGraphs.InferenceGraphNode;

public class DataAnalEx05 {
	
	public DataAnalEx05() {
		InferenceGraph ingerenceGraph=new InferenceGraph();
		
		InferenceGraphNode age=BayesNetHelper.createNode(ingerenceGraph, 
				"under55", "<55", ">55");
//				ig, name, trueVariable, falseVariable
		
		InferenceGraphNode smoker=BayesNetHelper.createNode(ingerenceGraph, 
				"smoker", "smokes", "doesnotsmoke");
		
		InferenceGraphNode duration=BayesNetHelper.createNode(ingerenceGraph, 
				"duration", "<2Y", ">2Y");
		
		InferenceGraphNode surgical=BayesNetHelper.createNode(ingerenceGraph, 
				"surgicalOutcome", "<2Y", ">2Y");
			
		ingerenceGraph.create_arc(age, smoker);
//		parent, child
		
		ingerenceGraph.create_arc(smoker, surgical);
		ingerenceGraph.create_arc(duration, surgical);
//		among them, both of smoker and surgical have their parent but age and duration doesn't have
		
		BayesNetHelper.setProbabilityValues(smoker, "<55", 0.4, 0.6);
//		node, trueValue, falseValue
//		depends on the age(<55), it returns 0.4 otherwise 0.6
		
		BayesNetHelper.setProbabilityValues(smoker, ">55", 0.8, 0.2);
		
		BayesNetHelper.setProbabilityValues(surgical, "smokes", "<2Y", 0.1, 0.9);
		BayesNetHelper.setProbabilityValues(surgical, "smokes", ">2Y", 0.01, 0.99);
		
		BayesNetHelper.setProbabilityValues(surgical, "doesnotsmoke", "<2Y", 0.8, 0.2);
		BayesNetHelper.setProbabilityValues(surgical, "doesnotsmoke", ">2Y", 0.58, 0.42);
		
		BayesNetHelper.setProbabilityValues(age, 0.8, 0.2);
		BayesNetHelper.setProbabilityValues(duration, 0.9, 0.1);
		
		Double belif=BayesNetHelper.getBelief(ingerenceGraph, surgical);
//		(InferenceGraph ig, InferenceGraphNode node)
		System.out.println("probability of surgery by this model is "+belif + "%");
		
		age.set_observation_value("<55");
		belif=BayesNetHelper.getBelief(ingerenceGraph, surgical);
		System.out.println("probability of surgery after added age(less than 55) by this model is "+belif + "%");
	
		smoker.set_observation_value("smokes");
		belif=BayesNetHelper.getBelief(ingerenceGraph, surgical);
		System.out.println("probability of surgery after added age(less than 55) and smokes by this model is "+belif + "%");
	
		duration.set_observation_value(">2Y");
		belif=BayesNetHelper.getBelief(ingerenceGraph, surgical);
		System.out.println("probability of surgery after added age(less than 55) and smokes and 2years by this model is "+belif + "%");
	}

	public static void main(String[] args) {
		DataAnalEx05 obj=new DataAnalEx05();
		
	}

}
