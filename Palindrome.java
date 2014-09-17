
public class Palindrome {

		public Palindrome(){}
		
		String findLongestPalindrome(String input){
			if (input.isEmpty()) return null;
			if(input.length() == 1) return input;
			
			String longestPalindrome = input.substring(0,1);
			for(int i = 0; i < input.length();i++){
				//get longest palindrome with center of i
				String palindrome = findPalindrome(input,i,i);
				if(palindrome.length() > longestPalindrome.length()){
					longestPalindrome = palindrome;
				}
				
				//get longest palindrome with center of i, i +1
				//Even strings
				palindrome = findPalindrome(input,i,i+1);
				if(palindrome.length() > longestPalindrome.length()){
					longestPalindrome = palindrome;
				}
			}
			return longestPalindrome;
			
		}
		
		String findPalindrome(String input, int start, int end){
			while(start >= 0 && end <= input.length() - 1 && input.charAt(start) == input.charAt(end)){
				start--;
				end++;
			}
			return input.substring(start+1, end);
		}
}
