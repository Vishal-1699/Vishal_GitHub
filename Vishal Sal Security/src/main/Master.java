package main;

import java.util.Scanner;

public abstract class Master {
	private int sal = 10000;  //Data Hiding
	
	public int GetSalViewtoEmployee() {       //getter method
		Scanner security=new Scanner(System.in);
		System.out.println("Enter Password: ");
        String password = security.next();
        if(password.equals("Vishal"))
		return sal;
        else
        	return 0;
	}
	
	public int GetSalViewtoHR() {
		Scanner security=new Scanner(System.in);
		System.out.println("Enter Password: ");
		String password = security.next();
		if(password.equals("Hr123"))
		return sal;
		else
			return 0;
	}
	
	public void SetSalary(int sal) {          //setter method
		Scanner security = new Scanner(System.in);
		System.out.println("Enter Password");
		String password= security.next();
		if(password.equals("Hr123"))
			this.sal=sal;
		System.out.println("Salary Updated");
		
		
	}
	
}
