package LinkedList;

public class Singly_ReversingLinkedList {

	// Method
	public void ReverseLinkedList() {
		Node currentNode = head;
        Node prev = null;
        Node next = null;
        
        while(currentNode!=null) {
        
        	next=currentNode.next;
        	currentNode.next=prev;
        	prev=currentNode;
        	currentNode=next;
        }
		head=prev;
	}

	public static void main(String[] args) {

		Singly_ReversingLinkedList l = new Singly_ReversingLinkedList();
		l.addNodeAtTheEnd(10);
	    l.addNodeAtTheEnd(20);
		l.addNodeAtTheEnd(50); 
		l.addNodeAtTheEnd(40);
		  
		 
		printheadnode(head);

		l.ReverseLinkedList();
		System.out.println(" After Reverse ");
		printheadnode(head);

	}

	class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	static Node head = null;
	Node tail = null;

	public void addNodeAtTheEnd(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}
	}

	public static void printheadnode(Node headNode) {
		Node CurrentNode = headNode;
		while (CurrentNode != null) {
			System.out.println(CurrentNode.val);
			CurrentNode = CurrentNode.next;
		}
	}

}
