package LinkedList;

public class DoublyLinkedList_CreatingNode {
	
	class Node {
		int val;
		Node next;
        Node prev;
		Node(int val){
			this.val = val;
		}
	}
	static Node head=null;
	Node tail= null;
	
	public void addNodeAtTheEnd(int val) {
		Node newNode = new Node(val);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			newNode.next=null;
		    newNode.prev=tail;
			tail=newNode;
		}
	}
    public static void printheadnode(Node headNode) {
    	Node CurrentNode = headNode;
        while(CurrentNode!=null) {
        	System.out.println(CurrentNode.val);
        	CurrentNode=CurrentNode.next;
        }
    }
	public static void main(String[] args) {
		
		DoublyLinkedList_CreatingNode l = new DoublyLinkedList_CreatingNode();
		l.addNodeAtTheEnd(10);
		l.addNodeAtTheEnd(20);
		l.addNodeAtTheEnd(50);
		l.addNodeAtTheEnd(40);
		l.addNodeAtTheEnd(60);

		printheadnode(head);
	}

}
