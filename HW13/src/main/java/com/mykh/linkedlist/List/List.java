package com.mykh.linkedlist.List;

import com.mykh.linkedlist.Node.Node;

public class List<T> {


        private Node<T> head;
        private Node<T> last;
        private int size = 0;


        public List() {
            head = last = new Node(null);
        }

        public void add(int index,T data) {
        }


        public boolean remove(String data) {
            Node current = head;
            last = null;
            while (current != null) {
                if (current.getData().equals(data)) {
                    current = current.getNext();
                    if (last == null) {
                        last = current;
                    } else {
                        last.getNext().setNext(current);
                        size--;
                        return true;
                    }
                } else {
                    last = current;
                    current = current.getNext();
                }
            }
            return false;
        }
        public int size() {
            return size;
        }


        public boolean isEmpty() {
            return true;
        }


        public String getData(int index) {

            if(index <= 0) {
                return null;
            }

            Node current = head.getNext();
            for(int i = 1;i < index;i++) {
                if(current.getNext() == null) {
                    return null;
                }
                current = current.getNext();
            }


        }


        public boolean contains(String s) {
            for(int i = 1;i<=size();i++) {
                if(getData(i).equals(s)) {
                    return true;
                }
            }
            return false;
        }

        //@return contents of the list - recursively
        public String toString() {
            Node current = head.getNext();
            String output = "[";
            while(current != null) {
                output += current.getData()+",";
                current = current.getNext();
            }
            return output+"]";
        }


        public Node getHead() {
            return head;
        }

        // @return (recursively) list
        public void print(Node n) {
            if(n == null) {
                return;
            }else {
                System.out.println(n.getData());
                print(n.getNext());
            }
        }
    }
}