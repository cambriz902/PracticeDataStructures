public class Queue{
	
	Node front;
	Node curr;
	Node back;
	int length;

	class Node{
		Node next;
		int data;

		public Node(int data){
			this.next = null;
			this.data = data;
		}
	}

	public Queue(){
		this.front = null;
		this.curr = null;
		this.back = null;
		this.length = 0;
	}

	public void put(int data){
		Node newNode = new Node(data);
		if( isEmpty() ){
			front = newNode;
			back = newNode;
		} else {
			curr = front;
			while(curr.next != null){
				curr = curr.next;
			}
			curr.next = newNode;
		}
		length++;
	}

	public int peek(){
		if( isEmpty() ){
			return 0;
		}
		return front.data;
	}

	public int get(){
		if( isEmpty() ){
			return 0;
		}
		if(length == 1){
			back = null;
		}
		int data = front.data;
		front = front.next;
		length--;
		return data;
	}

	public boolean isEmpty(){
		if(length == 0) return true;
		return false;
	}

	public void printQueue(){
		if( isEmpty() ){
			return;
		}
		curr = front;
		while(curr != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
}