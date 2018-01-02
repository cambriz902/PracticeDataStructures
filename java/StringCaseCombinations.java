
public class StringCaseCombinations {

	public StringCaseCombinations(){}
	
	String[] getCaseCombinations(String word){
		int combinations = 1 << word.length();
		String[] answer = new String[combinations];
		word = word.toLowerCase();
		for(int i = 0; i < combinations; i++){
			char[] newWord = word.toCharArray();
			for(int j = 0; j < word.length(); j++){
				System.out.println("i = " + i + " j = " + j + " i>>j = " + (i>>j) + " (i>>j) & 1 = " + ((i>>j)&1));
				if(((i >> j)& 1)  == 1){
					newWord[j] = Character.toUpperCase(word.charAt(j));
				}
			}
			System.out.println(new String(newWord));
		}
		return answer;
	}
}
