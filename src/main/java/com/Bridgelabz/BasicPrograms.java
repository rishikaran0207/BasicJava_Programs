package com.Bridgelabz;
import java.util.Scanner;
    public class BasicPrograms {
        public static void main(String[] args) {
            Scanner x =new Scanner(System.in);
            System.out.println("Enter the number to find it is even or odd");
            int num1 =x.nextInt();
            if(num1 % 2 == 0)
                System.out.println("The number "+num1+"  is Even");
            else
                System.out.println("The number "+num1+"  is Odd");
        }
    }