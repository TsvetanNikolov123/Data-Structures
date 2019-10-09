package p02CircularQueue;

public class CircularQueue<E> {

    private static int DEFAULT_CAPACITY = 16;
    private E[] elements;
    private int size;
    private int startIndex;
    private int endIndex;

    public CircularQueue() {
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public CircularQueue(int initialCapacity) {
        this.elements = (E[]) new Object[initialCapacity];
    }

    public int size() {
        return this.size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public void enqueue(E element) {
        if (this.size() >= this.elements.length) {
            this.resize();
        }

        this.elements[this.endIndex] = element;
        this.endIndex = (this.endIndex + 1) % this.elements.length;
        this.setSize(this.size() + 1);
    }

    private void resize() {
        E[] newArray = (E[]) new Object[this.size() * 2];

        this.copyAllElements(newArray);
        this.elements = newArray;
        this.startIndex = 0;
        this.endIndex = this.size();
    }

    private void copyAllElements(E[] newArray) {
        int currentIndex = 0;
        int currentHead = this.startIndex;

        while (currentIndex < this.size()) {
            newArray[currentIndex++] = this.elements[currentHead];
            currentHead = (currentHead + 1) % this.elements.length;
        }
    }

    public E dequeue() {
        if (this.size() == 0) {
            throw new IllegalArgumentException();
        }

        E element = this.elements[startIndex];
        this.startIndex = (this.startIndex + 1) % this.elements.length;
        this.setSize(this.size() - 1);
        return element;
    }

    public E[] toArray() {
        E[] elementsArray = (E[]) new Object[this.size()];

        int sourceEnd = this.startIndex;
        int destIndex = 0;
        for (int i = 0; i < this.size(); i++) {
            elementsArray[destIndex++] = this.elements[sourceEnd];
            sourceEnd = (sourceEnd + 1) % this.elements.length;
        }

     return elementsArray;
    }
}
