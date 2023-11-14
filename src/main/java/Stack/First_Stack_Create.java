package Stack;

import java.util.Stack;

public class First_Stack_Create {

	public static void main(String[] args) {
		Stack<Integer> stack1=new Stack<Integer>();
		System.out.println(" is stack emplty :"+stack1.isEmpty());
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		System.out.println(stack1); // inbuilt Java method to display
		stack1.pop();
		System.out.println(stack1);
		System.out.println("Top Value :"+stack1.peek());
		stack1.add(11); // another inbuilt method to insert
		System.out.println(stack1);
		stack1.add(2, 45); // in built Java method to insert based on index
		System.out.println(stack1);
        stack1.remove(1);         //inbuilt java method to remove from stack
		System.out.println(stack1);


	}

}
