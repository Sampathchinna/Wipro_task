package wrapperclass;

import java.util.*;
public class StudentScoreBoard {
	public static void main(String[] args) {
		Map<String,List<Integer>> studentScores=new HashMap<>();
		
		studentScores.put("sampath",Arrays.asList(85,90,40));
		studentScores.put("jhonny",Arrays.asList(65,70,50));
		studentScores.put("rajini",Arrays.asList(84,90,30));
		
		String topStudent=null;
		double topAverage=0;
		
		for(Map.Entry<String, List<Integer>> entry: studentScores.entrySet()) {
			
			String name=entry.getKey();
			List<Integer> marks=entry.getValue();
			
			int sum=0;
			for(int mark:marks) {
				sum+=mark;
			}
			double average=(double) sum/marks.size();
			
			System.out.println(name+"->"+marks+"| Average: "+average);
			
			if(topStudent==null|| average>topAverage) {
				topStudent=name;
				topAverage=average;
			}
		}
			System.out.println("Highest Scorer: " + topStudent + " with average " + topAverage);
		
	}

}
