package com.company;

import java.util.Scanner;

public class program2 {

    public static void main(String[] args){
        System.out.println("Please enter two numbers:");
        Scanner object2 = new Scanner(System.in);
        int num1 = object2.nextInt();
        int num2 = object2.nextInt();

        System.out.println("Please enter operation to perform:");
        System.out.println("AVAILABLE OPTIONS: 1- + , 2- *,3- /");
        int choice = object2.nextInt();
        while(true) {
            if (choice == 1) {
                System.out.println("YOU CHOOSE ADDITION");
                int Sum = num1 + num2;
                System.out.print("THE SUM OF " + num1 + " AND " + num2 + " is " + Sum);

            }
            else if (choice == 2) {
                System.out.println("YOU CHOOSE Multiplication");
                int Prod = num2*num1;
                System.out.println("THE PRODUCT OF "+num1+" AND "+num2+" is " +Prod);

            }
            else {
                System.out.println("YOU CHOOSE DIVISION ");
                float Divi = num1/num2;
                System.out.println("THE Remainder of " +num1+ " AND " + num2+ " IS " +Divi);

            }

            // Add an exit condition
            System.out.println("Press 0 to exit ");
            int exitChoice = object2.nextInt();
            if (exitChoice == 0) {
                break; // Exit the loop
            }
        }





    }
}
