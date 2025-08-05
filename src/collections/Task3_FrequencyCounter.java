package collections;

import java.util.HashMap;
import java.util.Map;

public class Task3_FrequencyCounter {
	public static void main(String[] args) {
		String input="hello";
		
		Map<Character, Integer> freqmap=new HashMap<>();
		
		for(char ch: input.toCharArray()) {
			if(freqmap.containsKey(ch)) {
				freqmap.put(ch,freqmap.get(ch)+1);
			}else {
				freqmap.put(ch, 1);
			}
		}
		
		System.out.println("charcter frequencies: "+freqmap);
	}

}
