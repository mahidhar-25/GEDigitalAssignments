package com.bridgelabz.DataStructure;



import java.util.Scanner;

public class LinkedList {

    Node head;
    //initialization of a node
    static class Node{
        int data;
        Node next;
    // constructor initializing node with value d
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void insert(LinkedList root , int val){
        Node latestNode = new Node(val);
        latestNode.next = null;

        if(root.head == null){
            root.head = latestNode;
        }else{
            Node last = root.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = latestNode;
        }
    }

    /*

    @param :
    @return :
     */
    public static void insertByPosition(LinkedList root , int val , int position){
        Node latestNode = new Node(val);
        Node nextNode = null;
        latestNode.next = null;

        if(root.head == null){
            root.head = latestNode;
        }else if(position==0){
            Node temp = root.head;
            root.head = latestNode;
            latestNode.next = temp;
        }else{
            Node last = root.head;
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
                System.out.println("your entered position " + position + " is more than the linked list size");
                System.out.println("So we are adding at last");
            }
            last.next = latestNode;
            latestNode.next = nextNode;
        }
    }

    public static void deleteByKey(LinkedList root , int key){
        Node currNode = root.head, prev = null;

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

    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        System.out.println("1. if you want to initialize a linked list");
        System.out.println("2. if you want to insert a value at end in a linked list");
        System.out.println("3. if you want to insert a value by position in a linked list");
        System.out.println("4. if you want to delete a value in a linked list");
        System.out.println("5. if you want to print a linked list");
        System.out.println("6. if you want to exit");

        System.out.println("Select an option from above: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt() , p , q;
        LinkedList list = new LinkedList();

        while(n!=6){
            switch(n){
                case 1 :
                    System.out.println("enter a key value : ");
                     p = input.nextInt();
                    insert(list , p);
                    break;
                case 2 :
                    System.out.println("enter a key value: ");
                    p = input.nextInt();
                    insert(list , p);
                    break;
                case 3 :
                    System.out.println("enter a key value and position : ");
                    p = input.nextInt();
                    q = input.nextInt();
                    insertByPosition(list , p , q);
                    break;
                case 4 :
                    System.out.println("enter a key value to delete : ");
                    p = input.nextInt();
                    deleteByKey(list , p);
                    break;
                case 5 :
                    printList(list);
                default :
                    System.out.println("enter a correct value from the choices");
            }
            System.out.println("1. if you want to initialize a linked list");
            System.out.println("2. if you want to insert a value at end in a linked list");
            System.out.println("3. if you want to insert a value by position in a linked list");
            System.out.println("4. if you want to delete a value in a linked list");
            System.out.println("5. if you want to print a linked list");
            System.out.println("6. if you want to exit");

            System.out.println("Select an option from above: ");
            n = input.nextInt();
        }
    }
}

