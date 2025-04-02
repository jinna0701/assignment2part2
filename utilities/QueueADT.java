package appDomain.utilities;
/**
 * @author Jasjot Singh, Jinsun Yu, Jiyun Woo, Tony Kim.
 * @version 1.0 March 21, 2025.
 *
 * Interface description:
 * This interface defines the basic operations for a queue.
 *
 * @param <E> the type of elements in the queue.
 * Assignment 2.
 */
public interface QueueADT<E> {

    /**
     * Adds the specified element to the end of this queue.
     *
     * @param element the element to be added to this queue.
     * @precondition element != null.
     * @postcondition size() == old size() + 1 (the element is added to the end of the queue).
     * @throws NullPointerException if element is null.
     */
    void enqueue(E element) throws NullPointerException;

    /**
     * Removes and returns the front element of the queue.
     *
     * @return the element at the front of the queue.
     * @precondition !isEmpty() (the queue is not empty).
     * @postcondition size() == old size() - 1 (the front element is removed from the queue).
     * @throws IllegalStateException if the queue is empty.
     */
    E dequeue() throws IllegalStateException;

    /**
     * Returns the front element without removing it.
     *
     * @return the element at the front of the queue.
     * @precondition !isEmpty() (the queue is not empty).
     * @postcondition the queue remains unchanged.
     * @throws IllegalStateException if the queue is empty.
     */
    E first() throws IllegalStateException; // Rename to peek() if not specified in the assignment

    /**
     * Returns true if the queue is empty, false otherwise.
     *
     * @return true if the queue is empty.
     * @precondition none.
     * @postcondition the queue remains unchanged.
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the queue.
     *
     * @return the size of the queue.
     * @precondition none.
     * @postcondition the queue remains unchanged.
     */
    int size();
}