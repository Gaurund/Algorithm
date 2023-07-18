package org.algorithm.gb;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        MyLinkedList myLinkedList = new MyLinkedList();
        for (int i = 0; i < 10; i++) {
            myLinkedList.add(random.nextInt(0,101));
        }
        System.out.println(myLinkedList);
        myLinkedList.reverse();
        System.out.println(myLinkedList);
    }
}