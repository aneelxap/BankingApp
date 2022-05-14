package Banking;

import java.util.Scanner;

abstract class Bank{
	 public String Bname = "State Bank Of India";
	 public String IFSC_code = "SBIN19000";
	 
	 public void bankDetails() {
		 System.out.println("Banks name is: "+Bname +" "+"IFSC code is :"+ IFSC_code);
	 }
	abstract  void deposit();
	abstract void withdraw() ;
    abstract void checkbal();
	 
}
 //password 1234
 class bankService extends Bank{
	 private int password=1234;
	 int pass;
	 private double bal=5000;
	 private double money=0;
	 Scanner sc = new Scanner(System.in);
	 
	 void deposit() {
		 
		 System.out.println("enter your password");
		 pass = sc.nextInt();
		 if(pass == password) {
			  System.out.println("Enter amount to Deposit");
			  money = sc.nextDouble();	
			  bal+=money;
			  System.out.println("Sucessfully Deposited: "+ "$ "+money); 
		 }}
	 
	 
	 
	 
	 void withdraw() {
		 System.out.println("enter your password");
		 pass = sc.nextInt();
		 if(pass == password) {
			  System.out.println("Enter amount to Withdraw");
			  money = sc.nextDouble();	
			  if(bal < money) {
				  System.out.println("InSufficient Balance");
			  }
			  else {
				  bal-=money;
				  System.out.println("You Withdraw: "+ "$ "+money); 
			  }}
		
		 }
	 
	 
	 
	 
	 void checkbal(){
	 System.out.println("enter your password");
	  pass = sc.nextInt();
	 if(pass == password) {
		 System.out.println("Hello User your Balance is : $" +bal );
	 }
	 
 }
 }
 
 

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		bankService obj = new bankService();
		obj.bankDetails();
		int choice; 
			
		do {
			System.out.println("1: Deposit");
			System.out.println("2: Withdraw");
			System.out.println("3: Checkbalance");
			System.out.println("4: Exit");
			choice = sc.nextInt();
			
			
			switch (choice) {
			 
			case 1:
				obj.deposit();
				break;
			case 2:
				obj.withdraw();
				break;
			case 3:
				obj.checkbal();
				break;
			case 4:
				System.out.println("Thanks for using our Service");
				choice=0;
				break;
			}
		}
		
		while(choice !=0);
		

	}

}
