package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String Name = "Iheb";
        String Surname = "Mrad";
        int ID = 000000;

        System.out.println("The student ID of " + Name + " " + Surname + " " + " is " + ID);
        System.out.println("Wrong student ID, check again please !");

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        System.out.println("The right student ID of " + Name + " " + Surname + " is " + userInput);


    }
}
