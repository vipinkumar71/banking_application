package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber =sc.nextInt();
        System.out.println("Enter second number");
        int secondNumber = sc.nextInt();
        int temp =0;
        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("Our first number is:" +firstNumber);
        System.out.println("Out second number is: "+ secondNumber);
    }
}
