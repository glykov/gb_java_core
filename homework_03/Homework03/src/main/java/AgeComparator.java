import java.time.LocalDateTime;
import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return (LocalDateTime.now().getYear() - e1.getYearOfBirth()) -
                (LocalDateTime.now().getYear() - e2.getYearOfBirth());
    }
}
