import java.util.BitSet;


public class DataStructures {

	public static void main(String[] args) {
	
		//Test LinkedList Class
		LinkedList List = new LinkedList();
		List.insertFront(10);
		List.insertFront(5);
		List.insertBack(11);
		//List = 5->10->11
		List.printList(); // Should print 5 10 11
		List.deleteFirst();
		//List = 10->11
		List.printList(); // Should print 10 11
		List.deleteLast();
		//List = 10
		List.printList(); // Should print 10
		
		//Test BinaryTree Class
		BinaryTree binaryTree = new BinaryTree();
		int[] testTreeData = {4,2,1,3,6,5,7,};
		for(int i = 0; i < testTreeData.length; i++){
			binaryTree.insert(testTreeData[i]);
		}
		binaryTree.printPreOrder(binaryTree.getRoot()); //Should Print  4,2,1,3,6,5,7
		System.out.println();
		binaryTree.printInOrder(binaryTree.getRoot()); //Should Print 1,2,3,4,5,6,7
		System.out.println();
		binaryTree.printPostOrder(binaryTree.getRoot()); //Should Print 1,3,2,5,7,6,4
		System.out.println();
		for(int i = 0; i < 9; i++){
			if(binaryTree.contains(i)){
				System.out.print(i + " is in tree\n");
			} else {
				System.out.print(i + " is not in tree\n");
			}
		}
		
		//Test Stack
		Stack newStack = new Stack();
		int testStack[] = {1,2,3,4};
		for(int i = 0; i < testStack.length; i++){
			newStack.push(testStack[i]);
		}
		System.out.println(newStack.peek()); // Should Print 4
		System.out.println(newStack.items()); // Should print 4
		System.out.println(newStack.getButtom()); // Should print 1
		for(int i = newStack.items(); i > 0; i--){
			System.out.print(newStack.pop() + " "); //Should print 4,3,2,1
		}
		
		//Test Queue
		System.out.println("\nTest Queue");
		Queue newQueue = new Queue();
		int[] testQueue = {1,2,3,4};
		for(int i = 0; i < testQueue.length; i++){
			newQueue.put(testQueue[i]);
		}
		System.out.println(newQueue.peek()); //Should print 1
		System.out.println(newQueue.get()); //Should print 1
		System.out.println(newQueue.peek()); //Should print 2
		System.out.println(newQueue.length); //should print 3
		for(int i = newQueue.length; i > 0; i--){
			System.out.print(newQueue.get() + " "); //Should print 2,3,4
		}
		System.out.println("\n" + newQueue.length); //Should print 0
		
		//Test Trie
		System.out.println("\nTest Trie");
		String[] testDictionary = {"hello", "world","yolo","swag","apple"};
		Trie newTrie = new Trie();
		for(int i = 0; i < testDictionary.length; i++){
			newTrie.addWord(testDictionary[i]);
		}
		System.out.println("There are "+ newTrie.words + " words in the dictionary"); //Should print 4
		
		if(!newTrie.wordExists("homie")) System.out.println("Word homie is not in dictionary");
		for(int i = 0; i < testDictionary.length; i++){
			if(newTrie.wordExists(testDictionary[i])) System.out.println("Word " + testDictionary[i] + " exists in dictionary");
			else System.out.println("Word " + testDictionary[i] + " doesn't exist in dictionary");
		}
		if(!newTrie.wordExists("pokemon")) System.out.println("Word pokemon is not in dictionary");

		//Test MergeSort
		MergeSort merge = new MergeSort();
		int[] testArray1 = {11,121,3,4,523,7,8,10};
		int[] testArray2 = {3,2,1,5,7,8,4};
		printArray(testArray1); //even size array not in order
		printArray(merge.Sort(testArray1)); // array in order
		printArray(testArray2); // odd size array not in order
		printArray(merge.Sort(testArray2)); //odd size array in order
	}
	
	public static void printArray(int[] array){
		if(array == null) return;
		for(int i = 0; i < array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
