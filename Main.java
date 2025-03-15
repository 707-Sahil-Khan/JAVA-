package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
//        System.out.println("New guy");
//        System.out.println(0+'a');
        //code
//        float $b = 1.1f;
//        System.out.println($b);
        //SIMPLE PROGRAM TO FIND IF A PERSON IS ADULT OR NOT
        //code
        Scanner object = new Scanner(System.in);
        while(true) {
            int age = 0;
            System.out.println(" Please Enter your age :");
            age = object.nextInt();
            boolean isAdult = (age > 18);
            System.out.println(isAdult ? "You are an adult" : "You are young");
            object.close();
        }


    }

}
