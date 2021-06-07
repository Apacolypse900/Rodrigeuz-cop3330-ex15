package com.examples;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj = new Scanner(System.in);

        System.out.print("What is your username? ");
            String Username = myObj.next();

        System.out.print("What is the password? ");
            String Password = myObj.next();

        if (Password.equals("abc$123"))
            System.out.println("Welcome!");
        else
            System.out.println("I dont know you.");
    }
}
