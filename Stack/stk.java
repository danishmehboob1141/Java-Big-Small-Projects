package Stack;

public class stk {

	static int capacity = 10;
	static int count = 0;
	static String stack[] = new String[capacity];
	static int top = 1;
	static void push(String data) {
		stack[top] = data;
		top ++;
		++count;
	}
	static void pop() {
		top--;
		System.out.println("Popped '" + stack[top] + "'");
		stack[top] = null;
		--count;
	}
	static void peek() {
		top--;
		System.out.println("At the top is " + stack[top]);
		top++;
	}
	static void display() {
		for(int i=count; i>0; i--)
			System.out.println(stack[i]);
	}
}
