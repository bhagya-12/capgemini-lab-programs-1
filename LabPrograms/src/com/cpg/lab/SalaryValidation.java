package com.cpg.lab;
import java.util.Scanner;
public class SalaryValidation {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter employee salary: ");
			float sal=sc.nextInt();
			if(sal<3000)
			{
				throw new employeeException("salary should be above 3000");	
			}
		}
		catch(employeeException e) {
			System.out.println(e);
		}
	}
}
class employeeException extends Exception{
	employeeException(String msg){
		super(msg);
	}


	}


