import java.io.*;

public class EmployeeTest {
  public static void main(String args[]) {
    Employee empOne = new Employee("Ada Lovelace");
    Employee empTwo = new Employee("Grace Hopper");

    empOne.empAge(26);
    empOne.empDesignation("Senior Software Engineer");
    empOne.empSalary(3000);
    empOne.printEmployee();

    empTwo.empAge(21);
    empTwo.empDesignation("Software Engineer");
    empTwo.empSalary(2000);
    empTwo.printEmployee();
  }
}