package ch06.ex02;

public class Stack<E> {

    private E[] array = (E[]) new Object[1];
    private int n = 0;

    public void push(E element) {
        if (n == array.length) {
            resize(2 * array.length);
        }

        array[n++] = element;
    }

    public E pop() {
        E element = array[--n];

        array[n] = null;

        if (n > 0 && n == array.length / 4) {
            resize(array.length / 2);
        }

        return element;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    private void resize(int max) {
        E[] temp = (E[]) new Object[max];

        for (int i = 0; i < n; i++) {
            temp[i] = array[i];
        }

        array = temp;
    }
}
