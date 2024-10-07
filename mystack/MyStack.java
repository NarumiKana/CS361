/**
 * 
 */
package mystack;

/**
 * @author Narumi Aguirre-Kanashiro 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if (theStack == null) {
			System.out.println("Stack is empty, there is nothing to pop.");
			return null;
		}
		T value = theStack.val;
		theStack = theStack.next;
		return value;
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> newNode = new MyNode<>(v, theStack);
		theStack = newNode;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> intStack = new MyStack<>();
		intStack.push(1);
		intStack.push(2);
		System.out.println("Popped from integer stack: " + intStack.pop());
		intStack.push(5);
		System.out.println("Popped from integer stack: " + intStack.pop());
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Person> personStack = new MyStack<>();
		person p1 = new Person("Narumi Aguirre-Kanashiro");
		personStack.push(p1);
		person p2 = new Person("Christelle Scharff");
		personStack.push(p2);
		System.out.println("Popped from person stack: " + personStack.pop().getName());
	}

}
