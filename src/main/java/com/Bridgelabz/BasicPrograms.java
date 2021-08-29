package com.Bridgelabz;
import java.util.Scanner;
    public class BasicPrograms {
        public static int heads=0,tails=0;
        public static void main(String[] args) {
            Scanner x =new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num =x.nextInt();
            System.out.println("Enter the divisor: ");
            int div =x.nextInt();
            int quotient=num / div;
            int remainder=num % div;
            System.out.println("The Quotient of the number: "+quotient);
            System.out.println("The Remainder of the number:"+remainder);
        }
    }