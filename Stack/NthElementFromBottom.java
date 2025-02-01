package Queue_Stack;

import java.util.Stack;

public class NthElementFromBottom {
    public static int getNthFromBottom(Stack<Integer> stack, int n) {
        if (n < 1 || n > stack.size()) {
            return -1;  // Invalid position
        }
        return stack.get(n - 1);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // for (int i = 1; i <= 5; i++) {
        //     stack.push(i);
        // }
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        int nthElement = 3;  
        System.out.println(nthElement + "rd Element from Bottom: " + getNthFromBottom(stack, nthElement));  // Output: 3
    }
}

