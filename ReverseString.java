
public class ReverseString {

	
	public ReverseString(){}
	
	String reverse(String inputString){
		if(inputString == null || inputString.length() ==0){
			return inputString;
		}
		String reverseString = "";
		for(int i = inputString.length() - 1; i >= 0;i--){
			reverseString += inputString.charAt(i);
		}
		return reverseString;
	}
}
