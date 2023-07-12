
public class DLL {
	private Node head;
	private Node tail;
	private int size;
	
	public DLL() {
		this.size = 0;
	}
	
	private class Node {
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int data) {
			this.data = data;
		}
		
		public Node(int data, Node next, Node prev) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
	
	public void insertBeginning(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if(head != null) {
			head.prev = node;
		}
		head = node;
	}
	
	public void insertLast(int val) {
		Node node = new Node(val);
		Node last = head;
		node.next = null; 
		
		if(head == null) {
			node.prev = null;
			head = node;
			return;
		}
		while(last.next != null) {
			last = last.next;	
		}
		last.next = node;
		 
		node.prev = last;
		last = node;
		
	}
	
	public void display() {
		Node node = head;
		Node last = null;
		while(node != null) {
			System.out.print(node.data + " -> ");
			last = node;
			node = node.next;
		}
		System.out.println("END");
		
		System.out.println("Printing in reverse order");
		while(last != null) {
			System.out.print(last.data + " -> ");
			last = last.prev;
		}
		System.out.print("START");
		
		
	}
	
	public static void main(String[] args) {
		DLL dlist = new DLL();
		dlist.insertBeginning(12);
		dlist.insertBeginning(43);
		dlist.insertBeginning(65);
		dlist.insertBeginning(109);
		dlist.display();
	}
}
