
public class linkedlist {
	Node head;
	
	public void pprintll(Node head) {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public void insertbegin(Node head, int data) {
		linkedlist llis = new linkedlist();
		Node newnode = new Node(data);
		//Node n = head;
		newnode.next =  head;
		head = newnode;
		llis.pprintll(head);
		
	}
	
	public static void main(String[] args) {
		linkedlist ll=new linkedlist();
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		//ll.head = one;
		ll.head = one;
		one.next = two;
		two.next = three;
		three.next = null;
		//ll.pprintll(ll.head);
		ll.insertbegin(ll.head,4);
		
	}
		
		
	

}
