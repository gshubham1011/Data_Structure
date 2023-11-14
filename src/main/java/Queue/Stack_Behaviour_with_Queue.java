package Queue;

import java.util.Stack;

import Stack.reverseStack_WithTempStack;

public class Stack_Behaviour_with_Queue {
		
		static Stack<Integer> s;
				
		public Stack_Behaviour_with_Queue(){
			s= new Stack<Integer>();			
		}
		
		public void Stack_Enqueue(int value) {
			s.push(value);	
		}
		
		public int Stack_Dqueue() {
		   int ele = 0;
		   Stack<Integer> tempStack = new Stack<Integer>();
		   if(s.empty()) {
			  System.out.println(" Stack is already empty"); 
			  return ele;
		   }else {
			   while (!(s.isEmpty())) {
	             tempStack.push(s.pop());
			   }
			   ele=tempStack.pop();
			   System.out.println(" popped Element :"+ele);
			   while (!(tempStack.isEmpty())) {
		             s.push(tempStack.pop());
				   }
			   return ele;
		   }
		}
		
		public void printQueue() {
			
				System.out.println(s);
			
		}
		

		public static void main(String[] args) {

			Stack_Behaviour_with_Queue f =new Stack_Behaviour_with_Queue();
	        f.Stack_Enqueue(5);
	        f.Stack_Enqueue(15);
	        f.Stack_Enqueue(10);
	        f.Stack_Enqueue(20);
	        f.Stack_Enqueue(30);

	        //f.printQueue();
	        f.Stack_Dqueue();
	       // f.printQueue();
	        f.Stack_Dqueue();
	        f.Stack_Dqueue();
	        f.printQueue();

		}

		

}
