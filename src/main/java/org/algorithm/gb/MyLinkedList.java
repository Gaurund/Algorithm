package org.algorithm.gb;

public class MyLinkedList {
    private Node head;
    private Node tail;

    public void add(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head == null){
            head = newNode;
            tail = newNode;
            newNode.prev = null;
            newNode.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }


    public void reverse() {
        Node node = head;

        while (node.next != null) {

            Node temp = node.next;
            node.next = node.prev;
            node.prev = temp;
            node = node.prev;
        }

        Node temp = head;
        head = tail;
        tail = temp;
        head.next = head.prev;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node node = head;
        while (node != null) {
            sb.append(node.value);
            sb.append('\t');
            node = node.next;
        }
        return sb.toString();
    }

    public class Node {
        private Integer value;
        private Node prev;
        private Node next;

        @Override
        public String toString(){ return value.toString(); }
    }
}
