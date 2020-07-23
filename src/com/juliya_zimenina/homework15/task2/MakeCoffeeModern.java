package com.juliya_zimenina.homework15.task2;

import java.util.Scanner;

public class MakeCoffeeModern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Для включения кофемашины введите Y, для выхода из программы введите N\n");
        char d;
        d = scanner.next().charAt(0);
        if (d == 'Y' || d == 'y'){
            CoffeeMachineModern coffeeMachineModern = new CoffeeMachineModern(); // создание экземпляра класса CoffeeMachineModern

            // для вызова приватных методов клсаа CoffeeMachineModern вызываем публичный метод start();
           coffeeMachineModern.start();
            System.out.println("\nВыключение\n");
        }else {
            System.out.println("\nВыключение\n");
        }

    }
}
