package ExpenseAndSalary;

import java.util.Scanner;

public class expenses_and_salary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int limit = 50;
		System.out.print("Enter salary(int): ");
		int salary = input.nextInt();
		String exp = "null";
		int[] spt = new int[limit];

		for(int i=0; i<limit; i++) {
			System.out.print("Expense(String): ");
			exp = input.next();
			System.out.print("Spent(int): ");
			spt[i] = input.nextInt();
			if(spt[i] == -1)
				break;
			salary = salary - spt[i];
			
			System.out.println("Balance: " + salary);
			System.out.println();
		}
	
	}

}
