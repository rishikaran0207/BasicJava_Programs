package com.Bridgelabz;
import java.util.Scanner;

    public class BasicPrograms {
        public static int heads=0,tails=0;
        public static void main(String[] args) {
            Scanner x =new Scanner(System.in);
            System.out.println("Enter a Year to check: ");
            int year =x.nextInt();
            if(year < 1000 || year > 9999)
                System.out.println("\nYou entered wrong year");
            else
            {
                if(year % 4 == 0)
                    System.out.println("\nEntered year is Leap Year");
                else
                    System.out.println("\nEntered year is not a Leap year");
            }

        }

    }
