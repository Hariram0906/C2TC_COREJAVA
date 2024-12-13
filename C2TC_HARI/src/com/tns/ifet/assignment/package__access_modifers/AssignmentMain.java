package com.tns.ifet.assignment.package__access_modifers;
import com.tns.ifet.assignment.package__access_modifers.Manager;
import com.tns.ifet.assignment.package__access_modifers.Developer;
import com.tns.ifet.assignment.package__access_modifers.EmployeeUtilities;
public class AssignmentMain {
	public static void main(String[] args) {
		   Manager manager = new Manager("John", 101, 90000, "Sales"); 
	        Developer developer = new Developer("Alice", 102, 80000, "Java"); 
	        EmployeeUtilities.printEmployeeDetails(manager); 
	        EmployeeUtilities.printEmployeeDetails(developer); 
	}

}
