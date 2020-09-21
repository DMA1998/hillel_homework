package com.mykh.list.Iterator;

import com.mykh.list.linkedlist.LinkedList;
import com.mykh.list.node.Node;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

    Node<T> next;

    public MyIterator(LinkedList<T> list) {
        next = list.getHead();

    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public T next() {
        T value = next.getValue();
        next = next.getNext();
        return value;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
