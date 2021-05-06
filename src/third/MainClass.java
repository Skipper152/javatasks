package third;

import third.myCollections.MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        // Check with Integer
        int n = 1_000_000;
        int[] nn = {0, n-1, n / 2 - 1};
        long startTime;
        long estimatedTime;

        LinkedList<Integer> linkedList = new LinkedList<>();
        MyLinkedList<Integer> myList = new MyLinkedList<>();

        // add to begin - methods
        startTime = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            linkedList.addFirst(19);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList. Time for addFirst-method: " + estimatedTime);


        startTime = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            myList.addToBegin(19);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("MyLinkedList. Time for addToBegin-method: " + estimatedTime);

        // remove - methods
        /*startTime = System.nanoTime();
        for (int i = n - 1; i >= 0; --i) {
            linkedList.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList. Time for addLast-method: " + estimatedTime);


        startTime = System.nanoTime();
        for (int i = n - 1; i >= 0; --i) {
            myList.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("MyLinkedList. Time for addToEnd-method: " + estimatedTime);*/

        //removing from the middle
        /*startTime = System.nanoTime();
        for (int i = (n / 2 - 1); i >= 0; --i) {
            linkedList.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList. Time for addLast-method: " + estimatedTime);


        startTime = System.nanoTime();
        for (int i = (n / 2 - 1); i >= 0; --i) {
            myList.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("MyLinkedList. Time for addToEnd-method: " + estimatedTime);*/


        // Clear - method
        /*startTime = System.nanoTime();
        linkedList.clear();
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList. Time for addLast-method: " + estimatedTime);


        startTime = System.nanoTime();
        myList.clear();
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("MyLinkedList. Time for addToEnd-method: " + estimatedTime);*/


        // get - method
        startTime = System.nanoTime();
        for (int i : nn) {
            linkedList.get(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList. Time for addFirst-method: " + estimatedTime);


        startTime = System.nanoTime();
        for (int i : nn) {
            myList.get(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("MyLinkedList. Time for addToBegin-method: " + estimatedTime);


    }
}
