package Stack;

import java.util.Stack;

/**
 * @author sgupt146
 *
 * info this code with give you the least or minimum element present in to the stack
 */
public class Stack_Mini_Element {

	static Stack<Integer> mainStack=new Stack<Integer>();
	static Stack<Integer> tempStack=new Stack<Integer>(); // maximum problem can be solved by temp stack in Stack
	
	public static void main(String[] args) {
		
		customepush(12);
		customepush(10);
		customepush(15);
		customepush(20);
		customepush(6);
	    System.out.println(tempStack.peek() +" is the lowest number of the stack ");
		customepush(30);
		customepush(2);
	    System.out.println(tempStack.peek() +" is the lowest number of the stack ");
 	    custompop();
 	    custompop();
 	    custompop();
 	    custompop();
		customepush(2);
		customepush(2);
 	    custompop();
	    System.out.println(tempStack.peek() +" is the lowest number of the stack ");
	}

	private static void customepush(int i) {

		mainStack.push(i);
            if(tempStack.isEmpty()) {
            	tempStack.push(i);
            }else if(mainStack.peek()<=tempStack.peek()){
            	tempStack.push(i);
            }
	}
	private static void custompop() {
	    int val=mainStack.peek();
        mainStack.pop();
        if(val==tempStack.peek()) {
        	tempStack.pop();
        }
		
     
	}

 
	
}
