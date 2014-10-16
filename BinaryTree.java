//Insert takes O(log(n))
//Search takes O(log(n))
//delete takes O(log(n))

public class BinaryTree{
	
	Node root;
	Node curr;

	class Node{
		Node left;
		Node right;
		int data;

		public Node(int data){
			this.left = null;
			this.right = null;
			this.data = data;
		}

		public Node(){
			this.left = null;
			this.right = null;
		}

	}

	public BinaryTree(){
		this.root = null;
		this.curr = null;
	}

	public void insert(int data){
		Node newNode = new Node(data);
		if(root == null){
			root = newNode;
		} else {
			curr = root;
			Node parent = new Node();
			while(curr != null){
				parent = curr;
				if(newNode.data > curr.data) curr = curr.right;
				else curr  = curr.left;
			}
			if(newNode.data > parent.data) parent.right = newNode;
			else parent.left = newNode;
		}
	}

	public boolean contains(int data){
		if( isEmpty() ){
			return false;
		}
		curr = root;
		while(curr != null){
			if(curr.data == data){
				return true;
			}
			if(curr.data > data) curr = curr.left;
			else curr = curr.right;
		}
		return false;
	}
	
	public boolean isEmpty(){
		if(root == null){
			return true;
		}
		return false;
	}

	public void printPreOrder(Node node){
		if(node == null){
			return;
		}
		System.out.print(node.data + " ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}

	public void printInOrder(Node node){
		if(node == null){
			return;
		}
		printInOrder(node.left);
		System.out.print(node.data + " ");
		printInOrder(node.right);
	}

	public void printPostOrder(Node node){
		if(node == null){
			return;
		}
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.data + " ");
	}

	public Node getRoot(){
		return root;
	}

}