package lambdaBonus;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Trihex", 5));
        list.add(new Employee("Kubasek", 6));
        list.add(new Employee("Alex", 2));
        list.add(new Employee("Popek", 1));
        System.out.println(list.stream()
                .filter((employee) -> employee.getScore() >= 3)
                .map((employee) -> employee.getScore())
                .reduce(0.0,Double::sum));
    }

}
