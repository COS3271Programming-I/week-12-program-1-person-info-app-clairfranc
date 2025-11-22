package week12;

import java.util.Scanner;

// Claire Francis, Week12Program1, 11/21/2025

public class Week12 {

		// Attributes
	    private String firstName;
	    private String lastName;
	    private String gender;
	    private int age;
	    private double weight;
	    private double height;
	    private String ethnicGroup;
	    private String religion;

	    // Constructor
	    public Week12(String firstName, String lastName, String gender, int age,
	                  double weight, double height, String ethnicGroup, String religion) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.gender = gender;
	        this.age = age;
	        this.weight = weight;
	        this.height = height;
	        this.ethnicGroup = ethnicGroup;
	        this.religion = religion;
	    }

	    // Method to display info neatly
	    public void printInfo() {
	        System.out.println("\n----- PERSON INFORMATION -----");
	        System.out.println("Name: " + firstName + " " + lastName);
	        System.out.println("Gender: " + gender);
	        System.out.println("Age: " + age);
	        System.out.println("Weight: " + weight + " lbs");
	        System.out.println("Height: " + height + " inches");
	        System.out.println("Ethnic Group: " + ethnicGroup);
	        System.out.println("Religion: " + religion);
	        System.out.println("--------------------------------");

	}


public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Gather user input
    System.out.print("Enter first name: ");
    String firstName = input.nextLine();

    System.out.print("Enter last name: ");
    String lastName = input.nextLine();

    System.out.print("Enter gender: ");
    String gender = input.nextLine();

    System.out.print("Enter age: ");
    int age = input.nextInt();

    System.out.print("Enter weight (in lbs): ");
    double weight = input.nextDouble();

    System.out.print("Enter height (in inches): ");
    double height = input.nextDouble();

    input.nextLine(); // clear newline

    System.out.print("Enter ethnic group: ");
    String ethnicGroup = input.nextLine();

    System.out.print("Enter religion: ");
    String religion = input.nextLine();

    // Create person object
    Week12 person = new Week12(firstName, lastName, gender, age, weight, height, ethnicGroup, religion);

    // Print stored information
    person.printInfo();

    input.close();
}
}
