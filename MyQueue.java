package lab7;

public interface MyQueue<T> {
	
	void queue(T element); 
	T dequeue(); 
	T front(); 
	boolean isEmpty(); 

}
