import java.util.HashMap;
import java.util.Map;


public class RepeatedIntegers {
	
	public RepeatedIntegers(){}
	
	int[] findIntegers(int[] input,int numberOfIntegers){
		if(input == null || input.length ==  0) return null;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		SortedLinkedList list = new SortedLinkedList(numberOfIntegers);
		for(int i = 0; i < input.length; i++){
			if(map.containsKey(input[i])) { map.put(input[i], map.get(input[i])+1);}
			else {map.put(input[i], 1);}
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			list.insert(entry.getKey(), entry.getValue());
		}
		int[] answer = list.topNumbersRepeated();
		return answer;
	}
	
}
