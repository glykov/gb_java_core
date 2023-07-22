public class Manager extends Employee {

    public Manager(String firstName, String middleName, String lastName, String position, String phone, double salary, int yearOfBirth) {
        super(firstName, middleName, lastName, position, phone, salary, yearOfBirth);
    }

    static void increaseSalary(Employee employee, double amount) {
        if (!(employee instanceof Manager)) {
            employee.setSalary(employee.getSalary() + amount);
        }
    }

}
