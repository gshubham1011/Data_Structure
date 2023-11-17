package Stack;

import java.util.Stack;

public class IsBalanced_Stack {
	
	public static void main(String[] args) {
		String s = "[s+{4+2}](2+)";
		System.out.println(" Is balanced :"+isBalancedStack(s));		
	}
	
	public static boolean isBalancedStack(String s ) {
		Stack<Character> stack = new Stack<Character>();
		
		for(char c: s.toCharArray()) {
			if( c=='(' || c =='{' || c=='[') {
				stack.push(c);
			}
		   if( c==')' || c =='}' || c==']') {
					 Character top = (Character) stack.pop();
					 if((top == '(' && c !=')') || (top == '{' && c !='}') || (top == '[' && c !=']')) {
						 return false;
					 }
				}
			}
		return stack.empty();
	}

}
