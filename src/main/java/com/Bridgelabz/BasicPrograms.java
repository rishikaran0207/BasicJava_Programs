package com.Bridgelabz;
import java.util.Scanner;

    public class BasicPrograms {
        public static int heads=0,tails=0;
        public static void main(String[] args) {
            Scanner y =new Scanner(System.in);
            System.out.println("Enter a Value : ");
            int pow =y.nextInt();
            int value;
            for (int i=1;i<=pow;i++)
            {
                value=(int)Math.pow(2,i);
                System.out.println("\n The Pwer of given value "+i+" is "+value);
            }

        }


    }
