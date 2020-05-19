package lab7;

import java.util.Queue;
import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedQueue<Integer> my_link = new MyLinkedQueue<Integer>();

		int[] key = new int[] { 5, 12, -3, 8, -9, 4, 10 };
		
		for (int i : key) {
			my_link.queue(i);
		}
			
		for (int i = 0; i < key.length; i++ ) {
			System.out.print(my_link.dequeue() + "  ");
		}	
			
		
		

	}

}
