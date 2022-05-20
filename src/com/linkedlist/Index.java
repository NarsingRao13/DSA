package com.linkedlist;

import java.util.Scanner;

import com.linkedlist.LinkedList.Node;

public class Index {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of node:");
		Node myNode = null;
		int N = sc.nextInt();
		
//		while (N-- > 0) {
		while (N >  0) {
			int ele = sc.nextInt();
			myNode = ll.insert(myNode, ele);
			N--;
		}
		myNode = ll.insertAtStart(myNode, 32981);
		ll.display(myNode);
		myNode = ll.reverseLinkedList(myNode);
		ll.display(myNode);
		ll.displayInReverse(myNode);
		/*System.out.println("length = "+ll.length(myNode));
		myNode = ll.insertNth(myNode, 123, 1);
		ll.display(myNode);
		System.out.println("Enter the value you need:");
		ll.searchNode(myNode, sc.nextInt());
		System.out.println("Enter the value you need to delete:");
		ll.deleteNode(myNode, sc.nextInt());
		ll.display(myNode);*/
		System.out.println("Enter the value you need to delete:");
		ll.deleteNodeAtPosition(myNode, sc.nextInt());
		ll.display(myNode);
		sc.close();
	}
}
