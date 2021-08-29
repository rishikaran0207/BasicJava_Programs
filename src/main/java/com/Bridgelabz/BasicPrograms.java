package com.Bridgelabz;
import java.util.Scanner;
    public class BasicPrograms {
        public static void main(String[] args) {
            Scanner x =new Scanner(System.in);
            System.out.println("Enter three numbers to find greatest--");
            System.out.println("Enter the first number");
            int n1= x.nextInt();
            System.out.println("Enter the Second number");
            int n2= x.nextInt();
            System.out.println("Enter the third number");
            int n3= x.nextInt();
            if(n1>n2 && n1>n3)
                System.out.println("The Number "+ n1 +"  is Largest among Three number");
            else if(n2>n3)
                System.out.println("The Number "+ n2 +"  is Largest among Three number");
            else
                System.out.println("The Number "+ n3 +"  is Largest among Three number");
        }
    }