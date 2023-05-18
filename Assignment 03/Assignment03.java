/*
 * @author Basavraj Jaliminche (8800149)
 * PROG8580 - Computer Programming - Section 1
 * Assignment 3
 */
package Assignments;

public class Assignment03 {

	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500.0);
		account.deposit(3000.0);
		System.out.println("Balance is : $" + account.getBalance());
		System.out.println("Monthly Interest is : " + account.getMonthlyInterest());
		System.out.println("Date Created is : " + account.getDateCreated());

	}

}
