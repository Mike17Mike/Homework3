package HW3.CS3310;

public class Stacks<E extends Comparable<E>> {
	private LinkedList<E> linkedStack = new LinkedList<>();
	private LinkedList<Integer> tracker = new LinkedList<>();
	private int sizeOfLinkedStack = 0, sizeOfTracker = 0;
	private int dataInt;
	private int item, currentMax;
	
	public void push(E data) {
		linkedStack.addTop(data);
		try {
			dataInt = Integer.parseInt((String)data);
			if(sizeOfLinkedStack == 0) {
				tracker.addTop(dataInt);
				currentMax = dataInt;
				sizeOfTracker++;
			}
			else if(currentMax >= dataInt) {
				if(currentMax != tracker.get(sizeOfTracker-1)) {
					currentMax = tracker.get(sizeOfTracker-1);
				}
				tracker.addTop(currentMax);
				sizeOfTracker++;
			}
			else {
				currentMax = dataInt;
				tracker.addTop(currentMax);
				sizeOfTracker++;
			}
		}
		catch(Exception e){
			//Item is not an integer
		}
		sizeOfLinkedStack ++;
		
	}
	
	public E pop() {
		if(linkedStack.size() == 0) {
			return null;
		}
		else {
			sizeOfLinkedStack --;
			sizeOfTracker--;
			if(tracker.size()!= 0) {
				tracker.removeTop();
			}
			return linkedStack.removeTop();
		}
	}
	
	public int getMax() {
		if(sizeOfTracker!= 0) {
			item = tracker.removeTop();
			tracker.addTop(item);
			return item;
		}
		else {
			return -1;
		}
	}
	
	public int size() {
		return sizeOfLinkedStack;
	}
	
	
	public boolean isEmpty() {
		return sizeOfLinkedStack == 0;
	}
}
