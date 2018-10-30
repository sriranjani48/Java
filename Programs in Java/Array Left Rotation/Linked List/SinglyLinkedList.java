
public class SinglyLinkedList {
	
	public class Node {
		int data;
		Node next;

		Node(int val) {
			data = val;
			next = null;
		}

	}
	
	Node head;
	
	public void insertion(int data) {
		if(head == null) 
			head = new Node(data);
			
		else {
			
		while(head.next == null) {
			head.next = new Node(data);
		}
		head = head.next;
	}
	}
	
	public void printList() {
		
		while(head != null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
		return;
	}
		
	
	public static void main(String[] args) {
		SinglyLinkedList singlyList = new SinglyLinkedList();  
		singlyList.insertion(2);
		singlyList.insertion(25);
		singlyList.insertion(10);
		singlyList.insertion(6);
		singlyList.printList();
	}

}



