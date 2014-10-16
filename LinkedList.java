//Insert takes O(1);
//Search takes O(n);
//Delete takes O(1);

public class LinkedList{
	
	private Node head;
	private Node tail;
	private Node curr;
	private int length;

	class Node{
		private Node prev;
		private Node next;
		private Object data;

		public Node(Object data){
			this.prev = null;
			this.next = null;
			this.data = data;
		}
	}

	public LinkedList(){
		this.head = null;
		this.tail = null;
		this.curr = null;
		this.length = 0;
	}

	public void insertFront(Object data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
		} else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public void insertBack(Object data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}

	public boolean deleteFirst(){
		if(isEmpty()){
			return false;
		} else {
			if(length == 1){
				head = null;
				tail = null;
				curr = null;
			} else {
				head = head.next;
				head.prev = null;
			}
		}
		length--;
		return true;
	}
	
	public boolean deleteLast(){
		if(isEmpty()){
			return false;
		}
		if( getLength() == 1){
			head = null;
			curr = null;
			tail = null;
		} else {
			tail = curr.prev;
			tail.next = null;
		}
		return true;
	}

	public Object getObject(int index) {
		if( length < index){
			return null;
		}
		curr = head;
		while(index != 1)
		{
			curr = curr.next;
		}
		return curr.data;
	}

	public boolean isEmpty(){
		if(length == 0){
			return true;
		}
		return false;
	}

	public int getLength(){
		return length;
	}

	public boolean printList(){
		if(isEmpty()){
			return false;
		}
		curr = head;
		while(curr.next != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.print(curr.data);
		System.out.println();
		return true;
	}
	

}