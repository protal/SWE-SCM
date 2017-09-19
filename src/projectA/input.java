package projectA;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Employee Name : ");
		String empName = in.next();
		System.out.print("Employee Number : ");
		int empNum = in.nextInt();
		System.out.print("Salaly : ");
		double salaly = in.nextInt();
		System.out.print("Sale : ");
		double sale = in.nextInt();
		
		
		salary salaly1 = new salary() ;
		double realSalary =  salaly1.calSalary(salaly,sale);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Number : " + empNum);
		System.out.println("total : " + realSalary);
		
	}
	

}
