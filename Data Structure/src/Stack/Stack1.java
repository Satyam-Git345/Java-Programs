package Stack;

import java.util.Scanner;

public class Stack1 {

    static final int MAX = 100;
    int top;
    int[] arr = new int[MAX];

    public Stack1() {
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == MAX - 1) {
            return true;
        } else {
            return false;
        }
    }

    void Push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow.....");
            return;
        }
        top = top + 1;
        arr[top] = x;
        System.out.println(x + " Pushed into stack.....");
    }

    void Pop() {
        if (isEmpty()) {
            System.out.println("Stack underFlow.....");
        }
        int x = arr[top];
        top = top - 1;
        System.out.println(x + " Poped into stack.....");
    }

    void peek() {
        if (top < 0) {
            System.out.println("Stack underFlow....");
        } else {
            int x = arr[top];
            System.out.println("Top Of the stack Is: " + top);
            System.out.println("Top Most Element of the stack Is: " + arr[top]);
        }
    }

    void Display() {
        System.out.println("Stack Elements are: ");

        for (int x = 0; x <= top; x++) {
            System.out.print(arr[x] + "\n");
        }
    }
}

class UseStack1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack1 s = new Stack1();
        int choice;
        String choice2 = null;

        do {
            System.out.println("");
            System.out.println("1. Push......");
            System.out.println("2. Pop........");
            System.out.println("3. Print the Top element......");
            System.out.println("4. Print all the element of the stack.......");
            System.out.println("5. Chack Stack is Full or not.......");
            System.out.println("6. Chack Stack is Empty or not.......");
            System.out.println("7. Quit......");

            System.out.println("Plese enter your choice!!");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("enter the element to pushed: ");
                    int data;
                    data = sc.nextInt();
                    s.Push(data);
                    break;
                }

                case 2: {
                    s.Pop();
                    break;
                }

                case 3: {
                    s.peek();
                    break;
                }

                case 4: {
                    s.Display();
                    break;
                }

                case 5: {
                    boolean b = s.isFull();
                    if (b == true) {
                        System.out.println("Stack is Full........");
                    } else {
                        System.out.println("Stack is not Full.....");
                    }
                    break;
                }

                case 6: {
                    boolean b = s.isEmpty();
                    if (b == true) {
                        System.out.println("Stack is Empty........");
                    } else {
                        System.out.println("Stack is not Empty.....");
                    }
                    break;
                }

                case 7: {
                    System.exit(0);
                    break;
                }

                default:
                    System.out.println("Invalid Choice!!! Plese choose correct Option......");

            }

            System.out.println("Do you want to continue(Y/N): ");
            choice2 = sc.next();
        } while (choice2.equalsIgnoreCase("y"));
    }
}
