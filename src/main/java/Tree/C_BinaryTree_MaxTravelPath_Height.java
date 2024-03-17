package Tree;


public class C_BinaryTree_MaxTravelPath_Height {
	
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
	
		
		public C_BinaryTree_MaxTravelPath_Height.node Binaryinsert(node root,int value) {
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
			System.out.println(" maximum path of the tree :"+maximumPath(root));
		}

		public void InOrderDisplay(node root) {
			if(root!=null) {
				InOrderDisplay(root.left);
				System.out.println(root.value);
				InOrderDisplay(root.right);
			}			
		}
	 public int maximumPath(node root) { // logic to find maximum path of the tree
		 if(root==null) {
			 return -1;
		 }else {
		   return 1+Math.max(maximumPath(root.left),maximumPath(root.right));
		 }
	 }

	public static void main(String[] args) {
		
		C_BinaryTree_MaxTravelPath_Height bt= new C_BinaryTree_MaxTravelPath_Height();
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
