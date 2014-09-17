
public class SubStrings {
	String dictionary[] = {"mobile","samsung","sam","sung","man",
			"mango","icebream","and","go","i","like","ice","cream"};
	
	public SubStrings(){
	}
	
	Boolean dictionaryContrains(String word){
		//System.out.println(word);
		for(int i = 0; i < dictionary.length;i++){
			if(dictionary[i].compareTo(word) == 0){
				return true;
			}
		}
		return false;
	}
	
	Boolean findWords(String inputText){
		int stringLength = inputText.length();
		
		//Base case
		if(stringLength == 0){
			return true;
		}
		
		// Try all the prefixes of lengths from 1 to stringLength
		for(int i = 0;i <= stringLength; i++){
			//check if current substring exists from 0 to i
			//Then if that returns true check if the next substring
			//exists from i to strinsize-1
			if(dictionaryContrains(inputText.substring(0, i)) &&
					findWords(inputText.substring(i,stringLength))){
				return true;
			}
		}
		return false;
	}
}
