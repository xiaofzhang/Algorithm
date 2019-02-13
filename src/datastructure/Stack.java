package datastructure;

public class Stack {
	private int maxSize;
	private Object[] stack;
	private int top;
	
	public Stack(int max) {
		maxSize = max;
		stack = new Object[maxSize];
		top = -1;
	}
	
	public void push(Object value) {
		stack[++top] = value;
	}
	
	public Object pop() {
		return stack[top--];
	}
	
	public Object peek() {
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	public void display() {
		while (!isEmpty()) {
			System.out.print(pop()+" ");
		}
		System.out.println("");
	}
	
	public static void check(String value) {
		int size = value.length();
		Stack stack = new Stack(size);
		
		for (int i = 0; i < size; i++) {
			char ch = value.charAt(i);
			switch (ch) {
			case '{':
			case '[':
			case '(':	
				stack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if (!stack.isEmpty()) {
					char chx = (char) stack.pop();
					if ((ch == '}' && chx != '{')
						||	(ch == ']' && chx != '[')
						||  (ch == ')' && chx != '(')) {
						System.out.println("Error: " + ch + " at " + i);
					}
				} else {
					System.out.println("Error: " + ch + " at " + i);
				}	
			default:
				break;
			}
		}
		if (!stack.isEmpty()) {
			System.out.println("Error: missing right delimiter");//delimiter:定界符
		}
	}

}
