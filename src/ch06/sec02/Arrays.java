package ch06.sec02;

public class Arrays {

    public static <T> void swap(T[] array, int i, int j) {

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
