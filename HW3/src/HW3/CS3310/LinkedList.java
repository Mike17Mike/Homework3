package HW3.CS3310;

public class LinkedList<E extends Comparable<E>> {
	private Node<E> head = null;
	
	public void addTop(E data) {
		Node<E> newNode = new Node<E>(data);
		newNode.nextNode = head;
		head = newNode;
	}
	
	public void addEnd(E data) {
		Node<E> newNode = new Node<E>(data);
		Node<E> temp = head;
		if(temp == null) {
			head = newNode;
		}
		else {
			while(temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = newNode;
		}
	}
	
	public E removeTop() {
		Node<E> targetNode = head;
		head = head.nextNode;
		return targetNode.getData();
	}
	
	public int size() {
		int size = 0;
		Node<E> temp = head;
		while(temp != null) {
			temp = temp.getNext();
			size++;
		}
		return size;
	}
	
	public E get(int position) {
		Node<E> temp = head;
		int i = 0;
		while(i!= position) {
			temp = temp.nextNode;
			i++;
		}
		return temp.getData();
	}
}
