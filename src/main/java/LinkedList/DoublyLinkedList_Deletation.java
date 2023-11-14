package LinkedList;

public class DoublyLinkedList_Deletation {
	
	public void DeletingByIndex(int index) {
		Node curr, pre = null,next=null;
		int count=0;
		curr=head;
		while(curr!=null && count!=index) {
			next=curr.next;
			pre=curr;
			count++;
			curr=next;	
			next=curr.next;
		}
        if(count==index) {
        	if(count ==0) {//if index is 0 given means wants to delete Head
        		curr=head.next;
        		curr.prev=null;
        		head.next=null;
        		head=curr;
        	}else {
	        	pre.next=next;
	        	next.prev=pre;
        	}
        }
	}
	public void DeletationAtthebegining() {
		Node curr;
		if(head!=null) {			
			curr=head.next;
			head.next=null;
			curr.prev=null;
			head=curr;			
		}
	}
	public void DeletationAttheEnd() {
		Node curr;
		if(tail!=null) {
			curr=tail.prev;
			tail.prev=null;
			curr.next=null;
			tail=curr;
		}
	}
		

	public static void main(String[] args) {
		
		DoublyLinkedList_Deletation l = new DoublyLinkedList_Deletation();
		l.addNodeAtTheEnd(10);
		l.addNodeAtTheEnd(20);
		l.addNodeAtTheEnd(30);
		l.addNodeAtTheEnd(40);
		l.addNodeAtTheEnd(50);
		l.addNodeAtTheEnd(60);

		printheadnode(head);
		/*
		System.out.println(" After deleting node in the bengining");
		l.DeletationAtthebegining();
		printheadnode(head);
		System.out.println(" After deleting node at the End");

        l.DeletationAttheEnd();
		printheadnode(head);
		*/
        l.DeletingByIndex(2);
		System.out.println(" After deleting node with index");
        printheadnode(head);
	}

	
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
}
