package ch06.sec02;

public class ArraysTest {

    public static void main(String[] args) {

        String[] friends = {"Hermione", "Harry"};

        System.out.println(java.util.Arrays.asList(friends));

        Arrays.swap(friends, 0, 1);

        System.out.println(java.util.Arrays.asList(friends));
    }
}
