package appDomain.utilities;

/**
 * @author Jasjot Singh, Jinsun Yu, Jiyun Woo, Tony Kim.
 * @version 1.0 March 21, 2025.
 *
 * Interface description:
 * This interface defines the basic operations for a stack.
 *
 * @param <E> the type of elements in the stack.
 * Assignment 2.
 */
public interface StackADT<E> {

    /**
     * Adds the specified element to the top of this stack.
     *
     * @param element the element to be pushed onto this stack.
     * @precondition element != null.
     * @postcondition size() == old size() + 1 (the element is added to the top of the stack).
     * @throws NullPointerException if element is null.
     */
    void push(E element) throws NullPointerException;

    /**
     * Removes and returns the top element from the stack.
     *
     * @return the element removed from the top of the stack.
     * @precondition !isEmpty() (the stack is not empty).
     * @postcondition size() == old size() - 1 (the top element is removed from the stack).
     * @throws IllegalStateException if the stack is empty.
     */
    E pop() throws IllegalStateException;

    /**
     * Returns, but does not remove, the top element of this stack.
     *
     * @return the element at the top of the stack.
     * @precondition !isEmpty() (the stack is not empty).
     * @postcondition the stack remains unchanged.
     * @throws IllegalStateException if the stack is empty.
     */
    E peek() throws IllegalStateException;

    /**
     * Returns true if the stack is empty, false otherwise.
     *
     * @return true if this stack is empty.
     * @precondition none.
     * @postcondition the stack remains unchanged.
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the stack.
     *
     * @return the size of the stack.
     * @precondition none.
     * @postcondition the stack remains unchanged.
     */
    int size();
}