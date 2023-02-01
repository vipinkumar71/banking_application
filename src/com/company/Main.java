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
            System.out.println("Exiting from the system");
        } else if (operation == 2){
            System.out.println("How much money do you have");
            int balance = sc.nextInt();
            System.out.println("How much money you want to transfer");
            int transfer = sc.nextInt();
            if(balance < transfer){
                System.out.println("You have insufficient balance");
            }else if (balance > transfer || balance == transfer){
                System.out.println("You transferred" + transfer );
                System.out.println("Your current balance is: " +(balance-transfer));
            } else{
                System.out.println("You transferred you money");
                System.out.println("Congratulation");
            }
        }else if(operation ==3){
            System.out.println("Enter you balance");
            int balance = sc.nextInt();
            System.out.println("How much money you want to take");
            int money = sc.nextInt();
            if(balance<money){
                System.out.println("Your balance is not enough to do this operation");
            }
            else if(balance > money){
                System.out.println("You got your money :" +money);
                System.out.println("Your current balance is : " + (balance-money));
            }else if(balance == money){
                System.out.println("You got all of your money");
            }
        }else{
            System.out.println("You got all of your money");
        }
    }
}
