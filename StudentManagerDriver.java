

package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagerDriver {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		StudentManager manager = new StudentManager(); // new manager object
		
		//instantiating four new student objects
		Student stu1 = new Student(1, "Niccole", "vor898@algonquin.com", 99);
		Student stu2 = new Student(2, "Alice", "Alice@gmail.com", 87);
		Student stu3 = new Student(3, "Bobby", "Bobby@gmail.com", 42);
		Student stu4 = new Student(4, "Shelby", "Virmiceil@gmail.com", 63);
		
		
		//declaring a array 
		Student[] studentArray = new Student[4];
		
		//adding the instantiated object to the array
		studentArray[0] = stu1;
		studentArray[1] = stu2;
		studentArray[2] = stu3;
		studentArray[3] = stu4;
		
		//adding the instantiated objects to the arraylist 
		manager.addStudent(stu1);
		manager.addStudent(stu2);
		manager.addStudent(stu3);
		manager.addStudent(stu4);
		
		
		// for loop to run through the array and then print the output
		System.out.println("Array before sorting: ");
		for(Student stu : studentArray) {
			System.out.println(stu);
		}
		System.out.println(); // empty line to break
		
		
		// sorting the array using Arrays.sort();
		System.out.println("Array after sorting: ");
		Arrays.sort(studentArray);
		for(Student stu : studentArray) {
			System.out.println(stu);
		}
		System.out.println(); // empty line to break
		
		
		//calling the displayStudentList method from the StudentManager class
		System.out.println("ArrayList before sorting: ");
		manager.displayStudentList();
		
		System.out.println(); // empty line to break
		
		System.out.println("ArrayList after sorting: ");
		manager.sortStudentList(); // calling the sort method on the arraylist in the student manager class
		manager.displayStudentList(); // displaying array after sorting.

	    keyboard.close();

	}
	

}
