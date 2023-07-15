package stack;

import java.util.*;

public class DoubleStack {
	
	public static void push(Stack stack1 ,Stack stack2, int item,int stackSize) {
		
		if(stack1.top >= stackSize/2) {
			stack2.push(item);
		}else {
			stack1.push(item);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("스택의 크기를 지정해주세요: ");
		int stackSize = scanner.nextInt();
		
		Stack<Integer> firstStack = new Stack<>();
		Stack<Integer> secondStack = new Stack<>();
		
		while(scanner.hasNext()){
			System.out.println("Stack에 넣을 값을 입력해주세요: ");
			int pushNumber = scanner.nextInt();
			push(firstStack,secondStack,pushNumber,stackSize);
		}
		
		System.out.println("First Stack");
		while(!firstStack.isEmpty()) {
			System.out.println(firstStack.pop());
		}
		System.out.println("Second Stack");
		while(!secondStack.isEmpty()) {
			System.out.println(secondStack.pop());
		}
		
	}

}
