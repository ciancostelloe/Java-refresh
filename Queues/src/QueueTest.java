/*
 * M Madden, Nov 2005: Test the ArrayQueue
 */

import javax.swing.JOptionPane;


public class QueueTest{
	public static void main(String[] args) {
		// Create a Queue
		Queue q = new ArrayQueue(); 
		
		// Put some strings onto the queue
		JOptionPane.showMessageDialog(null, "About to enqueue words onto queue: ");
		q.enqueue("Aisling");
		q.enqueue("needs");
		q.enqueue("to");
		q.enqueue("learn");
		q.enqueue("how");
		q.enqueue("to");
		q.enqueue("do");
		q.enqueue("her");
		q.enqueue("own");
		q.enqueue("homework");
		q.enqueue("Cian");
		q.enqueue("is");
		q.enqueue("the");
		q.enqueue("best");

		// Now dequeue them from the queue
		JOptionPane.showMessageDialog(null, "About to dequeue the words ...");
		while(! q.isEmpty()) {
			String word = (String)q.dequeue(); // Note: have to cast Objects popped to String
			JOptionPane.showMessageDialog(null, "Word dequeued: " + word);
		}
		
		System.exit(0);
	}

}