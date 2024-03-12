package CGPA;

import java.util.Scanner;

public class CGPA {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int count=0, capacity=1, records=0;
		double gpa, average, crd, cgpa=0, tot_crd=0;
		char yesno;
		String course = null, grade = null;
		String[] COURSE=null, GRADE=null;
		double[] GPA = null;
		
		while (true) {
			System.out.print("Do you want to add record(y/n)? ");
			yesno = s.next().charAt(0);
			if(yesno == 'n' || yesno == 'N')
				break;
			System.out.print("CourseTitle? ");
			course = s.next();
			System.out.print("Crd Hr? ");
			crd = s.nextInt();
			if(crd == -1)
				break;
			System.out.print("Score? ");
			gpa = s.nextDouble();
//			if(gpa == -1)
//				break;
			if(crd == 3)
				gpa = gpa * 3;
			else if(crd == 2)
				gpa = gpa * 2;
			
			cgpa = cgpa + gpa;
			tot_crd = tot_crd + crd;
			
			COURSE = new String[capacity];
			GPA = new double[capacity];
			GRADE = new String[capacity];
			
			COURSE[count] = course;
			GPA[count] = gpa;
			GRADE[count] = grade;
			
			records ++;			count ++;			capacity ++;
			
			System.out.println();
		}
		
		average = cgpa / records;
		System.out.printf("CGPA = %.2f", cgpa / tot_crd);
	}

}


//if(gpa == 4) 
//grade = "B";
//else if(gpa == 2.5)
//grade = "C +";
//else if(gpa == 2)
//grade = "C";

//System.out.println("COURSE---GPA---GRADE");
//for(int i=0; i<count; i++)
//System.out.println(COURSE[i] + "---" + GPA[i] + "---" + GRADE[i]);
//System.out.println("Records entered: " + records);
//System.out.println("Total CHR = " + tot_crd);


