package ch06.sec04;

import java.util.ArrayList;

public class TypeVarianceAndWildcardsTest {

    public static void main(String[] args) {

    }

    public static void printNames(ArrayList<? extends Employee> staff) {

        for (int i = 0; i < staff.size(); i++) {

            Employee employee = staff.get(i);

            System.out.println(employee.getName());
        }
    }
}
