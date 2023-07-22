import java.time.LocalDateTime;
import java.util.Arrays;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private String position;
    private String phone;
    private double salary;
    private int yearOfBirth;

    public Employee(String firstName, String middleName, String lastName,
                    String position, String phone, double salary, int yearOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.yearOfBirth = yearOfBirth;
    }

    public static double getAverageAge(Employee... employees) {
        return Arrays.stream(employees)
                .mapToInt(Employee::getYearOfBirth)
                .map(year -> LocalDateTime.now().getYear() - year)
                .average()
                .orElse(0.0);
    }

    public static double getAverageSalary(Employee... employees) {
        return Arrays.stream(employees)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
