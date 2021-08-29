package com.Bridgelabz;
import java.util.Scanner;
    public class BasicPrograms {
        public static void main(String[] args) {
            Scanner x =new Scanner(System.in);
            System.out.println("Enter an alphabet to ckeck vowels or consonant:");
            char alp =x.next().charAt(0);
            if(alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u')
                System.out.println("The character "+ alp +"  is a vowel");
            else
                System.out.println("The character "+ alp +"  is an Consonant");
        }
    }