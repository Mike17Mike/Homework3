package HW3.CS3310;


public class Node<E extends Comparable<E>> {

	E dataValue;
	Node<E> nextNode;
	
	Node(E dataValue){
		this.dataValue=dataValue;
	}
	
	Node(E dataValue, Node<E> nextNode){
		this.dataValue = dataValue;
		this.nextNode = nextNode;
	}

	
	public E getData() {
		
		return dataValue;
	}

	public Node<E> getNext() {
		
		return nextNode;
	}

	public void setNext(Node<E> next) {
		nextNode = next;
		
	}
	
}

