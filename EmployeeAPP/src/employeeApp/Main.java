package employeeAppp;

public class Main {
  private static void workWithData() {
    HealthPlan h1 = new HealthPlan("My Health 1");
    HealthPlan h2 = new HealthPlan("My Health 2");

    Company c1 = new Company("Company A", 100);
    Company c2 = new Company("Company B", 100);

    Employee emp1 = new Employee("Steve", "Green", 45000, Boolean.TRUE, c1.id, h1.getId());
    Employee emp2 = new Employee("May", "Ford", 80000, Boolean.TRUE, c1.id, h2.getId());

    Employee emp3 = new Employee("Doug", "Jones", 75000, Boolean.TRUE, c2.id, h2.getId());
    Employee emp4 = new Employee("John", "Jones", 80000, Boolean.FALSE, c2.id, h1.getId());
    Employee emp5 = new Employee("My", "Name", 45000, Boolean.TRUE, c2.id, h2.getId());

    System.out.println("*** Query Data");

    System.out.println(c1);
    System.out.println();
    System.out.println("Original: " + c1.debt);
    c1.debt = -c1.debt;
    System.out.println("Negative: " + c1.debt);
    System.out.println();
    c1.debt = -c1.debt;

  }

  public static void main(String[] args) {
    workWithData();
  }
}