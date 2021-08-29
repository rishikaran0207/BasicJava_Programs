package com.Bridgelabz;
import java.util.Scanner;

    public class BasicPrograms {
        public static int heads=0,tails=0;
        public static void main(String[] args) {
            Scanner y =new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num =y.nextInt();
            System.out.println("the factor is ");
            for (int i=2;i<num;i++)
            {
                while(num%i==0) {
                    System.out.println(i);
                    num = num / i;
                }
            }
            if (num>2)
                System.out.println(num);
        }
    }