package ch06.sec06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.IntFunction;

public class RestrictionsOnGenerics {

    public static void main(String[] args) {

        String[] greetings = repeat(10, "hi", String[]::new);

        greetings = repeat(10, "hi", String.class);
    }

    private static <T> T[] repeat(int n, T object, IntFunction<T[]> constructor) {

        T[] result = constructor.apply(n);

        for (int i = 0; i < n; i++) {

            result[i] = object;
        }

        return result;
    }

    private static <T> T[] repeat(int n, T object, Class<T> clazz) {

        T[] result = (T[]) Array.newInstance(clazz, n);

        for (int i = 0; i < n; i++) {

            result[i] = object;
        }

        return result;
    }

    private static <T> T[] repeat(int n, T object, T[] array) {

        T[] result;

        if (array.length >= n) {

            result = array;
        } else {

            T[] newArray = (T[]) Array.newInstance(array.getClass().getComponentType(), n);
            result = newArray;
        }

        for (int i = 0; i < n; i++) {

            result[i] = object;
        }

        return result;
    }

    private static <T> ArrayList<T> repeat(int n, T object) {

        ArrayList<T> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            result.add(object);
        }

        return result;
    }
}
