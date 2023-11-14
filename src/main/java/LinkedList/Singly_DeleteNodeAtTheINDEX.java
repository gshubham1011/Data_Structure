package LinkedList;



public class Singly_DeleteNodeAtTheINDEX {

	// Method
	public void DeletNodeAttheIndexPart(int index) {
		
		int count=1;
		Node currentNode = head;
		while(currentNode!=null&&count!=index-1) {
			currentNode=currentNode.next;
			count++;
		}
		if(count==index) {
		  currentNode.next= currentNode.next.next;
		}
	}

	public static void main(String[] args) {

		Singly_DeleteNodeAtTheINDEX l = new Singly_DeleteNodeAtTheINDEX();
		l.addNodeAtTheEnd(10);
	    l.addNodeAtTheEnd(20);
		l.addNodeAtTheEnd(50); 
		l.addNodeAtTheEnd(40);
		  
		 
		printheadnode(head);

		l.DeletNodeAttheIndexPart(3);
		System.out.println(" After Adding at the bengining");
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
