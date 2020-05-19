package lab7;

import java.util.Queue;
import java.util.LinkedList;

public class MyLinkedQueue<T> implements MyQueue<T> {

	Queue<T> store = new LinkedList<T>();

	// The linked element at the head of the queue (first element to join)
	private LinkElement<T> head;

	// The linked element at the end of the queue (last element to join)
	private LinkElement<T> last;

	@Override
	public void queue(T element) {
		// TODO Auto-generated method stub
		store.offer(element);
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			String r_value = "Empty Queue";
			return (T) r_value;
		}
		return store.remove();
	}

	@Override
	public T front() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		return(store.size()==0);
			
		
		
		// TODO Auto-generated method stub

	}

}
