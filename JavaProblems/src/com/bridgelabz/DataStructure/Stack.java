package com.bridgelabz.DataStructure;

import java.util.Scanner;

public class Stack {

    Stack.Node head;
    //initialization of a node
    static class Node{
        int data;
        Stack.Node next;
        // constructor initializing node with value d
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void push(Stack root , int val){
        Stack.Node latestNode = new Stack.Node(val);
        latestNode.next = null;

        if(root.head == null){
            root.head = latestNode;
        }else{
           Stack.Node temp = root.head;
           root.head = latestNode;
           latestNode.next = temp;
        }
    }

    public static void pushByPosition(Stack root , int val , int position){
        Stack.Node latestNode = new Stack.Node(val);
        Stack.Node nextNode = null;
        latestNode.next = null;

        if(root.head == null){
            root.head = latestNode;
        }else if(position==0){
            Stack.Node temp = root.head;
            root.head = latestNode;
            latestNode.next = temp;
        }else{
            Stack.Node last = root.head;
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
                System.out.println("your entered position " + position + " is more than the stack size");
                System.out.println("So we are adding at last");
            }
            last.next = latestNode;
            latestNode.next = nextNode;
        }
    }

    public static void pop(Stack root){
        Stack.Node currNode = root.head;
        if (currNode == null) {
            System.out.println( "Stack is empty");
        }

        if (currNode != null) {
            root.head = currNode.next;
        }

    }

    public static void popByKey(Stack root , int key){
        Stack.Node currNode = root.head, prev = null;

        if (currNode != null && currNode.data == key) {
            root.head = currNode.next;
            return ;
        }
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {
            prev.next = currNode.next;
        }

        if (currNode == null) {
            System.out.println(key + " not found");
        }

    }

    public static void printStack(Stack list)
    {
        Stack.Node currNode = list.head;
        System.out.print("Stack: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        System.out.println("1. if you want to initialize a Stack");
        System.out.println("2. if you want to push a value at end in a Stack");
        System.out.println("3. if you want to push a value by position in a Stack");
        System.out.println("4. if you want to pop a value in a Stack");
        System.out.println("5. if you want to pop a value by position in a Stack");
        System.out.println("6. if you want to print a Stack");
        System.out.println("7. if you want to exit");

        System.out.println("Select an option from above: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt() , p , q;
        Stack list = new Stack();
        while(n!=7){
            switch (n) {
                case 1 -> {
                    System.out.println("enter a key value : ");
                    p = input.nextInt();
                    push(list, p);
                }
                case 2 -> {
                    System.out.println("enter a key value: ");
                    p = input.nextInt();
                    push(list, p);
                }
                case 3 -> {
                    System.out.println("enter a key value and position : ");
                    p = input.nextInt();
                    q = input.nextInt();
                    pushByPosition(list, p, q);
                }
                case 4 -> pop(list);
                case 5 -> {
                    System.out.println("enter a key value to delete : ");
                    p = input.nextInt();
                    popByKey(list, p);
                }
                case 6 -> printStack(list);
                default -> System.out.println("enter a correct value from the choices");
            }
            System.out.println("1. if you want to initialize a Stack");
            System.out.println("2. if you want to push a value at end in a Stack");
            System.out.println("3. if you want to push a value by position in a Stack");
            System.out.println("4. if you want to pop a value in a Stack");
            System.out.println("5. if you want to pop a value by position in a Stack");
            System.out.println("6. if you want to print a Stack");
            System.out.println("7. if you want to exit");

            System.out.println("Select an option from above: ");
            n = input.nextInt();
        }
    }
}
