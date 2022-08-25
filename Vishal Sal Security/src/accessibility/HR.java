package accessibility;

import java.util.Scanner;

import main.Master;

public class HR extends Master{
	
	public static void main(String[]args) {
		HR obj =new HR();
		System.out.println(obj.GetSalViewtoHR());
		
		Scanner SetNew= new Scanner(System.in);
		System.out.println("Enter revised salary:");
		int NewSal=SetNew.nextInt();
		obj.SetSalary(NewSal);
		System.out.println(obj.GetSalViewtoHR());
	
	}
	

}
