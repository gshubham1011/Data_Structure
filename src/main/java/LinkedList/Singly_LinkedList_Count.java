package LinkedList;

public class Singly_LinkedList_Count {
	
    public void count(Node head) {
       Node curr=head;
       int count=1;
       if(curr==null) {
    	   System.out.println(" list is empty ");
       }else {
    	   while(curr!=tail){
    		   curr=curr.next;
    		   count++;
    	   }
    	   System.out.println(" Size of the LinkedList is :"+count);
       }
    }
  
	public static void main(String[] args) {
		
		Singly_LinkedList_Count l = new Singly_LinkedList_Count();
		l.addNodeAtTheEnd(10);
		l.addNodeAtTheEnd(20);
		l.addNodeAtTheEnd(50);
		l.addNodeAtTheEnd(40);

		printheadnode(head);
		l.count(head);
	}
	class Node {
		int val;
		Node next;
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
