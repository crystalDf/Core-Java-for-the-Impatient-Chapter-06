package ch06.sec03;

import java.util.ArrayList;

public class TypeBoundsTest {

    public static void main(String[] args) {

    }

    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elements)
            throws Exception {

        for (T element : elements) {

            element.close();
        }
    }

    public static void closeAll(AutoCloseable[] elements) throws Exception {

        for (AutoCloseable element : elements) {

            element.close();
        }
    }
}
