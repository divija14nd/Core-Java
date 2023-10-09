package corejava;

/*
 Write a class BinaryTree to implement binary tree data structure. For any node in the binary tree, all elements to the left must be less than the node value and all elements to the right must be greater than node value. You can store integer values in the tree. Write methods
insert(int elem) - to insert element into the binary tree
find(int elem) - return true if element found in the tree, false otherwise
printInorder() - prints all the elements in the tree using in-order tree traversal (Hint: use recursion)
*/
public class BinaryTreeImplement {

	private int data;
	private BinaryTreeImplement left;
	private BinaryTreeImplement right;

	public BinaryTreeImplement(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public void insert(int element) {
		if (element < data) {
			if (left == null) {
				left = new BinaryTreeImplement(element);
			} else {
				left.insert(element);
			}
		} else if (element > data) {
			if (right == null) {
				right = new BinaryTreeImplement(element);
			} else {
				right.insert(element);
			}
		}
	}

	public boolean find(int element) {
		if (element == data) {
			return true;
		} else if (element < data && left != null) {
			return left.find(element);
		} else if (element > data && right != null) {
			return right.find(element);
		} else {
			return false;
		}
	}

	public void printInorder() {
		if (left != null) {
			left.printInorder();
		}
		System.out.print(data + " ");
		if (right != null) {
			right.printInorder();
		}
	}

	public static void main(String[] args) {
		BinaryTreeImplement tree = new BinaryTreeImplement(50);

		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);

		tree.printInorder(); 

		System.out.println("Element 40 found: " + tree.find(40)); 
		System.out.println("Element 55 found: " + tree.find(55)); 
	}
}
