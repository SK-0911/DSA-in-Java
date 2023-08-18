
public class LinkedList {
	public static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void removeNode() {
		if(head != null) {
			head = head.next;
		}
	}
	
	
}
