public class Stack{
	private Node top;
	private Node buttom;
	private int items;
	
	class Node{
		int data;
		Node up;
		Node down;

		public Node(int data){
			this.data = data;
			this.up = null;
			this.down = null;
		}
	}

	public Stack(){
		this.top = null;
		this.buttom = null;
		items = 0;
	}

	public void push(int data){
		Node newNode = new Node(data);
		if( isEmpty() ){
			top = newNode;
			buttom = newNode;
		} else {
			top.up = newNode;
			newNode.down = top;
			top = newNode;
		}
		items++;
	}

	public int pop(){
		if( isEmpty() ){
			return -1;
		}
		int data = top.data;
		if(items == 1){
			top = null;
		 	buttom = null;
		} else {
			top = top.down;
			top.up = null;
		}
		items--;
		return data;
	}

	public int peek(){
		return top.data;
	}

	public boolean isEmpty(){
		if(items == 0){
			return true;
		}
		return false;
	}
	
	public int items(){
		return items;
	}
	
	public int getButtom(){
		return buttom.data;
	}
}