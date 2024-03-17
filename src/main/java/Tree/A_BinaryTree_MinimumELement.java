package Tree;

import Tree.A_BinaryTree_Creation.node;

public class A_BinaryTree_MinimumELement {
	
	class node {
		int value;
		node left;
		node right;
		public node(int value) {
			this.value=value;
			left=null;
			right=null;
		 }
	  }
		node root;
		public void insert(int value) {
			root= Binaryinsert(root, value);
		}
	
		
		public A_BinaryTree_MinimumELement.node Binaryinsert(node root,int value) {
			if(root==null) {
				root = new node(value);
						return root;
			}else if(root.value>value) {
				root.left=Binaryinsert(root.left, value);
			}else if(root.value<value) {
				root.right=Binaryinsert(root.right, value);
			}		
			return root;
		}
		public void SortedOrder() {
			InOrderDisplay(root);
			System.out.println(" Minimum element :"+ManimumELement(root));
		}

		public void InOrderDisplay(node root) {
			if(root!=null) {
				InOrderDisplay(root.left);
				System.out.println(root.value);
				InOrderDisplay(root.right);
			}			
		}
		public int ManimumELement(node root) {
			node currentnode=root;
		    while(currentnode.left!=null) {
		    	currentnode=currentnode.left;
			 }
			//System.out.println(currentnode.value);
            return currentnode.value;
		}
	

	public static void main(String[] args) {
		
		A_BinaryTree_MinimumELement bt= new A_BinaryTree_MinimumELement();
		bt.insert(4);
		bt.insert(1);
		bt.insert(0);
		bt.insert(5);
		bt.insert(3);
		bt.insert(0);
		bt.insert(2);
		bt.SortedOrder();
	
	}
	
}
