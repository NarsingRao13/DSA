package com.linkedlist;

public class LinkedList {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}

	}

	public Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
			return node;
		} else {
			Node temp = node;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
			return node;
		}
	}

	public void display(Node head) {
		System.out.println(head.toString());
		Node start = head;
		while (start != null) {
			System.out.println(start.data + " ");
			start = start.next;
		}
	}

	public void displayInReverse(Node node) {
		if (node == null) {
			return;
		}
		displayInReverse(node.next);
		System.out.println(node.data);
	}

	public Node insertAtStart(Node node, int data) {
		Node newNode = new Node(data);
		newNode.next = node;
		return newNode;
	}

	public Node insertAtPosition(Node node, int data, int position) {
		int length = length(node);
		position = position - 1;
		if (position < length) {
			int currentPos = 0;
			Node updateNode = null;
			while (node != null) {
				if (position == currentPos) {
					if (position == 0) {
						updateNode = insertAtStart(node, data);
					} else {
						Node newNode = new Node(data);
						Node temp = node.next;
						node.next = newNode;
						newNode.next = temp;
						updateNode = newNode;
					}
					break;
				}
				node = node.next;
				currentPos++;
			}
			return updateNode;
		} else
			return node;
	}

	public Node insertNth(Node node, int data, int position) {
		Node head = node;
		Node newNode = new Node(data);
		if (position == 0) {
			newNode.next = node;
			head = newNode;
		} else {
			int i = 0;
			Node currentNode = node;
			Node prevNode = null;
			while (i < position) {
				prevNode = currentNode;
				currentNode = currentNode.next;
				if (currentNode == null) {
					break;
				}
				i++;
			}
			newNode.next = currentNode;
			prevNode.next = newNode;
			node = prevNode;
		}
		return head;
	}

	public int length(Node node) {
		int i = 0;
		while (node != null) {
			node = node.next;
			i++;
		}
		return i;
	}

	public void searchNode(Node node, int data) {
		int index = 0;
		boolean status = false;
		while (node != null) {
			if (node.data == data) {
				status = true;
				break;
			}
			node = node.next;
			index++;
		}
		if (status)
			System.out.println(data + " was found at " + index);
		else
			System.out.println(data + " was not found in linked list");
	}

	public Node deleteNode(Node node, int data) {
		if (node == null)
			return null;
		if (node.data == data)
			return node.next;
		Node currentNode = node;
		while (currentNode != null) {
			if (currentNode.next.data == data) {
				currentNode.next = currentNode.next.next;
				return node;
			}
			currentNode = currentNode.next;
		}
		return node;
	}

	public Node deleteNodeAtPosition(Node node, int position) {
		Node currentNode = node;
		if (node == null) {
			return null;
		} else if (position == 0) {
			return currentNode.next;
		} else {
			int i = 0;
			while (currentNode.next != null) {
				if ((position - 1) == i) {
					System.out.println(currentNode.toString());
					currentNode.next = currentNode.next.next;
					System.out.println(currentNode.toString());
					break;
				}
				i++;
				currentNode = currentNode.next;
			}
			return node;
		}
	}

	public Node reverseLinkedList(Node node) {
		if (node == null) {
			return null;
		}
		if (node.next == null) {
			return node;
		}
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

}
