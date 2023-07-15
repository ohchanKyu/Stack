package stack;

import java.util.*;

public class MultipleStack {

	public static void push(int stack[] , int item, int stackPoint[][],int insertNum) {
		
		if(stackPoint[insertNum][1] == stackPoint[insertNum+1][0]) {
			System.out.println("Full");
		}else {
			stack[stackPoint[insertNum][1]] = item;
			stackPoint[insertNum][1]++;
		}
	}
	
	public static int pop(int stack[] , int stackPoint[][], int deleteNum) {
		
		if(stackPoint[deleteNum][0] == stackPoint[deleteNum][1]) {
			System.out.println("Empty");
			return -1;
		}else {
			stackPoint[deleteNum][1]--;
			return stack[stackPoint[deleteNum][1]];
		}
	}
	
	public static void main(String[] args) {
		
		int stack[] = new int[50];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Stack의 크기를 입력해주세요: ");
		
		int stackSize = scanner.nextInt();
		
		int stackNum = (stack.length / stackSize);
		
		int stackPoint[][] = new int[stackNum][2];
		
		for(int i=0;i<stackPoint.length;i++) {
			for(int j=0;j<stackPoint[i].length;j++) {
				stackPoint[i][j] = stackNum*(i);
			}
		}
		
		//push
		push(stack,10,stackPoint,0);
		push(stack,11,stackPoint,0);
		push(stack,12,stackPoint,0);
		push(stack,13,stackPoint,0);
		push(stack,14,stackPoint,0);
		push(stack,15,stackPoint,0);
		//pop
		System.out.println(pop(stack,stackPoint,0));
		System.out.println(pop(stack,stackPoint,0));
		System.out.println(pop(stack,stackPoint,0));
		System.out.println(pop(stack,stackPoint,0));
		System.out.println(pop(stack,stackPoint,0));
		
		
	
	}

}
