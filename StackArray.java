
import java.util.Scanner;

public class StackArray {
    static int[] stack = new int[5];
    static int top = -1;

    // Push an element
    static void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow!");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed");
        }
    }

    // Pop an element
    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    // Display top element
    static void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println("Top Element: " + stack[top]);
        }
    }

    // Display all elements
    static void display() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    push(value);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
