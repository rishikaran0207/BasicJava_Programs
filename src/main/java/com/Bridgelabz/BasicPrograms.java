package com.Bridgelabz;
import java.util.Scanner;

    public class BasicPrograms {
        public static int heads=0,tails=0;
        public static void main(String[] args) {
            Scanner c=new Scanner(System.in);

            System.out.println("Enter a value to flip a coin: ");
            int flip=c.nextInt();
            if (flip<0)
                System.out.println("The Entered Number is Wrong");
            else

                for(int i=0;i<flip;i++)
                {

                    float coin= (float) Math.random();
                    System.out.printf("\nThe probability flip of coin: "+"%.2f",coin);
                    if( coin > 0.5 ) {
                        heads = heads + 1;

                    }
                    else
                        tails = tails + 1;

                }
            if(flip > 0) {
                System.out.println("\nThe Heads we got are: " + heads);
                System.out.println("\nThe Tails we got are: " + tails);
                int Perhead = (heads * 100) / flip;
                int Pertail = (tails * 100) / flip;
                System.out.println("\nThe Percentage of Head is :" + Perhead + "%");
                System.out.println("\nThe Percentage of Tails is:" + Pertail + "%");
            }
        }
    }
