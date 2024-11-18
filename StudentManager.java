package assignment2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> studentList = new ArrayList<>();
    
    // Add instatiated objects from the main method, to the arraylist.
    public void addStudent(Student stu) {
    	studentList.add(stu);
//    	System.out.println(stu.getStuName() + " has been added to the student list.");
    }
    
    //remove from the arrayList by chosen ID 
    public void removeFromStudentList(Scanner scanner) {
    	System.out.println("Enter student ID to remove from the list: ");
    	int removeStuID = scanner.nextInt();
    	boolean studentRemoved = false;
    	
    	for (int i = 0 ; i < studentList.size() ; i++) { 
    		if (studentList.get(i).getStudentID() == removeStuID) {
    			studentList.remove(i);
    			System.out.println("Student with ID Number " + removeStuID + " was removed from the list.");
    			studentRemoved = true;
    			break;
    		}
    	}   	
    	if (!studentRemoved) { 
    		System.out.println("ID was not found.");
    	}
    }
    
    //sort arrayList
    public void sortStudentList() {
    	Collections.sort(studentList);
    	System.out.println("Students have been sorted");
    }
    
    
    //display arrayList
    public void displayStudentList() {
    	for(Student stu : studentList) {
        	System.out.println(stu.getStudentID() + ": " + stu.getStuName() + " - " + stu.getEmail() + " , Grade: " + stu.getGrade());
    }
    }

}
