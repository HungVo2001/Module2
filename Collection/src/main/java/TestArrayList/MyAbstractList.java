package TestArrayList;

import java.util.Iterator;

public abstract class MyAbstractList<E> {

    abstract void add(int index, E e);
    abstract void clear();
    abstract boolean contains(E e);
    abstract E get(int index);
    abstract int indexOf(E e);
    abstract E remove(int index);
    abstract E set(int index, E e);

     abstract Iterator iterator();
}