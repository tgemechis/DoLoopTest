package com.company;

import java.util.Scanner;

public class DoLoopTest {

    public static void main(String[] args) {
        // write your code here

        boolean condition = false;
        Scanner scan = new Scanner(System.in);
        String colour;


        do {
            System.out.println("Enter your favourite colour");
            colour = scan.nextLine();
            if (colour.equalsIgnoreCase("blue")) {

                condition = false;
            } else {
                condition = true;

            }

        }while (condition) ;
            System.out.println("Yup, blue is my favourite colour too. ");


        }
    }