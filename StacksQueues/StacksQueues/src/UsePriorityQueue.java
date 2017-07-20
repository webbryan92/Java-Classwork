import java.util.*;

public class UsePriorityQueue
{

    // Method printQueue: enumerates all items in queue
    static void printQueue (PriorityQueue<String> q){
	Iterator itr = q.iterator();

	while(itr.hasNext()){
	    	Object element = itr.next();
	   	System.out.println(element);
	}
    }

    // Method contains: determines if specified item is in queue
    static boolean contains (PriorityQueue<String> q, String item){
	return q.contains(item);
    }

    // Method main: tests priority queue
    public static void main (String[] args){
        Comparator<String> comparator = new StringLengthComparator();
        PriorityQueue<String> queue = new PriorityQueue<String>(10, comparator);

	// Load queue
	queue.offer("heterogenious");
	queue.offer("semaphore");
        queue.offer("Pneumonoultramicroscopicsilicovolcanoconiosis");
        queue.offer("performance");

	// Enumerate queue
	System.out.println("Actual ordering in queue:");
	printQueue(queue);
	System.out.println();

	// Test contains() method
	System.out.println("Queue contains semaphore? " + contains(queue, "semaphore"));
	System.out.println("Queue contains symphony? " + contains(queue, "symphony"));
	System.out.println();

	// Remove items according to precedence; enumerate as they are removed
	System.out.println("Ordering according to priority (length of word): ");
        while (queue.size() != 0){
            System.out.println(queue.remove());
        }

    }

    public static class StringLengthComparator implements Comparator<String>{

   	 public int compare(String x, String y){
     	   // Assume neither string is null.
     	   if (x.length() < y.length())
     	   {
      	      return -1;
       	   }
       	   if (x.length() > y.length())
           {
              return 1;
           }
           return 0;
         }

    }
}
