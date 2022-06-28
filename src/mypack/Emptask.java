package mypack;
import java.util.Scanner;
public class Emptask {

	 static boolean add(Empdata e[])
	 {
		 
		 Scanner sc= new Scanner(System.in);
		 
		 for (int i=0;i<e.length;i++)
		 {
			 
			 e[i] = new Empdata();
			 System.out.println("Employee Data"+(i+1));
			 System.out.print("Enter Id:");
			 e[i].setId(Integer.parseInt(sc.nextLine()));
			 System.out.print("Enter Name:");
			 e[i].setName(sc.nextLine());
			 System.out.print("Enter Salary:");
			 e[i].setSalary(Double.parseDouble(sc.nextLine()));
			  
		 }  
		 return true;
	 }
	 static void show(Empdata e[])
	{
		 int t=0;
	 System.out.println("Id\tName\tSalary");
	  for (int i=0;i<e.length;i++)
		 {
			 
			if(e[i].getId()!=0)
		  System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSalary());
			 else
			 {
			 t++;
			 }
		 }	
	  if(t==e.length)
		 {System.out.println("Entered id is incorrect");}
	  
	 }
      static void upDate(Empdata e[])
      {
      int t=0;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter Employee Id:");
      int c=Integer.parseInt(sc.nextLine());
       for (int i=0;i<e.length;i++)
		 {
		 if(c==e[i].getId())
		 {
		 System.out.println("What do you want to update?\n1.Name\n2.Salary\nEnter your choice:");
		 int b=Integer.parseInt(sc.nextLine());
		 switch(b)
		 {
		 case 1:
		 System.out.println("Your current name is:"+e[i].getName());
		 System.out.print("Enter your correct name:");
		 String updtname=sc.nextLine();
		 System.out.println("Your old name was "+e[i].getName()+"Your new name is "+updtname);
		 e[i].setName(updtname);
		 System.out.println("Name updated successfully");
		 break;
		 case 2:
		 System.out.println("Your current name is:"+e[i].getSalary());
		 System.out.print("Enter your correct Salary:");
		 double updtsal=(Double.parseDouble(sc.nextLine()));
		 System.out.println("Your old Salary was "+e[i].getSalary()+"Your new Salary is "+updtsal);
		 e[i].setSalary(updtsal);
		 System.out.println("Salary updated successfully");
		 break;
		 }
		 }
		 else
		 {
		 t++;
		 }
		 }
		 if(t==e.length)
		 {System.out.println("Entered id is incorrect");}
        
      
      }
      static void search(Empdata e[])
      {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter Employee Id:");
      int c=Integer.parseInt(sc.nextLine());
      System.out.println("Id\tName\tSalary");
       for (int i=0;i<e.length;i++)
		 {
		 if(c==e[i].getId())
		 {
		 System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSalary());
		 }
      }
      
      }
      
      static void deLete(Empdata e[])
      {
    	  Scanner sc= new Scanner(System.in);
          System.out.println("Enter Employee Id:");
          int c=Integer.parseInt(sc.nextLine());
          for (int i=0;i<e.length;i++)
 		 {
 		 if(c==e[i].getId())
 		 {
 		 e[i].setId(0);
 		 }
       }
          
      }
      

}
