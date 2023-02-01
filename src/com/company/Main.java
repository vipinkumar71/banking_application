package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your exam Result");
        int examResult = sc.nextInt();
        switch(examResult){
            case 50:
                System.out.println("You get D Degree");
                break;
            case 60:
                System.out.println("You got C");
                break;
            case 75:
                System.out.println("You got B");
                break;
            case 90:
                System.out.println("You got A");
                break;
        }
    }
}
