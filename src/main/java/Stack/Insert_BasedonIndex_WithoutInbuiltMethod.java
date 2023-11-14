package Stack;

import java.util.Stack;

public class Insert_BasedonIndex_WithoutInbuiltMethod {

	public static void main(String[] args) {

		Stack<Integer> stack=new Stack<Integer>();
		Stack<Integer> stack1=new Stack<Integer>();
		System.out.println(" is stack emplty :"+stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack); // inbuilt Java method to display
		stackReverse(stack,stack1);
		InsertWithoutInbuiltMethod(stack1,stack,22,2);
		System.out.println(stack); 


	}
	public static void InsertWithoutInbuiltMethod(Stack<Integer> s1,Stack<Integer> s,int val,int index) {
		int count =0;
		while(!s1.isEmpty()) {
				if(count==index) {
					s.push(val);
				}
				else {
					s.push(s1.pop());	
				}
				count++;
			}
	}
	public static void stackReverse(Stack<Integer> s1,Stack<Integer> s2) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());	
			}
	}

}
