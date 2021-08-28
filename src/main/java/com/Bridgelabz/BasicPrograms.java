package com.Bridgelabz;
import java.util.Scanner;

    public class BasicPrograms {
        public static int heads=0,tails=0;
        public static void main(String[] args) {
            Scanner x =new Scanner(System.in);
            System.out.println("Enter an number: ");
            int num =x.nextInt();
            int constant=1;
            float value = 0.0f;
            for (int i=1;i<=num;i++)
            {
                value = value + (float) constant / i ;
            }
            System.out.println("For The Harmonic value of "+num+" is "+value);
        }
    }