package appDomain.implementations;

import java.io.Serializable;
import java.util.NoSuchElementException;

import appDomain.utilities.Iterator;
import appDomain.utilities.QueueADT;
import appDomain.exception.EmptyQueueException;

public class MyQueue<E> implements QueueADT<E>, Serializable {
    private MyDLL<E> data;

    public MyQueue() {
        data = new MyDLL<>();
    }

    @Override
    public void enqueue(E toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException("Cannot add null element to the queue");
        }
        data.add(toAdd);
    }

    @Override
    public E dequeue() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        return data.remove(0);
    }

    @Override
    public E peek() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        return data.get(0);
    }

    @Override
    public void dequeueAll() {
        data.clear();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean contains(E toFind) throws NullPointerException {
        if (toFind == null) {
            throw new NullPointerException("Cannot search for null element in the queue");
        }
        return data.contains(toFind);
    }

    @Override
    public int search(E toFind) {
        if (toFind == null) {
            throw new NullPointerException("Cannot search for null element in the queue");
        }
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).equals(toFind)) {
                return i + 1;
            }
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyQueueIterator();
    }

    private class MyQueueIterator implements Iterator<E> {
        private int currentIndex;

        public MyQueueIterator() {
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size();
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data.get(currentIndex++);
        }
    }

    @Override
    public boolean equals(QueueADT<E> that) {
        if (that == null) {
            return false;
        }
        if (this.size() != that.size()) {
            return false;
        }
        Iterator<E> thisIterator = this.iterator();
        Iterator<E> thatIterator = that.iterator();
        while (thisIterator.hasNext() && thatIterator.hasNext()) {
            if (!thisIterator.next().equals(thatIterator.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object[] toArray() {
        return data.toArray();
    }

    @Override
    public E[] toArray(E[] holder) throws NullPointerException {
        if (holder == null) {
            throw new NullPointerException("Holder array cannot be null");
        }
        return data.toArray(holder);
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return data.size();
    }
}