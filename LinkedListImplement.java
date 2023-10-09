package corejava;

/*
Write a class called LinkedList to implement a Linked List data structure. You can store integer values in the linked list. Write methods 
add() -> to add an element to the end of the linked list
insertAt(int index) -> to insert element at the specified index
remove() -> to remove element from the end of the linked list
removeAt(int index) -> to remove element at the specified index
print() -> to print all elements of the linked list
find(int elem) -> returns the index of the elem if found, -1 otherwise
*/

public class LinkedListImplement {

	private Node head;
	private int size;

	public LinkedListImplement() {
		head = null;
		size = 0;
	}

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		size++;
	}

	public void insertAt(int index, int data) {
		if (index < 0 || index > size) {
			System.out.println("Invalid index");
			return;
		}
		Node newNode = new Node(data);
		if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
		size++;
	}

	public void remove() {
		if (size == 0) {
			System.out.println("The linked list is empty");
			return;
		}
		if (size == 1) {
			head = null;
		} else {
			Node current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
		size--;
	}

	public void removeAt(int index) {
		if (index < 0 || index >= size) {
			System.out.println("Invalid index");
			return;
		}
		if (index == 0) {
			head = head.next;
		} else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
		}
		size--;
	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public int find(int elem) {
		Node current = head;
		int index = 0;
		while (current != null) {
			if (current.data == elem) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}

	public static void main(String[] args) {
		LinkedListImplement linkedList = new LinkedListImplement();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		linkedList.print();

		linkedList.insertAt(1, 4);
		linkedList.print();

		linkedList.remove();
		linkedList.print();

		linkedList.removeAt(2);
		linkedList.print();

		int index = linkedList.find(4);
		if (index != -1) {
			System.out.println("Element 4 found at index " + index);
		} else {
			System.out.println("Element not found");
		}
	}
}
