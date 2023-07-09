import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivan", "Igorevich", "Ovchinnikov",
                        "developer","8(495)000-11-22", 50000, 1985),
                new Employee("Andrey", "Viktorovich", "Bezrukov",
                        "fitter","8(495)111-22-33", 52000, 1973),
                new Employee("Evgeniy", "Viktorovich", "Delfinov",
                        "project manager", "8(495)222-33-44", 40000, 1963),
                new Employee("Natalia", "Pavlovna", "Keks",
                        "senior developer", "8(495)333-44-55", 90000, 1990),
                new Employee("Tatiana", "Sergeevna", "Krasotkina",
                        "accountant", "8(495)444-55-66", 50000, 1983),
                new Manager("Polygraph", "Polygraphovich", "Sharikov",
                        "vice president cleaning operations", "8(495)777-77-77", 100500, 1920)
        };

        Arrays.stream(employees)
                .forEach(employee -> System.out.println(employee.getSalary()));

        System.out.println();
        System.out.println(Employee.getAverageAge(employees));
        System.out.println(Employee.getAverageSalary(employees));
        System.out.println();

        for (var employee : employees) {
            Manager.increaseSalary(employee, 0.5);
        }

        Arrays.stream(employees)
                .forEach(employee -> System.out.println(employee.getSalary()));

        System.out.println();
        Arrays.sort(employees, new AgeComparator());
        Arrays.stream(employees)
                .forEach(System.out::println);

        System.out.println();
        Arrays.sort(employees, Collections.reverseOrder(new SalaryComparator()));
        Arrays.stream(employees)
                .forEach(System.out::println);
    }
}
