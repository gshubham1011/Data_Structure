package Tree;


public class D_BinaryTree_SearchElement {
	
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
	
		
		public D_BinaryTree_SearchElement.node Binaryinsert(node root,int value) {
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
			System.out.println(" Is the element present or not :"+searchElement(root,1));
		}

		public void InOrderDisplay(node root) {
			if(root!=null) {
				InOrderDisplay(root.left);
				System.out.println(root.value);
				InOrderDisplay(root.right);
			}			
		}
    public boolean searchElement(node root,int value) {
    	if(root==null) {
    		return false;
    	}else if(root.value==value) {
    		return true;
    	}
    	if(root.value<value) {
    		return searchElement(root.right,value);
    	}
    	else {
    		return searchElement(root.left, value);
    	}
		    	
    }

	public static void main(String[] args) {
		
		D_BinaryTree_SearchElement bt= new D_BinaryTree_SearchElement();
		bt.insert(4);
		bt.insert(1);
		bt.insert(0);
		bt.insert(5);
		bt.insert(3);
		bt.insert(0);
		bt.insert(2);
		bt.insert(6);
		bt.insert(7);
		bt.insert(8);
		bt.insert(9);
		bt.SortedOrder();
	
	}
	
}
