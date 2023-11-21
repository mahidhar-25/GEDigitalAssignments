package com.bridgelabz.DataStructure;

import java.util.Scanner;

public class Queue {

        Queue.Node head;
        Queue.Node tail;
        //initialization of a node
        static class Node{
            int data;
            Queue.Node next;
            // constructor initializing node with value d
            Node(int d){
                data = d;
                next = null;
            }
        }

        public static void enqueue(Queue root , int val){
            Queue.Node latestNode = new Queue.Node(val);
            latestNode.next = null;

            if(root.head == null){
                root.head = latestNode;
            }else{
               Queue.Node last = root.tail;
               last.next = latestNode;
            }
            root.tail = latestNode;
        }

        public static void enqueueByPosition(Queue root , int val , int position){
            Queue.Node latestNode = new Queue.Node(val);
            Queue.Node nextNode = null;
            latestNode.next = null;

            if(root.head == null){
                root.head = latestNode;
            }else if(position==0){
                Queue.Node temp = root.head;
                root.head = latestNode;
                latestNode.next = temp;
            }else{
                Queue.Node last = root.head;
                int counter=1;
                while(last.next != null){
                    if(counter == position){
                        nextNode = last.next;
                        break;
                    }
                    counter++;
                    last = last.next;
                }
                if(position > counter){
                    System.out.println("your entered position " + position + " is more than the Queue size");
                    System.out.println("So we are adding at last");
                }
                last.next = latestNode;
                latestNode.next = nextNode;
            }
            Queue.Node temp = root.head;
            while(temp.next != null){
                temp = temp.next;
            }
            root.tail = temp;
        }

        public static void dequeue(Queue root){
            Queue.Node currNode = root.head;
            if (currNode == null) {
                System.out.println( "Queue is empty");
            }

            if (currNode != null) {
                root.head = currNode.next;
            }

        }

        public static void dequeueByKey(Queue root , int key){
            Queue.Node currNode = root.head, prev = null;

            if (currNode != null && currNode.data == key) {
                root.head = currNode.next;
                return ;
            }
            while (currNode != null && currNode.data != key) {
                prev = currNode;
                currNode = currNode.next;
            }

            if (currNode != null) {
                if(currNode.next == null){
                    root.tail = prev;
                }
                prev.next = currNode.next;
            }

            if (currNode == null) {
                System.out.println(key + " not found");
            }

        }

        public static void printQueue(Queue list)
        {
            Queue.Node currNode = list.head;
            System.out.print("Queue: ");
            while (currNode != null) {
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {

            System.out.println("1. if you want to initialize a Queue");
            System.out.println("2. if you want to enqueue a value at end in a Queue");
            System.out.println("3. if you want to enqueue a value by position in a Queue");
            System.out.println("4. if you want to dequeue a value in a Queue");
            System.out.println("5. if you want to dequeue a value by position in a Queue");
            System.out.println("6. if you want to print a Queue");
            System.out.println("7. if you want to exit");

            System.out.println("Select an option from above: ");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt() , p , q;
            Queue list = new Queue();
            while(n!=7){
                switch (n) {
                    case 1 -> {
                        System.out.println("enter a key value : ");
                        p = input.nextInt();
                        enqueue(list, p);
                    }
                    case 2 -> {
                        System.out.println("enter a key value: ");
                        p = input.nextInt();
                        enqueue(list, p);
                    }
                    case 3 -> {
                        System.out.println("enter a key value and position : ");
                        p = input.nextInt();
                        q = input.nextInt();
                        enqueueByPosition(list, p, q);
                    }
                    case 4 -> dequeue(list);
                    case 5 -> {
                        System.out.println("enter a key value to delete : ");
                        p = input.nextInt();
                        dequeueByKey(list, p);
                    }
                    case 6 -> printQueue(list);
                    default -> System.out.println("enter a correct value from the choices");
                }
                System.out.println("1. if you want to initialize a Queue");
                System.out.println("2. if you want to enqueue a value at end in a Queue");
                System.out.println("3. if you want to enqueue a value by position in a Queue");
                System.out.println("4. if you want to dequeue a value in a Queue");
                System.out.println("5. if you want to dequeue a value by position in a Queue");
                System.out.println("6. if you want to print a Queue");
                System.out.println("7. if you want to exit");

                System.out.println("Select an option from above: ");
                n = input.nextInt();
            }
        }
}
