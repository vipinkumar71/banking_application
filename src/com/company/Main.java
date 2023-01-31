package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome banking application");
        System.out.println("Our Operation");
        System.out.println("click 1 to exit form system");
        System.out.println("click 2 for money transfer");
        System.out.println("click 3 to get money");
        int operation = sc.nextInt();

        if(operation == 1 ){
            System.out.println("Exiting from system");
        } else if (operation == 2){
            System.out.println("You money is transferring");
        }else if(operation ==3){
            System.out.println("You got you money");
        }else{
            System.out.println("Invalid operation");
        }
    }
}
