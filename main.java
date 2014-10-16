
public class main {

	public static void main(String[] args) {
		/*
		//test colorCodeSort
		int[] colorArray = {0,1,2,0,2,1,1,0,2,1,0,1};
		sortColors test1 = new sortColors();
		printArray(colorArray);
		test1.sortColors2(colorArray);
		printArray(colorArray);
		
		//test find words in substring
		String textWithWords = "ilikesamsung";
		String textWithNoWords = "samsungandmangok";
		SubStrings test2 = new SubStrings();
		if(test2.findWords(textWithWords)){
			System.out.println("words were found");
		}
		if(!test2.findWords(textWithNoWords)){
			System.out.println("words not found");
		}
		
		//test reverse string
		ReverseString test3 = new ReverseString();
		System.out.println(test3.reverse("yoloswag"));
		
		//test binary tree, LCA
		BinaryTree testTree = new BinaryTree();
		int[] testArray = {50,76,21,4,32,64,15,52,14,100,83,2,3,70,87,80};
		for(int i = 0; i < testArray.length; i++)
		{
			testTree.insert(testArray[i]);
		}
		System.out.println("preorder traversal");
		testTree.preOrderTraversal(testTree.root);
		System.out.println("inorder traversal");
		testTree.inOrderTraversal(testTree.root);
		System.out.println("postorder traversal");
		testTree.postOrderTraversal(testTree.root);
		int LCA2 = testTree.getNodeData(testTree.findLCA2(testTree.root,83, 14));
		System.out.println("LCA2 = " + LCA2);
		
		//test palindrome
		String test4 = "forgeeksskeegfor";
		Palindrome longestPalindrome = new Palindrome();
		System.out.println("Longest Palindrome = " + longestPalindrome.findLongestPalindrome(test4));
		

		//test RepeatedIntegers
		//number of integers to test
		int k = 3;
		//array with ints to test
		int[] testArray2 = {2,3,4,2,3,5,5,6,1,3,20,20,20,20,20};
		//initialize instance of findRepeatedInegers that will be used with the methods.
		RepeatedIntegers findRepeatedInegers = new RepeatedIntegers();
		//save the array returned by the findIntegers method in findRepeatedIntegers class
		int[] answer = findRepeatedInegers.findIntegers(testArray2,k);
		//prints contents of answer to make sure correct values are in order
		printArray(answer);
		
		//test StringCaseCombinations
		String testWord = "aBc";
		StringCaseCombinations findCombinations = new StringCaseCombinations();
		findCombinations.getCaseCombinations(testWord);
		*/
		
		//test random shit
		System.out.println(5/2);
	}

	
	//used to print array contents
	static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}
