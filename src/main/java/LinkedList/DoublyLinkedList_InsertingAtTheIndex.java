package LinkedList;

public class DoublyLinkedList_InsertingAtTheIndex {
	
	public void insertBasedOnIndex(int val, int index) {
		Node newNode= new Node(val);
		Node curr= head;
		Node pre=null;
		int count=1;
		while(curr!=null && count!=index) {
			pre=curr;
			curr=pre.next;
			count++;
		}
		if(count==index) {
		   pre.next= newNode;
		   newNode.prev=pre;
		   newNode.next=curr;
		   curr.prev=newNode;
		   
		}
	}
	public void insertingIntoTheBegining(int val) {
	      Node newNode = new Node(val);
	      if(head!=null) {
		      head.prev=newNode;
		      newNode.next=head;
		      head=newNode;
	      }else {
	    	  newNode.next=head;
		      head=newNode;
	      }
	}
	

	public static void main(String[] args) {
		
		DoublyLinkedList_InsertingAtTheIndex l = new DoublyLinkedList_InsertingAtTheIndex();
		l.addNodeAtTheEnd(10);
		l.addNodeAtTheEnd(20);
		l.addNodeAtTheEnd(50);
		l.addNodeAtTheEnd(40);
		printheadnode(head);
		
		l.insertBasedOnIndex(55,4);
		printheadnode(head);
		l.insertingIntoTheBegining(60);
		System.out.println(" After adding node in the bengining");
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
