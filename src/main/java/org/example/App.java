package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 22 - Comparing Numbers");

        int n1,n2,n3;
        System.out.print("Enter the first number: ");
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();

        System.out.print("Enter the second number: ");
        n2 = in.nextInt();

        System.out.print("Enter the third number: ");
        n3 = in.nextInt();

        if(n1>n2 & n1>n3)
        {
            System.out.print("The Largest number is " + n1);
        }
        else if(n2>n1 & n2>n3)
        {
            System.out.print("The Largest number is " + n2);
        }
        else if(n3>n1 & n3>n2)
        {
            System.out.print("The Largest number is " + n3);
        }


    }
}
