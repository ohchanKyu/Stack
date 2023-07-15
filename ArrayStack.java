package stack;

import java.util.*;

class Stack<T>
{
	int top=0;
	Object stack[] = new Object[20];
	public void push(Object item) {
		
		if(top>=stack.length) {
			System.out.println("Full Stack");
		}
		stack[top] = item;
		top++;
	}
	public T pop() {
		
		if(top<0) {
			return null;
		}
		top--;
		return (T)stack[top];
	}
	public void top() {
		if(top > 0) {
			System.out.println(stack[top-1]);
		}
	}
	public boolean isEmpty() {
		if(top<=0) {
			return true;
		}else {
			return false;
		}
	}
}

public class ArrayStack {

	
	public static void main(String[] args) {
		
		Stack<Integer> intStack = new Stack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.top();
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.isEmpty());
	}

}
