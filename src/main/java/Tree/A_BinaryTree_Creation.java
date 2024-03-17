package Tree;


public class A_BinaryTree_Creation {
	
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
	
		
		public A_BinaryTree_Creation.node Binaryinsert(node root,int value) {
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
			
		}

		public void InOrderDisplay(node root) {
			if(root!=null) {
				InOrderDisplay(root.left);
				System.out.println(root.value);
				InOrderDisplay(root.right);
			}			
		}
		

	public static void main(String[] args) {
		
		A_BinaryTree_Creation bt= new A_BinaryTree_Creation();
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
