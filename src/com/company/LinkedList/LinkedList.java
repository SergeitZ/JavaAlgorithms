package com.company.LinkedList;

import com.company.nodes.Node;

public class LinkedList {
    public static void main(String[] args) {
        Node<Integer> head = null;
        head = addNode(head, 2);
        head = addNode(head, 8);
        head = addNode(head, 5);
        head = addNode(head, 9);

        assertResult(head.value == 2);
        assertResult(head.next.value == 8);
        assertResult(head.next.next.value == 5);
        assertResult(head.next.next.next.value == 9);

        displayList(head);
        displayList(find(head, 2));
        displayList(head);
    }

    // returns the head of the list
    public static Node<Integer> addNode (Node<Integer> head, int value) {
        Node<Integer> newNode = new Node<>(value);
        if (head == null) {
            return newNode;
        }
        Node<Integer> trav = head;
        while (trav.next != null) { //while not end of list
            trav = trav.next;
        }
        // trav is at the end of the list
        // head newNode trav
        trav.next = newNode;
        return head;
    }

    public static void displayList(Node<Integer> head) {
        //TODO: output should be 2859 additional challenge 2, 8, 5, 9
        Node<Integer> trav = head;
        StringBuilder output = new StringBuilder();
        while (trav!= null) { //while not end of list
            output.append(trav.value);
            System.out.print(", " + trav.value);
        }
    }

    public static Node<Integer> find(Node<Integer> head, int query) {
        // 0. Integer return the query if found, null if not
        // 1. int return the index if found or -1 if not found
        // 2. Node return of the node object that contains the query of null if not found
        Node<Integer> trav = head;
        while (trav != null && trav.value != query) {
            trav = trav.next;
        }
        return trav;
    }

    public static void remove(Node<Integer> head, int query) {}

    public static void assertResult (boolean result) {
        if (result) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
}
