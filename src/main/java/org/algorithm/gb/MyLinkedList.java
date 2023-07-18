package org.algorithm.gb;

public class MyLinkedList {
    private Node head;
    private Node tail;

    public Node search(int value) {
        Node node = head;
        while (node.next != null) {
            node = node.next;
            if (node.value == value) {
                return node;
            }
        }
        return null;
    }

    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            addFirst(node);
        }
        else
        {
            tail.next = node;
            node.prev = tail;
            tail = node;
//            tail.next = head;
//            head.prev = tail;
        }
    }

    private void addFirst(Node node) {
        head = node;
        tail = node;
        node.next = node;
//        node.prev = node;
    }

    public void insert(int value, Node prevNode) {
        Node node = new Node();
        node.value = value;
        Node nextNode = prevNode.next;
        prevNode.next = node;
        node.prev = prevNode;
        node.next = nextNode;
        nextNode.prev = node;
    }

    public void reverse() {
        Node tmp = head;
        head = tail;
        tail = tmp;
        Node node = head;
        while (node.next != null) {
            tmp = node.next;
            node.next = node.prev;
            node.prev = tmp;
            node = node.prev;
        }
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
        private int value;
        private Node next;
        private Node prev;

    }
}
