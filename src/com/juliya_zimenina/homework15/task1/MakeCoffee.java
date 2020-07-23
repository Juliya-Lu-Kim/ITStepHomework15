package com.juliya_zimenina.homework15.task1;

import java.util.Scanner;

public class MakeCoffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nДля включения кофемашины введите Y, для выхода из программы введите N\n");
        char d;
        d = scanner.next().charAt(0);
        if (d == 'Y' || d == 'y'){
            CoffeeMachine coffeeMachine = new CoffeeMachine(); // создание экземпляра класса CoffeeMachineModern

            // для вызова приватных методов клсаа CoffeeMachineModern вызываем публичный метод start();
            coffeeMachine.start();
            System.out.println("\nВыключение\n");
        }else {
            System.out.println("\nВыключение\n");
        }

    }
}
