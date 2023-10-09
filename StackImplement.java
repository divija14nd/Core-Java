package corejava;

/*
Write a class called Stack to implement the Stack data structure. You can store integers in the stack. In the constructor, pass a parameter to specify the size of the stack. Write two methods, push() - to push elements into the stack,  and pop() - to pop the element off the stack - with appropriate parameters and return values. 
If stack is full, a push() should print “Push failed - stack overflow error”
If stack is empty, a pop() should print “Pop failed - stack empty”
*/
public class StackImplement {

	public int size;
	public int top;
	public int[] stackArray;

	public StackImplement(int size) {

		this.size = size;
		this.stackArray = new int[size];
		this.top = -1;
	}

	public void push(int element) {
		if (top < size - 1) {
			stackArray[++top] = element;
		} else {
			System.out.println("Push failed - stack overflow error");
		}

	}

	public int pop() {
		if (top != -1) {
			return stackArray[top--];
		} else {
			System.out.println("Pop failed - stack empty");
			return -1;
		}
	}

	public void printStack() {
		System.out.print("Stack: ");
		for (int i = 0; i <= top; i++) {
			System.out.print(stackArray[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		StackImplement stack = new StackImplement(5);

		stack.push(3);
		stack.push(2);
		stack.push(2);
		stack.push(2);
		stack.push(2);

		stack.printStack();
		stack.push(2);
		stack.printStack();

		stack.pop();
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.printStack();
	}
}
