package project_operators;

import java.util.Scanner;

public class opraters {
	int ch;
	int a;
	int b;
	int total;
	String again;
	
	Scanner sc=new Scanner(System.in);
	public void oprators() {
		System.out.println("*************operators*************");
        System.out.println("=====================================");	
        System.out.println("|              1.Addition           |");
        System.out.println("|              2.Subtraction        |");
        System.out.println("|              3.Multiplicaton      |");
        System.out.println("|              4.Division           |");
        System.out.println("|              5.Mod                |");
        System.out.println("=====================================");
		
	}
	 public void generateBill() {
		   System.out.println();
		   System.out.println("********** Thank You ************");
		   System.out.println();
		   System.out.println();
		   System.out.println("----------------------------------");
		   System.out.println("|****Your total result is : "+total+"****|");
		   System.out.println("----------------------------------");
	}
		
	
	
	
	public void choice() {
		while(true) {
		System.out.println("Enter your Choice");
		ch=sc.nextInt();
		switch (ch) {
		case 1: {   //add
			System.out.println("You have selected the Addition");
			System.out.println();
			System.out.println("Enter your First number");
			a=sc.nextInt();
			System.out.println("Enter your Second number");
			b=sc.nextInt();
			total=a+b;
			break;			
		}
		case 2: {   //sub
			System.out.println("You have selected the Subtraction");
			System.out.println();
			System.out.println("Enter your First number");
			a=sc.nextInt();
			System.out.println("Enter your Second number");
			b=sc.nextInt();
			total=a-b;
			break;			
		}
		
		case 3: {   //Multiplicaton
			System.out.println("You have selected the Multiplicaton");
			System.out.println();
			System.out.println("Enter your First number");
			a=sc.nextInt();
			System.out.println("Enter your Second number");
			b=sc.nextInt();
			total=a*b;
			break;			
		}
		case 4: {   //Division
			System.out.println("You have selected the Division");
			System.out.println();
			System.out.println("Enter your First number");
			a=sc.nextInt();
			System.out.println("Enter your Second number");
			b=sc.nextInt();
			total=a/b;
			break;			
		}
		case 5: {   //Mod
			System.out.println("You have selected the Mod");
			System.out.println();
			System.out.println("Enter your First number");
			a=sc.nextInt();
			System.out.println("Enter your Second number");
			b=sc.nextInt();
			total=a%b;
			break;			
		}
			
			
		default:
			break;
		}
		System.out.println();
		System.out.print(" Do you want to change(Y/N) : ");

		again=sc.next();
		if(again.equalsIgnoreCase("Y")) {
			choice();
		}else if (again.equalsIgnoreCase("N")) {
			generateBill();
			System.exit(1);
			
			
		}else {
			System.out.println("Invalid Choice");
		}
		
		
		
	}
	}
	
}

