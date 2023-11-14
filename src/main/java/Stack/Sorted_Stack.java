package Stack;

import java.util.Stack;

public class Sorted_Stack {

	public static void main(String[] args) {
		Stack<Integer> stack1=new Stack<Integer>();
		System.out.println(" is stack emplty :"+stack1.isEmpty());
		stack1.push(10);
		stack1.push(40);
		stack1.push(20);
		stack1.push(30);
		System.out.println(stack1); // inbuilt Java method to display
		SortedStack(stack1);

	}

	public static void SortedStack(Stack<Integer> stack) {
		Stack<Integer> tempStack=new Stack<Integer>();
		while(!stack.isEmpty()) {
			int val = stack.pop();			
			while(!tempStack.isEmpty() && val<tempStack.peek() ) {
				int t=tempStack.pop();
				stack.push(t);
			}
			tempStack.push(val);
		}
        System.out.println(tempStack);
      }
}
