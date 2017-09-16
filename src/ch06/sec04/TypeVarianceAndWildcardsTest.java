package ch06.sec04;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TypeVarianceAndWildcardsTest {

    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        employees[0] = new Employee();
        employees[1] = new Employee();

        printAll(employees, employee -> employee.getSalary() > 100);
        printAll(employees, employee -> employee.toString().length() % 2 == 0);
    }

    public static void printNames(ArrayList<? extends Employee> staff) {

        for (int i = 0; i < staff.size(); i++) {

            Employee employee = staff.get(i);

            System.out.println(employee.getName());
        }
    }

    public static void printAll(Employee[] staff, Predicate<? super Employee> filter) {

        for (Employee employee : staff) {

            if (filter.test(employee)) {

                System.out.println(employee.getName());
            }
        }
    }

    public static <T> void printAll(T[] elements, Predicate<? super T> filter) {

        for (T element : elements) {

            if (filter.test(element)) {

                System.out.println(element.toString());
            }
        }
    }
}
