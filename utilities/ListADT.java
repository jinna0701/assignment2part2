package appDomain.utilities;

import java.io.Serializable;

public interface ListADT<E> extends Serializable {

    public int size();

    public void clear();

    public boolean add(int index, E toAdd) throws NullPointerException, IndexOutOfBoundsException;

    public boolean add(E toAdd) throws NullPointerException;

    public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException;

    public E get(int index) throws IndexOutOfBoundsException;

    public E remove(int index) throws IndexOutOfBoundsException;

    public E set(int index, E toChange) throws NullPointerException, IndexOutOfBoundsException;

    public boolean isEmpty();

    public boolean contains(E toFind) throws NullPointerException;

    public E[] toArray(E[] toHold) throws NullPointerException;

    public Object[] toArray();

    public Iterator<E> iterator();
}