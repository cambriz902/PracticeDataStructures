import java.util.*;
public class BinaryTree {

	Node root = new Node();
	
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		public Node(){}
		
	}
	
	public BinaryTree(){
		root = null;
	}
	
	public Node getRoot(){
		return root;
	}
	public void insert(int data){
		if(root == null){
			root = new Node(data);
		}else{
			Node temp = root;
			Node parent;
			while(true){
				parent = temp;
				if(data < temp.data){
					temp = temp.left;
					if(temp == null){
						parent.left = new Node(data);
						return;
					}
				}else{
					temp = temp.right;
					if(temp == null){
						parent.right = new Node(data);
						return;
					}
				}
			}
		}
	}
	public void preOrderTraversal(Node root){
		if(root == null) return;
		System.out.println(root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	public void inOrderTraversal(Node root){
		if(root == null) return;
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}
	public void postOrderTraversal(Node root){
		if(root == null) return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.data);
	}
	
	//Return LCA in 1 pass
	Node findLCA2(Node root, int data1, int data2){
		if(root == null)return null;
		
		if(root.data == data1 || root.data == data2) return root;
		
		Node leftLCA = findLCA2(root.left,data1,data2);
		Node rightLCA = findLCA2(root.right,data1,data2);
		if(leftLCA != null)
		System.out.println("leftLCA data =" +leftLCA.data);
		if(rightLCA != null)
		System.out.println("rightLCA data = "+ rightLCA.data);
		if(leftLCA != null && rightLCA !=null) return root;
		
		return (leftLCA != null) ? leftLCA : rightLCA;
	}
	
	int getNodeData(Node node){
		return node.data;
	}
}
