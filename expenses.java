package ExpenseAndSalary;

import java.util.Scanner;

public class expenses {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("\n---------------EXPENSES & COSTS---------------\n");
		String expense;
		int amount = 0;
		int sum = 0;
		int count = 0;
		while (amount != -1) {
			System.out.println();
			System.out.print("Expense/Item: ");
			expense = input.next();
			System.out.print("Cost: ");
			amount = input.nextInt();
			if(amount != -1) {
				sum = sum + amount;
			}
			System.out.println("Total by now: " + sum);
			count ++;
			if(amount == -1) {
				count --;
				break;
			}
		}
		for(double i=0; i<1000000; i+=.003);
		System.out.println("\nNumber of expenses: " + count);
		System.out.println("Total cost        : " + sum);
	}

}
