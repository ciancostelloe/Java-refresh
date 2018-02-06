import javax.swing.JOptionPane;

/**
 * M Madden: Array implementation of Queue ADT
 */

public class ArrayQueue implements Queue 
{
	 protected Object Q[];				// array used to implement the queue 
	 protected int front = 0; // Index for creating objects
	 protected int back = 0; // Index for taking away objects
	 protected int capacity; 			// The actual capacity of the queue array
	 public static final int CAPACITY = 1000;	// default array capacity
	   
	 public ArrayQueue() {
		   // default constructor: creates queue with default capacity
		   this(CAPACITY);
	 }

	 public ArrayQueue(int cap) {
		  // this constructor allows you to specify capacity
		  capacity = (cap > 0) ? cap : CAPACITY;
		  Q = new Object[capacity]; 
	 }
	 
	 public void enqueue(Object n)
	 {
		 if (isFull()) {
			 JOptionPane.showMessageDialog(null, "Cannot enqueue object; queue is full.");
			 return;
		 }
		 	Q[front] = n;
		 	
		 	// Increment insert index or wrap around to the start
		 	if(front > (capacity - 2))
		 		front = 0;
		 	else
		 		front++;

	 }
	 
	 public Object dequeue()
	 {
		 // Can't do anything if it's empty
		 if (isEmpty())
			 return null;
		 
		 Object toReturn = Q[back];
		 
		 if(back > (capacity - 2))
			 back = 0;
			 else
			 back++;
			 return toReturn;
			 }

	 
	 public boolean isEmpty()  {
		 return (front == back);
	 }
	 
	 public boolean isFull() {
	 // If the front index is one behind the back index
		 
		 if((back - front) == 1)
			 return true;
		 // Or the if the back index is at the start and the front index is at the end
		 else if((back - front) == (capacity - 1))
			 return true;
		 return false;
	 	}
	 
	 
	 	public Object front(){
	 		if (isEmpty())
	 			return null;
	 		
	 		// Return the object at the back index
	 		return Q[back];
	 }
}
