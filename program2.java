package com.company;

import java.util.Scanner;

public class program2 {

    public static void main(String[] args){
        System.out.println("Please enter two numbers:");
        Scanner object2 = new Scanner(System.in);
        int num1 = object2.nextInt();
        int num2 = object2.nextInt();

        System.out.println("Please enter operation to perform:");
        System.out.println("AVAILABLE OPTIONS: 1- + , 2- *,3- /,4- (+,*,/), 5- Advanced Operations");
        int choice = object2.nextInt();
        while(true) {
            if (choice == 1) {
                System.out.println("YOU CHOOSE ADDITION");
                int Sum = num1 + num2;
                System.out.print("THE SUM OF " + num1 + " AND " + num2 + " is " + Sum);

            } else if (choice == 2) {
                System.out.println("YOU CHOOSE Multiplication");
                int Prod = num2 * num1;
                System.out.println("THE PRODUCT OF " + num1 + " AND " + num2 + " is " + Prod);

            } else if (choice ==3){
                System.out.println("YOU CHOOSE DIVISION ");
                if (num2 != 0) {
                    float divi = (float) num1 / num2;  // Ensures float division
                    System.out.println("THE QUOTIENT OF " + num1 + " AND " + num2 + " IS " + divi);
                } else {
                    System.out.println("ERROR: Division by zero is not allowed!");
                }

            }
            else if(choice == 4){
                System.out.println("YOU CHOOSE ALL OPERATIONS");
                int sum = num1 + num2;
                int prod = num1 * num2;
                float divi = (num2 != 0) ? (float) num1 / num2 : 0;


                System.out.println("THE SUM OF " + num1 + " AND " + num2 + " IS " + sum);
                System.out.println("THE PRODUCT OF " + num1 + " AND " + num2 + " IS " + prod);
                if (num2 != 0) {
                    System.out.println("THE QUOTIENT OF " + num1 + " AND " + num2 + " IS " + divi);
                } else {
                    System.out.println("ERROR: Division by zero is not allowed!");
                }
            }
            else if (choice == 5){
                int Ad_Choice = 0;
                System.out.println("You choose Advanced operations");
                System.out.println("Please choose options: \n 1- Modulus,\n 2- Power, \n 3- Square Root");
                 Ad_Choice = object2.nextInt();

                switch (Ad_Choice){
                    case 1:

                        int modulus = num1 - (num1 / num2) * num2;
                        System.out.println("\n The Modulus is : " + modulus);
                        break;

                    case 2:
                        int power = 1;
                        for (int i = 0; i < num2; i++) {
                            power *= num1;
                            System.out.println("\n The Power is : " + power);

                        }
                        break;

                    case 3:
                        int sqrt = 0, odd = 1, temp = num1;
                        while (temp >= odd) {
                            temp -= odd;
                            odd += 2;
                            sqrt++;
                        }
                        System.out.println("\n The Sqrt is : " + sqrt);

                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + Ad_Choice);
                }


            }
            // Add an exit condition
            System.out.println("Press 0 to exit ");
            int exitChoice = object2.nextInt();
            if (exitChoice == 0) {
                break;
            }
        }

        }

    }

