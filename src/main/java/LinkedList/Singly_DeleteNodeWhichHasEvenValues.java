package LinkedList;

public class Singly_DeleteNodeWhichHasEvenValues {

	public void deleteNodeWithAGivenValue(int value) {
		 
	    //case when we need to remove the head node
	    if (head.val == value) {
	    	DeletNodeAttheBeginingPart();
	    } else if (tail.val == value) {
	        //case when we need to remove the tail node
	    	DeletNodeAttheEndPoint();
	    } else {
	        Node current = head;
	        Node previous = null;
	        while (current != null && current.val != value) {
	            //store the value of current in previous
	            previous = current;
	            current = current.next;
	        }
	 
	        //case when the given value node  is not found
	        if (current == null) {
	            throw new RuntimeException("the node with the given value is not found!!");
	        }
	        //at this point we have the information of the previous node to the node with given value which we want to delete
	        //and current node is the node that we want to delete
	        previous.next = current.next;
	    }
	}
	 
	//Lecture #27 Assignment Part 2(using the deleteNodeWithAGivenValue() function here): remove all nodes with even values
	public void deleteAllNodesWithEvenValues() {
	 
	    Node current = head;
	    while (current != null) {
	 
	        if (current.val % 2 == 0) {
	            deleteNodeWithAGivenValue(current.val);
	        }
	        current = current.next;
	    }
	 
	}
	public void DeletNodeAttheBeginingPart() {
		head=head.next;
	}
	public void DeletNodeAttheEndPoint() {
		Node currentNode = head;

		while (currentNode.next.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = null;
		tail = currentNode;
	}

	public static void main(String[] args) {

		Singly_DeleteNodeWhichHasEvenValues l = new Singly_DeleteNodeWhichHasEvenValues();
		l.addNodeAtTheEnd(11);
	    l.addNodeAtTheEnd(25);
		l.addNodeAtTheEnd(25);
		l.addNodeAtTheEnd(51); 
		l.addNodeAtTheEnd(41);
		l.addNodeAtTheEnd(55);  
		 
		printheadnode(head);

		l.deleteAllNodesWithEvenValues();
		System.out.println(" After");
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
