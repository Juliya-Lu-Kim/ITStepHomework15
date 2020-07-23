package com.juliya_zimenina.homework15.task1;

/*
Задание 1
Завод выпускает разные модели кофемашин, с различными характеристиками.
        Кофемашина загружается молотым кофе и водой. Максимальные значения загрузки зависят от модели.
        На приготовление одной чашки тратится:
        * эспрессо – 22 г молотого кофе и 30 мл;
        * американо – 22 г молотого кофе и 100 мл воды.
        Отработанное кофе сбрасывается в специальный бак, емкость бака зависит от модели.
        Кофемашина может выдавать различные ошибки при работе.
        * Отсутствует вода.
        * Отсутствует молотое кофе.
        * Переполнен бак с отработанным кофе.
        Кофемашина имеет кнопки:
        * включения;
        * выключения;
        * Приготовить эспрессо;
        * Приготовить американо;
        * Очистка бака отработанного кофе.
 */

import java.util.Scanner;

public class CoffeeMachine {

    static Scanner scanner = new Scanner(System.in);
    private double groundCoffee; // объем молотого кофе
    private double water;       //  объем воды
    private int countCoffee;   //  учет использованного кофе

    // инициализируем конструктор без параметров

    public CoffeeMachine() {
        this.groundCoffee = 0;
        this.water = 0;
    }

    // метод, для вызова заполнения ингредиентов
    private void setIngredient() {
        System.out.println("\nКофемашина заполняется... ");
        this.groundCoffee = 500.0;
        this.water = 2;
        System.out.println("\nКофемашина заполнена");
    }

    // метод, для определения статуса ингредиентов
    private void getIngredient() {
        System.out.println("\nОбъем доступного молотого кофе (грамм) " + String.format("%.1f", this.groundCoffee));
        System.out.println("\nДоступный объем воды (литр) " + String.format("%.1f", this.water));
    }

    // метод для очистки емкостей кофемашины
    private void cleanMachine() {
        System.out.println("\nОчистка кофемашины");
        this.groundCoffee = 0;
        this.water = 0;
        System.out.println("\nОчистка кофемашины завершена");
    }

    // метод, определеяющий меню для выбора кофе
    private void makeCoffee() {
        System.out.println("===========================");
        System.out.println("Выберете кофе:     ");
        System.out.println("1. Эспрессо");
        System.out.println("2. Американо");
        System.out.println("0. Выход из программы");
        System.out.println("===========================");

        char input = scanner.next().charAt(0);
        switch (input) {
            case '1':
                this.espresso(); // вызов метода Espresso
                break;
            case '2':
                this.americano(); // вызов метода Americano
                break;
            case '0':
                break;
        }
    }

    // метод, отвечающий за цикл приготовления эспрессо
    private void espresso() {
        // цикл, расчитывающий объемы ингредиентов для приготовления эспрессо
        if (this.groundCoffee >= 22 && this.water >= 0.03) {
            System.out.println("\n Приготовление эспрессо...");
            System.out.println("\n Загружено 22 грамма молотого кофе ");
            this.groundCoffee = this.groundCoffee - 22; // расчет используемого молотого кофе
            System.out.println("\nЗагружено 0.03 л");
            this.water = this.water - 0.03; // расчет используемой воды
            System.out.println("\n Ваш эспрессо готов");
            this.countCoffee++;
        } else {
            System.out.println("\nОбъем доступного молотого кофе (грамм) " + String.format("%.1f", this.groundCoffee));
            System.out.println("\nДоступный объем воды (литр) " + String.format("%.1f", this.water));
            System.out.println("\n Не хватает ингридиентов для следующего приготовления.");
            System.out.println("\nПожалуйста, добавьте недостающие ингридиенты до начала приготовления кофе");
            if (this.groundCoffee <= 22)
                System.out.println("Добавьте, пожалуйста, молотоый кофе");
            if (this.water <= 0.03)
                System.out.println("Добавьте, пожалуйста, воды");
        }
    }

    // метод, отвечающий за цикл приготовления американо
    private void americano() {
        // цикл, расчитывающий объемы ингредиентов для приготовления американо
        if (this.groundCoffee >= 22 && this.water >= 0.1) {
            System.out.println("\n Приготовление американо...");
            System.out.println("\n Загружено 22 грамма молотого кофе ");
            this.groundCoffee = this.groundCoffee - 22; // расчет используемого молотого кофе
            System.out.println("\nЗагружено 0.1 л");
            this.water = this.water - 0.1; // расчет используемой воды
            System.out.println("\n Ваш американо готов");
            this.countCoffee++;
        } else {
            System.out.println("\nОбъем доступного молотого кофе (грамм) " + String.format("%.1f", this.groundCoffee));
            System.out.println("\nОБъем доступного объема воды (литр) " + String.format("%.1f", this.water));
            System.out.println("\n Не хватает ингридиентов для следующего приготовления.");
            System.out.println("\nПожалуйста, добавьте недостающие ингридиенты до начала приготовления кофе");
            if (this.groundCoffee <= 22)
                System.out.println("Добавьте, пожалуйста, молотоый кофе");
            if (this.water <= 0.1)
                System.out.println("Добавьте, пожалуйста, воды");
        }
    }

    // метод, осуществляющий доступ к закрытым методам класса
    public void start() {
        System.out.println("==================================================");
        System.out.println("Кофемашина <<My Coffee Machine>>");
        //System.out.println("Выполняются следующие операции, выберете необходимую операцию:- ");
        System.out.println("Статус текущих операций: ");
        this.getIngredient();
        boolean t = true;
        while (t) {
            System.out.println("==================================================");
            System.out.println("Выберите один из пунктов меню: ");
            System.out.println("1. Объем загруженных ингридиентов");
            System.out.println("2. Заполнить контейнеры ингидиентами");
            System.out.println("3. Очистить кофемашину");
            System.out.println("4. Приготовить кофе");
            System.out.println("5. Какое количество кофе было приготовлено?");
            System.out.println("6. Выход из программы");
            System.out.println("==================================================");
            char c = CoffeeMachine.scanner.next().charAt(0);
            switch (c){
                case '1':
                    System.out.println("Состояние");
                    this.getIngredient();
                    System.out.println();
                    break;
                case '2':
                    this.setIngredient();
                    break;
                case '3':
                    this.cleanMachine();
                case '4':
                    this.makeCoffee();
                    break;
                case '5':
                    System.out.println("\nБыло приготовлено " + this.countCoffee + " кофе");
                    break;
                case '6':
                    System.out.println("\nВыход...\n");
                    t = false;
                    break;
           }
        }
    }
}
