package LinkedList;

public class Singly_AddingNodeAtTheINDEX {
	
	//Method
	public void AddingAttheIndex(int val , int index) {
		Node newNode = new Node(val);
		int count=1;
		Node currentNode = head;
		while(currentNode!=null&&count!=index) {
			currentNode=currentNode.next;
			count++;
		}
		if(count==index) {
			newNode.next=currentNode.next;
			currentNode.next=newNode;
		}
	}  
	
	public static void main(String[] args) {
		
		Singly_AddingNodeAtTheINDEX l = new Singly_AddingNodeAtTheINDEX();
		l.addNodeAtTheEnd(10);
		l.addNodeAtTheEnd(20);
		l.addNodeAtTheEnd(50);
		l.addNodeAtTheEnd(40);

		printheadnode(head);	
		
		l.AddingAttheIndex(45,3);
		System.out.println(" After Adding at the Index");
		printheadnode(head);		

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
