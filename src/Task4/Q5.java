package Task4;

import java.util.LinkedList;

public class Q5 {
	private LinkedList<Integer> stack;

	public Q5() {
		this.stack = new LinkedList<>();
	}

	public void push(int element) {
		stack.push(element);
		System.out.println("Pushed element: " + element);
	}

	public int pop() {
		if (stack.isEmpty()) {
			throw new IllegalStateException("Stack is empty. Cannot pop.");
		}
		return stack.pop();
	}

	public void displayStack() {
		System.out.println("Current elements in stack: " + stack);
	}

	public static void main(String[] args) {
		Q5 stackExample = new Q5();

		stackExample.push(10);
		stackExample.push(20);
		stackExample.push(30);
		stackExample.displayStack();

		System.out.println("Popped element: " + stackExample.pop());
		System.out.println("Popped element: " + stackExample.pop());
		stackExample.displayStack();

		System.out.println("Popped element: " + stackExample.pop());
		stackExample.displayStack();

	}
}