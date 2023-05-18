package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project1_group1 {

	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner inputScanner = new Scanner(System.in);
		
		//get inputs from the user
		System.out.print("Enter the year: ");
		int inputYear = inputScanner.nextInt();
		System.out.print("Enter the gender: ");
		char inputGender = inputScanner.next().charAt(0);
		System.out.print("Enter the name: ");
		String inputName = inputScanner.next();
		
		// Basic Validation			
		if(validation(inputYear, inputGender, inputName)) {
			//call nameRank function
			String result =	nameRank(inputYear, inputGender, inputName);
			System.out.println(result);
		}
		
	}
	

	
	// set nameMatrix 
	public static String[][] nameMatrix(char gender) throws FileNotFoundException{
		//initial 1 two-dimensional arrays
		String[][] babyNames = new String[10][1000];
		
		for(int i=0; i<10; i++) {
			// read the file
			File file = new File("./NameRankingsData/babynameranking" + (2001+i) + ".txt");
			Scanner fileScanner = new Scanner(file);
			String[] nameStrings = new String[1000];
			
			for(int j=0; j<1000;) {
				while (fileScanner.hasNextLine()) {
					//use split to convert string to array
					nameStrings = fileScanner.nextLine().split("\\s");	
					
					//if user input F return girl matrix; if M return boy matrix
					if (Character.toLowerCase(gender) == 'f') {
						babyNames[i][j] = nameStrings[3];
					}
					else if (Character.toLowerCase(gender) == 'm'){
						babyNames[i][j] = nameStrings[1];
					}
					j++;
				}		
			}
			fileScanner.close();
		}
		return babyNames;
	}
	
	//nameRank method to display the result
	public static String nameRank(int year, char gender, String name) throws FileNotFoundException {			
		//check if the name exist in the matrix
		for(int m = 0; m<1000; m++) {
			if (nameMatrix(gender)[(year-2001)][m].equalsIgnoreCase(name)) {
				return "The name " + name + " is ranked #" + (m+1) + " in year " + year;
			}
		}
		return "The name " + name + " is not ranked in year " + year;
	}
	
	public static boolean validation(int inputYear, char inputGender, String inputName) {
		
		if(inputYear<2001 || inputYear>2009) {
			System.out.println("Please input valid year!");
			return false;
		}
		
		if(!(Character.toLowerCase(inputGender) == 'f' || Character.toLowerCase(inputGender) == 'm') ) {
			System.out.println("Please input valid  baby gender!");
			return false;
		}
		
		if(inputName.isBlank() && inputName.isEmpty()) {
			System.out.println("Please input valid baby name !");
			return false;
		}
		return true;
		
	}
}
