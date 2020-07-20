package com.cpg.lab;

import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter age of a person: ");
			int age=sc.nextInt();
			if(age<15)
			{
				throw new ageException("age should be above 15");	
			}
		}
		catch(ageException e) {
			System.out.println(e);
		}
	}
}
class ageException extends Exception{
	ageException(String msg){
		super(msg);
	}

}
