package com.juliya_zimenina.homework15.task3;

import java.util.Scanner;

public class MakeNewCoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nДля включения кофемашины введите Y, для выхода из программы введите N\n");
        char d;
        d = scanner.next().charAt(0);
        if (d == 'Y' || d == 'y'){
            NewCoffeeMachine newCoffeeMachine = new NewCoffeeMachine();
            newCoffeeMachine.start();
            System.out.println("\nВыключение\n");
        }else {
            System.out.println("\nВыключение\n");
        }

    }

}
