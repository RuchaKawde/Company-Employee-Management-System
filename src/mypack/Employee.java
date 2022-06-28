package mypack;

import java.util.Scanner;

public class Employee {

	public static void main(String[] a) {
		
		
		System.out.println("******************Employee System*********************");
		Scanner sc= new Scanner(System.in);
		Empdata e[];
		System.out.println("Enter number of Employees");
		 int n=Integer.parseInt(sc.nextLine());
		 e=new Empdata[n];
		
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1 Add");
			System.out.println("2 Show");
			System.out.println("3 Update");
			System.out.println("4 Delete");
			System.out.println("0 Exit");
			System.out.println("Enter your choice");
		int ch=Integer.parseInt(sc.nextLine());
        switch(ch)
        {
        case 1:
        	if(Emptask.add(e))
        	{
        		System.out.println("Employee inserted");
        	}
        	else
        	{
        		System.out.println("Employee not inserted");
        	}
			break;
        case 2:
        	Emptask.show(e);
        	break;
        case 3:
        	Emptask.upDate(e);
        	break;
        case 4:
        	Emptask.deLete(e);
        	break;
        case 0:
        	System.out.println("Thanks for visiting bank");
        	System.exit(0);
        	
		}
      
		}
   
	}

}
