/* Basavraj Jaliminche
 * id- 8800149
 * Assignment 4
 * PROG8580-Computer Programming
 */

package Assignment4;

import java.util.Scanner;

public class encasptime {

	public static void main(String[] args) throws CloneNotSupportedException {

		// scanner class
		Scanner sc = new Scanner(System.in);

		// defining variables
		int hrs, mins, secs;

		// Taking input from the user

		System.out.print("<sample run>\n");
		System.out.print("Enter time1 (hour minute second): ");

		hrs = sc.nextInt();
		mins = sc.nextInt();
		secs = sc.nextInt();

		time Time1 = new time(hrs, mins, secs);

		// for taking output used tostring method
		System.out.println(Time1.toString());

		System.out.println("Elapsed seonds in Time 1: " + Time1.getSeconds());

		System.out.println("Enter Time 2 (Elapsed Time): ");

		long mills = sc.nextInt();

		time Time2 = new time(mills);

		System.out.println(Time2);

		System.out.println("Elapsed seconds in Time 2: " + Time2.getSeconds());

		System.out.println("Time 1.compareTo(Time 2)? " + Time1.compareTo(Time2));

		time T3 = Time1.Clone();

		System.out.println("Time 3 is created as a clone of Time 1 Time1.compareTo(Time 3)? " + Time1.compareTo(T3));
		System.out.print("<End Saple Run>");
		sc.close();
	}

}
