/*Basic program

public class basic{
    public static void main(String args[]){
       int a,b,c;
       a=10;
       b=20;
       c=a+b;
       System.out.println(c);
    }
}



//add two number using scanner

import java.lang.System;
import java.util.Scanner;

class basic{
    public static void main(String args[])
    {
        int a,b;
        Scanner add=new Scanner(System.in);
        System.out.println("enter the value a=");
        a=add.nextInt();
        System.out.println("enter the value b=");
        b=add.nextInt();
        int c=a+b;
        System.out.println("total value ="+c);
    }
} */
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Read 10 numbers from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        // Print the 10 numbers
        for (int i = 0; i < 10; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        scanner.close();
    }
}