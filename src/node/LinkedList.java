package node;

import adt.ADT;

public class LinkedList<E> implements ADT<E> {
    private Node<E> head = null;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public Node getNode(int index) {
        Node response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    public void addFirst(E data) {
        head = new Node(head, data);
        size++;
    }

    private void add(E data, int index) {
        Node temp = getNode(index - 1);
        if (head == null) {
            addFirst(data);
        } else {
            Node newNode = temp.getNext();
            temp.setNext(new Node(newNode, data));
        }
        size++;
    }
    @Override
    public void insert(E data) {
        if (head == null) {
            addFirst(data);
        } else {
            add(data, size);
        }
    }


    @Override
    public void delete() {

    }

    @Override
    public void traverse() {

    }

    @Override
    public LinkedList<E> sort(LinkedList<E> person) {
        return null;
    }
}

