
import java.util.Scanner;

public class QueueArray {
    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    // Enqueue an element
    static void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow!");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println(value + " inserted");
        }
    }

    // Dequeue an element
    static void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow!");
        } else {
            System.out.println("Removed: " + queue[front]);

            // Shift remaining elements
            for (int i = 0; i < rear; i++) {
                queue[i] = queue[i + 1];
            }

            rear--;

            if (rear == -1) {
                front = -1;
            }
        }
    }

    // Display front element
    static void showFront() {
        if (front == -1) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Front Element: " + queue[front]);
        }
    }

    // Display all elements
    static void display() {
        if (front == -1) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Queue Elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    enqueue(value);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    showFront();
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
