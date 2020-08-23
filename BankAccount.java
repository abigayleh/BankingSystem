import java.util.Scanner;

public class BankAccount {

	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	BankAccount(String name, String id){
		customerName = name;
		customerID = id;
	}
	
	void getID() {
		System.out.println("Your customer ID is " + customerID);
	}
	
	void changeName(String name) {
		
		customerName = name;
		System.out.println("Your new name is " + customerName);
	}
	
	void deposit(int amount) {
		balance += amount;
		previousTransaction = amount;
	}
	
	void withdraw(int amount) {
		balance -= amount;
		previousTransaction = -amount;
	}
	
	void getPreviousTransaction() {
		
		if(previousTransaction > 0)
			System.out.println("Deposited: " + previousTransaction);
		else if(previousTransaction < 0)
			System.out.println("Withdrew: " + -previousTransaction);
		else
			System.out.println("No previous transaction");
	}
	
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("\n");
		
		System.out.println("A: Check Balance");
		System.out.println("B: Deposit");
		System.out.println("C: Withdraw");
		System.out.println("D: Previous transaction");
		System.out.println("E: Get Customer ID");
		System.out.println("F: Exit");
		
		do
		{
			System.out.println("================================================================");
			System.out.println("Enter an option");
			System.out.println("================================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case 'A':
				System.out.println("------------------------------------------------------------");
				System.out.println("Balance is " + balance);
				System.out.println("------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("------------------------------------------------------------");
				System.out.println("Enter an amount to deposit");
				System.out.println("------------------------------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("------------------------------------------------------------");
				System.out.println("Enter an amount to withdraw");
				System.out.println("------------------------------------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("------------------------------------------------------------");
				getPreviousTransaction();
				System.out.println("------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("------------------------------------------------------------");
				getID();
				System.out.println("------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'F':
				System.out.println("*************************************************************");
				break;
			
			default:
				System.out.println("Invalid option, please re-enter");
				break;
							
			}
		} while(option != 'F');
		
		System.out.println("Thank you for using our services! Have a nice day");
	}
}
