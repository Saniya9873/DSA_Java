package Queue_Stack;
import java.util.Stack;
public class ReverseNumberUsingStack {
      
    public static void main(String[] args) {
        int num = 12345;
        Stack<Integer> stack = new Stack<>();

        while (num > 0) {
            stack.push(num % 10); // Push last digit
            num /= 10; // Remove last digit
        }

        int reversed = 0;
        int place = 1;
        while (!stack.isEmpty()) {
            reversed += stack.pop() * place;
            place *= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
