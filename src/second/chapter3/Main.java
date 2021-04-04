package second.chapter3;

public class Main {
    public static void main(String[] args) {
        // THIRD CHAPTER
        // Task #1
        Employee emp1 = new Employee("emp1","emp1", 25000);
        Employee emp2 = new Employee("emp2","emp2", 50000);
        Employee emp3 = new Employee("emp3","emp3", 75000);

        System.out.println("Task #1\nFirst name: " + emp1.getFirstName() + ", second name: " + emp1.getLastName() + ", salary: " + emp1.getMeasurable());
        System.out.println(emp2.toString());
        System.out.println("Measurable.average: " + Measurable.average(new Measurable[]{emp1,emp2,emp3}));

        // Task #2
        Measurable[] employees = new Employee[]{emp1,emp2,emp3};
        System.out.println("\nTask #2\nMax salary: " + Measurable.largest(employees));
    }
}
