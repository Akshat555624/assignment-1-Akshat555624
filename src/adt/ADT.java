package adt;

import node.LinkedList;

public interface ADT<E> {
    void insert(E data);

    void delete();

    void traverse();

    LinkedList<E> sort(LinkedList<E> person);


}
