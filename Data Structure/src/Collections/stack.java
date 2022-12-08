package Collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        
        Stack<Number> stack = new Stack<Number>();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the element of the Stack:  ");
        
        for(int i=1;i<=10;i++)
        {
           int a=sc.nextInt();
           stack.add(a);
        }
        
        Iterator itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }

        System.out.println("");
        System.out.println("");
        
        stack.pop();
        stack.pop();
        stack.pop();
        
        Iterator itr1 = stack.iterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + "\t");
        }

        System.out.println("");

        System.out.println("\n");
        System.out.println("Using For each loop: ");

        for (Number a : stack) {
            System.out.println(a);
        }
        
        System.out.println("");
        System.out.println(stack);
        System.out.println("");
        System.out.println("Top of the stack is: " + stack.peek());
    }

}
