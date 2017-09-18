package ch06.sec06;

import java.util.function.IntFunction;

public class RestrictionsOnGenerics {

    public static void main(String[] args) {

        String[] greetings = repeat(10, "hi", String[]::new);
    }

    private static <T> T[] repeat(int n, T object, IntFunction<T[]> constr) {

        T[] result = constr.apply(n);

        for (int i = 0; i < n; i++) {

            result[i] = object;
        }

        return result;
    }
}
