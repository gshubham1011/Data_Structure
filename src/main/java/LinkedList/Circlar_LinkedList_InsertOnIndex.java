package LinkedList;

import LinkedList.DoublyLinkedList_InsertingAtTheIndex.Node;

public class Circlar_LinkedList_InsertOnIndex {
	
	public void AddnodeInIndex(int val , int index) {
	     Node newNode = new Node(val);
	     Node curr=head;
	     Node prev = null;
	     int count=0;
	     while(curr.next!=head && count!=index) {
	    	 prev=curr;
	    	 curr=curr.next;
	    	 count++;
	     }
	     if(count==index) {
	    	 if(curr==head) {
	    		 newNode.next=head;
	    		 tail.next=newNode;
	    		 head=newNode;
	    	 }else {
	    	 newNode.next=curr;
	    	 prev.next=newNode;
	    	 }
	     }
	}
    
	
	public static void main(String[] args) {
		
		Circlar_LinkedList_InsertOnIndex l = new Circlar_LinkedList_InsertOnIndex();
		l.addNodeAtTheEnd(10);
		l.addNodeAtTheEnd(20);
		l.addNodeAtTheEnd(30);
		l.addNodeAtTheEnd(40);
		l.addNodeAtTheEnd(50);

		l.printheadnode(head);
        l.AddnodeInIndex(42,4);
		l.printheadnode(head);
		
	}
	   class Node {
			int val;
			Node next;
			Node(int val){
				this.val = val;
			}
		}
		static Node head=null;
		static Node tail= null;
		

		
		public void addNodeAtTheEnd(int val) {
			Node newNode = new Node(val);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
				tail.next=newNode;
				newNode.next=head;
				tail=newNode;
			}
		}
	    //Displays all the nodes in the list  
	    public void printheadnode(Node headnode) {  
	        Node current = headnode;  
	        if(headnode == null) {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	            System.out.println("Nodes of the circular linked list: ");  
	             do{  
	                //Prints each node by incrementing pointer.  
	                System.out.print(" "+ current.val);  
	                current = current.next;  
	            }while(current != headnode);  
	            System.out.println();  
	        }  
	    }  

}
