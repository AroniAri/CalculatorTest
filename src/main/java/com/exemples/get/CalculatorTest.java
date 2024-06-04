package com.exemples.get;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        float number_1 ; float number_2;
        System.out.println("Enter THer First Number");
        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();
        System.out.println("Enter The Second Number");
        Scanner scan2 = new Scanner(System.in);
        number_2 = scan.nextFloat();
        System.out.println("You Have Entered");
        System.out.print(number_1);
        System.out.print("And");
        System.out.print(number_2);
        String prompt = "0 for addition; 1 for subtracion, 2 multiplacation, 3 For division";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch(input){
            case 0:
                System.out.println(number_1 + number_2);
                break;
            case 1:
                System.out.println(number_1 - number_2);
                break;
            case 2:
                System.out.println(number_1 * number_2);
                break;
            case 3:
                System.out.println(number_1 / number_2);
                break;
            default:
                System.out.println("Invalid Input");


        }












    }

}
