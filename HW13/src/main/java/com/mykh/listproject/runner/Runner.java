package com.mykh.listproject.runner;

import com.mykh.listproject.linkedlist.LinkedList;

public class Runner {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 9, 10};

        LinkedList<Integer> myList1 = new LinkedList<>(array);
        myList1.addFirst(1);
        myList1.add(2, 2);
        myList1.add(3, 3);
        myList1.addLast(4);
        myList1.change(2, 3);
        myList1.deleteFirst();
        myList1.deleteLast();
        myList1.delete(2);
        System.out.println(myList1.toString());
        System.out.println(myList1.size());

        LinkedList<Integer> myList = new LinkedList<>();
        myList.addFirst(1);
        myList.addLast(2);
        myList.size();
        System.out.println(myList.toString());


    }
}
