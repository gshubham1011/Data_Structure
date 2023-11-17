package Queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class InBuilt {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
	    
		queue.add(10);
		queue.add(30);
		queue.add(15);
		queue.add(20);
		queue.add(25);
		queue.remove(); //FIFO
		queue.remove(25); //pop
		
		for (Iterator<Integer> iterator = queue.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
        //Reverse the Queue 
	    Stack<Integer> st = new Stack<Integer>();
	    for (int i=0;i<queue.size();i++) {
            st.add(queue.remove());
	    }
	    for (Iterator<Integer> iterator = st.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			queue.add(integer);
		}
	    System.out.println(" Queue After reverse ");
	    
	    for (Iterator<Integer> iterator = queue.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		


	}

}
