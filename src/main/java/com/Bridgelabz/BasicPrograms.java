package com.Bridgelabz;
import java.util.Scanner;
public class BasicPrograms {
    public static void main(String[] args) {
            Scanner x =new Scanner(System.in);
            System.out.println("Enter the two number to swap: ");
            System.out.println("Enter the 1st number:");
            int num1 =x.nextInt();
            System.out.println("Enter the 2nd number:");
            int num2 =x.nextInt();
            int temp;
            temp=num1;
            num1=num2;
            num2=temp;
            System.out.println("After swapping 1st number is "+num1);
            System.out.println("After swapping 2nd number is "+num2);
        }
    }

