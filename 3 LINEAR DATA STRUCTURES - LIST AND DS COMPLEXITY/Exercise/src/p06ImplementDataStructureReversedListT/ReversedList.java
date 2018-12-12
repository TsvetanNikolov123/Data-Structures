package p06ImplementDataStructureReversedListT;

public class ReversedList<T> {
    private int size;
    private T[] arr;
    private int capacity;

    public ReversedList() {
        this.size = 0;
        this.capacity = 2;
        this.arr = (T[]) new Object[capacity];
    }

    public void add(T element){

    }

    public int count(){
        return 0;
    }

    public int getCapacity(){
        return this.capacity;
    }


}
