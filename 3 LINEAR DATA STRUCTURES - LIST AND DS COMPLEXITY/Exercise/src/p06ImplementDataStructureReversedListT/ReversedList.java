package p06ImplementDataStructureReversedListT;

import java.util.Iterator;

/**
 * It gives me TIME LIMIT on every test i judge.
 *
 * @param <T>
 */
public class ReversedList<T> implements Iterable {
    private T[] elements;
    private int size;
    private int capacity;

    public ReversedList() {
        this.size = 0;
        this.capacity = 2;
        this.elements = createArray(capacity);
    }

    @SuppressWarnings("unchecked")
    private static <T> T[] createArray(int capacity) {
        return (T[]) new Object[capacity];
    }

    public void add(T element) {
        if (size == capacity) {
            capacity = capacity * 2;
        }
        T[] newElements = createArray(capacity);
        for (int i = 0; i < size; i++) {
            newElements[i] = this.elements[i];
        }
        newElements[size] = element;
        size++;
        this.elements = newElements;
    }

    public T get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        index = reverseIndex(index);
        return this.elements[index];
    }

    public void set(int index, T element) {
        if (index >= this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        index = reverseIndex(index);
        this.elements[index] = element;
    }

    public int count() {
        return this.size;
    }

    public int capacity() {
        return this.capacity;
    }

    public void removeAt(int index) {
        int indexToRemoveAt = reverseIndex(index);
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T element = elements[indexToRemoveAt];
        size--;
        for (int i = indexToRemoveAt; i < size; i++) {
            elements[i] = elements[i + 1];
        }
    }

    private int reverseIndex(int index) {
        int lengthOfNotInitializedCells = this.elements.length - this.size;
        int reversedIndex = this.elements.length - (lengthOfNotInitializedCells);
        return reversedIndex;
    }

    @Override
    public Iterator iterator() {
        return new ReversedListIterator();
    }

    public class ReversedListIterator implements java.util.Iterator<T> {
        private int internalIndex = size - 1;

        @Override
        public boolean hasNext() {
            if (internalIndex >= 0) {
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            T currentElement = (T) elements[internalIndex];
            internalIndex--;
            return currentElement;
        }
    }
}
