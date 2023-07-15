package stack;

import java.util.*;

public class InfixToPostfix {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산식을 입력해주세요: ");
		String poly = scanner.next();
		
		Stack<String> stack = new Stack<>();
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("^",3);
		map.put("*",2);
		map.put("/",2);
		map.put("+",1);
		map.put("-",1);
		map.put("(",0);
		
		
		for(int i=0;i<poly.length();i++) {
			char c = poly.charAt(i);
			int icp;
			int isp;
			String stackChar;
			
			switch(c){
				case '(':
					icp = 4;
					if(stack.isEmpty()) {
						stack.push(String.valueOf(c));
					}else {
						while(true) {
							if(stack.isEmpty()) {
								stack.push(String.valueOf(c));
								break;
							}
							stackChar = stack.pop();
							isp = map.get(stackChar);
							if(isp>=icp) {
								System.out.print(stackChar);
							}else {
								stack.push(stackChar);
								stack.push(String.valueOf(c));
								break;
							}
						}
					}
					break;
				case ')':
					while(!stack.isEmpty()) {
						String s = stack.pop();
						if(s.equals("(")) {
							break;
						}else {
							System.out.print(s);
						}
					}
					break;
				case '*':
					icp = 2;
					if(stack.isEmpty()) {
						stack.push(String.valueOf(c));
					}else {
						while(true) {
							if(stack.isEmpty()) {
								stack.push(String.valueOf(c));
								break;
							}
							stackChar = stack.pop();
							isp = map.get(stackChar);
							if(isp>=icp) {
								System.out.print(stackChar);
							}else {
								stack.push(stackChar);
								stack.push(String.valueOf(c));
								break;
							}
						}
					}
					break;
				case '+':
					icp = 1;
					if(stack.isEmpty()) {
						stack.push(String.valueOf(c));
					}else {
						while(true) {
							if(stack.isEmpty()) {
								stack.push(String.valueOf(c));
								break;
							}
							stackChar = stack.pop();
							isp = map.get(stackChar);
							if(isp>=icp) {
								System.out.print(stackChar);
							}else {
								stack.push(stackChar);
								stack.push(String.valueOf(c));
								break;
							}
						}
					}
					break;
				case '-':
					icp = 1;
					if(stack.isEmpty()) {
						stack.push(String.valueOf(c));
					}else {
						while(true) {
							if(stack.isEmpty()) {
								stack.push(String.valueOf(c));
								break;
							}
							stackChar = stack.pop();
							isp = map.get(stackChar);
							if(isp>=icp) {
								System.out.print(stackChar);
							}else {
								stack.push(stackChar);
								stack.push(String.valueOf(c));
								break;
							}
						}
					}
					break;
				case '/':
					icp = 2;
					if(stack.isEmpty()) {
						stack.push(String.valueOf(c));
					}else {
						while(true) {
							if(stack.isEmpty()) {
								stack.push(String.valueOf(c));
								break;
							}
							stackChar = stack.pop();
							isp = map.get(stackChar);
							if(isp>=icp) {
								System.out.print(stackChar);
							}else {
								stack.push(stackChar);
								stack.push(String.valueOf(c));
								break;
							}
						}
					}
					break;
				case '^':
					icp = 4;
					if(stack.isEmpty()) {
						stack.push(String.valueOf(c));
					}else {
						while(true) {
							if(stack.isEmpty()) {
								stack.push(String.valueOf(c));
								break;
							}
							stackChar = stack.pop();
							isp = map.get(stackChar);
							if(isp>=icp) {
								System.out.print(stackChar);
							}else {
								stack.push(stackChar);
								stack.push(String.valueOf(c));
								break;
							}
						}
					}
					break;
				case '$':
					while(!stack.isEmpty()) {
						System.out.print(stack.pop());
					}
					break;
				default:
					System.out.print(c);
			}
		}
	}

}
