//Given Employee class with id and name
//Create a method to add employee
//Sort employees by name
//Sort employees by id

package Questions;

import java.util.*;

//Step 1: Employee Class Definition
class Employee {
 int id;
 String name;

 // Constructor to initialize Employee object
 public Employee(int id, String name) {
     this.id = id;
     this.name = name;
 }

 // To display the employee details
 @Override
 public String toString() {
     return "Employee{id=" + id + ", name='" + name + "'}";
 }
}

public class Emp {

 // Step 2: Method to add an employee to the list
 public static void addEmployee(List<Employee> employees, Employee emp) {
     employees.add(emp);
 }

 // Step 3: Sort Employees by Name (Alphabetical Order)
 public static void sortByName(List<Employee> employees) {
     Collections.sort(employees, new Comparator<Employee>() {
         @Override
         public int compare(Employee e1, Employee e2) {
             return e1.name.compareTo(e2.name);
         }
     });
 }

 // Step 4: Sort Employees by ID (Ascending Order)
 public static void sortById(List<Employee> employees) {
     Collections.sort(employees, new Comparator<Employee>() {
         @Override
         public int compare(Employee e1, Employee e2) {
             return Integer.compare(e1.id, e2.id);
         }
     });
 }

 public static void main(String[] args) {
     // List to store employees
     List<Employee> employees = new ArrayList<>();

     // Adding Employees
     addEmployee(employees, new Employee(3, "Alice"));
     addEmployee(employees, new Employee(1, "Bob"));
     addEmployee(employees, new Employee(2, "Charlie"));

     // Sorting by Name
     System.out.println("Employees sorted by Name:");
     sortByName(employees);
     for (Employee emp : employees) {
         System.out.println(emp);
     }

     // Sorting by ID
     System.out.println("\nEmployees sorted by ID:");
     sortById(employees);
     for (Employee emp : employees) {
         System.out.println(emp);
     }
 }
}

