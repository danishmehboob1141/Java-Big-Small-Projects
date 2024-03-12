package Stack;

import java.util.Scanner;
									// ARRAY IMPLEMENTATION OF STACK
public class run extends stk{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("PUSH - U | POP - O | PEEK - E");
		System.out.println("Capacity " + capacity);
		char ch = 0;
		do {
			System.out.println();
			System.out.print("Enter your choice: ");
			ch = s.next().charAt(0);
			if(ch == 'u' || ch == 'U') {
				System.out.print("PUSH: ");
				String push = s.next();
				push(push);
				System.out.println("Capacity: " + --capacity);
			} else if(ch == 'o' || ch == 'O') {
				pop();
				System.out.println("Capacity: " + ++capacity);
			} else if(ch == 'e' || ch == 'E') {
				peek();
			} else if(ch == 'd' || ch == 'D') {
				display();
			} else
				break;
		} while(ch != 's');
		
	}

}
