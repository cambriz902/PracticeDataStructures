
public class SortedLinkedList {

	int maxLength;
	Node head;
	Node tail;
	class Node{
		Node next;
		Node prev;
		Object number;
		int timesPresent;
		
		public Node(){
			this.next = null;
			this.prev = null;
			this.number = null;
			this.timesPresent = 0;
		}
		public Node(Object number,int timesPresent){
			this.number = number;
			this.timesPresent = timesPresent;
			this.next = null;
			this.prev = null;
		}
	}
	
	public SortedLinkedList(int valuesToReturn){
		this.maxLength = valuesToReturn;
		this.head = null;
		this.tail = null;
	}
	
	void insert(Object number, int timesPresent){
		if(head == null){
			Node newNode = new Node(number,timesPresent);
			head = newNode;
			tail = newNode;
		}else{
			Node temp = head;
			if(size() != maxLength){
				while(true){ 
					if(temp.timesPresent < timesPresent){
						Node newNode = new Node(number,timesPresent);
						newNode.next = temp;
						newNode.prev = temp.prev;
						temp.prev = newNode;
						if(temp == head) {
							head = newNode;
						}else{
							temp = newNode.prev;
							temp.next = newNode;
						}
						temp = newNode.next;
						break;
					}
					if(temp.next == null){
						Node newNode = new Node(number,timesPresent);
						tail = newNode;
						temp.next = newNode;
						newNode.prev = temp;
						break;
					}
					temp = temp.next;
				}
			}else{
				temp = head;
				while(temp !=null){
					if(temp.timesPresent < timesPresent){
						Node newNode = new Node(number,timesPresent);
						newNode.next = temp;
						newNode.prev = temp.prev;
						temp.prev = newNode;
						if(temp == head) {
							head = newNode;
						}else{
							temp = newNode.prev;
							temp.next = newNode;
						}
						temp = newNode.next;
						removeLast();
						break;
					}
					temp = temp.next;
				}
			}
		}
	}
	
	int size(){
		int size = 0;
		if(head.number == null) return size;
		Node temp = head;
		while(temp != null){
			size++;
			temp = temp.next;
		}
		return size;
	}
	
	void printList(){
		if(head.number == null) return;
		Node temp = head;
		while(temp != null){
			System.out.println("Number = " + temp.number + " Times Present = " + temp.timesPresent);
			temp = temp.next;
		}
	}
	
	//remove tail
	void removeLast(){
		tail = tail.prev;
		tail.next = null;
	}
	
	//return array with numbers most repeated with most repeated at index 0 
	//and decreasing in repetition as index increases(or can stay the same number of repetitions)
	 public int[] topNumbersRepeated(){
		int[] topNumbers = new int[maxLength];
		Node temp = head;
		int index =0;
		while(temp != null){
			topNumbers[index] = (int) temp.number;
			temp = temp.next;
			index++;
		}
		return topNumbers;
	}
	
}
