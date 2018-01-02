public class Trie{
	private Node root;
	private Node curr;
	int words;

	class Node{
		private Node[] alphabet;
		private boolean isWord;

		public Node(){
			this.alphabet = new Node[27];
			this.isWord = false;
		}

	}

	public Trie(){
		this.root = new Node();
		this.curr = null;
		this.words = 0;
	}

	public void addWord(String word){
		char[] newWord = word.toCharArray();
		curr = root;
		int charLoc;
		for(int i = 0; i < newWord.length; i++){
			charLoc = charLocation2(newWord[i], 0, 26);
			if(curr.alphabet[charLoc] == null) curr.alphabet[charLoc] = new Node();
			curr = curr.alphabet[charLoc];
		}
		curr.isWord = true;
		words++;
	}

	public boolean wordExists(String word){
		char[] findWord = word.toCharArray();
		curr = root;
		int charLoc;
		for(int i = 0; i < findWord.length; i++){
			charLoc = charLocation2(findWord[i],0,26);
			if(curr.alphabet[charLoc] == null){
				return false;
			}
			curr = curr.alphabet[charLoc];
		}
		return curr.isWord;
	}
	
	// Compare alphabet array to find char location takes time O(alphabet.length)
	private int charLocation1(char wordChar){
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i = 0; i < alphabet.length; i++){
			if(wordChar == alphabet[i]) return i++;
		}
		return -1;
	}
	
	//use binary search to find the location of char in the Node array takes time O(log(alphabet.length))
	private int charLocation2(char wordChar,int leftIndex,int rightIndex){
		if( leftIndex > rightIndex) return -1;
		int midPoint = (rightIndex + leftIndex) / 2;
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		if(alphabet[midPoint] == wordChar)  return midPoint++;
		else if(alphabet[midPoint] > wordChar) return charLocation2(wordChar, leftIndex, midPoint--);
		else return charLocation2(wordChar,midPoint++, rightIndex);
	}
}