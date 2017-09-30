package ch06.ex07;

public class Pair<E extends Comparable<E>> {

    private E first;
    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public E getMax() {
        return first.compareTo(second) < 0 ? second : first;
    }

    public E getMin() {
        return first.compareTo(second) < 0 ? first : second;
    }
}
