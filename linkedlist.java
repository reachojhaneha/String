
public class linkedlist {
	
	Node head;
	public class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
		}
	}
	public static void main(String[] args) {
		linkedlist llist = new linkedlist();
		Node first = new Node(1);
		llist.head = first;
		Node second = new Node(2); 
		Node third = new Node(3);
		llist.head.next = second;
		second.next = third;
		third.next = null;
		System.out.println(llist.head);
		
	}

}
