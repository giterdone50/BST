public class bst<E extends Comparable<E>>{
	// root of tree
	Node root;

	// size of tree
	int size;
	
	bst (){
		root= null;
		size= 0;
	}

	class Node{	
		Node left;
		Node right;
		E data;

		Node(){
			left= null;
			right= null;
			data= null;
		}
	}

	// add
	public void add(E item) {
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>if the tree is empty, create the root
		if(root==null) {
			Node newNode = new Node();
			newNode.data=item;
			root = newNode;
			return;
		}
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>code for add, maybe useful to have recursive helper method
		addHelper(root, item);
	}


	public boolean addHelper(Node root, E item) {
		int value = item.compareTo(root.data);
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>if item is same as root's data means already in tree
		if(value == 0) {
			return false;
		}
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   if item smaller than root
		if(value < 0) {
			//>>>>>>>>>>>>>>>>>>>>>>>>>>>   if no left child then make a left child
			if(root.left == null) {
				Node newNode = new Node();
				root.left = newNode;
				newNode.data = item;
			}
			//  >>>>>>>>>>>>>>>>>>>>>>if there's left child keep going downwards
			else {
				addHelper(root.left, item);
			}
		}
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>if item is greater than root
		else {
			//>>>>>>>>>>>>>>>>>>>>>>>>>if no right child then make a right child
			if(root.right == null) {
				Node newNode = new Node();
				root.right = newNode;
				newNode.data = item;
			}
			//>>>>>>>>>>>>>>>>>>>>>>>>>if right child found, keep going downwards
			else {
				addHelper(root.right, item);
			}
		}
		return true;
	}
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> find element with name item in tree
	public void search(E item) {
		Node found = searchHelper(root, item);
		if(found == null) {
			System.out.println("Not in Tree");
		}
		else {
			System.out.println("Found " + found.data);
		}
	}
	
	private Node searchHelper(Node root, E item) {
		//item not in tree or first one is item
		if(root == null || root.data == item) {
			return root;
		}
		if(root.data.compareTo(item) > 0) {
			return searchHelper(root.left, item);
		}
		return searchHelper(root.right, item);
	}

	// number of elements in tree
	public void size() {
		return;

	}
	// height of the tree
	public void height() {

	}

	//minimum of subtree starting at root
	public E min(Node root) {
		return null;
	}

	//maximum of subtree starting at root
	public E max(Node root) {
		return null;
	}

	public Node predecessor(Node root, E item) {
		return null;
	}

	//different traversals of the tree


	//successor of node with element item and
	//the head of the subtree is at root

	public Node succesor(Node root, E item) {
		return null;

	}
	
	public void preorder(Node root) {
		if(root != null) {
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void inorder() {
		if(root == null) {
			System.out.println("root null");
		}
		inorderHelper(root);
	}
	
	private void inorderHelper(Node root) {
		if(root != null) {
//			System.out.println("HERE" + root.data);
			inorderHelper(root.left);
//			System.out.println("PUTT" + root.data);
			System.out.println(root.data);
			inorderHelper(root.right);
		}
	}
	
	public void postorder(Node root) {
		
	}

	//deletes the item from the tree
	public void delete(E item) {
		
	}
	
	//remove all from the tree
	public void clearAll() {
	
	}

	//check if tree is empty
	public void isEmpty() {
	
	}
	
	public static void main(String[] args) {
		//check each of the methods using at least 2 different tests
		//edge cases, all situations
		bst <Integer> newTree = new bst<Integer>();
		newTree.add(Integer.valueOf(6));
		newTree.add(Integer.valueOf(5));
		newTree.add(Integer.valueOf(3));
		newTree.add(Integer.valueOf(10));
		newTree.add(Integer.valueOf(12));
		newTree.add(Integer.valueOf(8));
		newTree.add(Integer.valueOf(9));
		newTree.inorder();
		newTree.search(Integer.valueOf(12));
	}
}