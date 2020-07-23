package com.juliya_zimenina.homework15.task2;

/*
Задание 2
После модернизации, завод начал выпускать новые кофемашины, позволяющие кроме предыдуших функций готовить капучино и латте.
Добавилась встроенная емкость для молока, размер емкости зависит от марки кофемашины.
Добавилась ошибка:
* Отсутствует молоко.
Добавились кнопки:
* Приготовить латте;
* Приготовить капучино.
Количество молока, которое тратится на приготовление
капучино и лате, задается во время приготовления. Количество потребляемого кофе и воды, как при приготовлении
чашки эспрессо.

*/


import java.util.Scanner;

public class CoffeeMachineModern {
    static Scanner scanner = new Scanner(System.in);

    private double groundCoffee; // объем молотого кофе
    private double water;       // объем воды
    private double milk;       // объем молока
    private int countCoffee;  // учет использованного кофе

    // инициализация конструктора без параметров


    public CoffeeMachineModern() {
        this.groundCoffee = 0;
        this.water = 0;
        this.milk = 0;
    }

    // метод для вызова команды заполнения кофемашины ингредиентов
    private void setIngredient() {
        System.out.println("\nКофемашина заполняется... ");
        this.groundCoffee = 500.0;
        this.water = 2;
        this.milk = 500.0;
        System.out.println("\nКофемашина заполнена");
    }

    // метод для определения статуса ингредиентов
    private void getIngredient() {
        System.out.println("\nОбъем доступного молотого кофе (грамм) " + String.format("%.1f", this.groundCoffee));
        System.out.println("\nДоступный объем воды (литр) " + String.format("%.1f", this.water));
        System.out.println("\nДоступный объем молока (милилитр) " + String.format("%.1f", this.milk));
    }

    //метод для очистки кофемашины
    private void cleanMachine() {
        System.out.println("\nОчистка кофемашины");
        this.groundCoffee = 0;
        this.water = 0;
        this.milk = 0;
        System.out.println("\nОчистка кофемашины завершена");

    }

    private void makeCoffeeModern() {
        System.out.println("===========================");
        System.out.println("Выберете кофе: ");
        System.out.println("1. Эспрессо");
        System.out.println("2. Американо");
        System.out.println("3. Латте");
        System.out.println("4. Капуччино");
        System.out.println("0. Выход из программы");
        System.out.println("===========================");
        char input = scanner.next().charAt(0);
        switch (input) {
            case '1':
                this.espresso();
                break;
            case '2':
                this.americano();
                break;
            case '3':
                this.latte();
                break;
            case '4':
                this.cappuccino();
                break;
            case '0':
                break;
        }
    }

    // метод, отвечающий за цикл приготовления эспрессо
    private void espresso() {
        // цикл, расчитывающий объемы ингредиентов для приготовления эспрессо
        if (this.groundCoffee >= 22 && this.water >= 0.03) {
            System.out.println("\nПриготовление эспрессо...");
            System.out.println("\nЗагружено 22 грамма кофе");
            this.groundCoffee = this.groundCoffee - 22; // расчет используемого молотого кофе (остатка)
            System.out.println("\nЗагружено 0.03 л воды");
            this.water = this.water - 0.03; // расчет используемой воды
            System.out.println("\nВаш эспрессо готов");
            this.countCoffee++;
        } else {
            System.out.println("\nДоступный объем молотого кофе (грамм) " + String.format("%.1f", this.groundCoffee));
            System.out.println("\nДоступный объем воды (литр) " + String.format("%.1f", this.water));
            System.out.println("\n Не хватает ингредиентов для следующего приготовления.");
            System.out.println("\nПожалуйста, добавьте недостающие ингредиенты до начала приготовления кофе:");
            if (this.groundCoffee <= 22)
                System.out.println("Добавьте,пожалуйста, молотый кофе");
            if (this.water <= 0.03)
                System.out.println("Добавьте, пожалуйста, воды");
        }
    }

    // метод, отвечающий за цикл приготовления американо
    private void americano() {
        // цикл, расчитывающий объемы ингредиентов для приготовления американо
        if (this.groundCoffee >= 22 && this.water >= 0.1) {
            System.out.println("\nПриготовление американо...");
            System.out.println("\nЗагружено 22 грамма кофе");
            this.groundCoffee = this.groundCoffee - 22; // расчет используемого молоого кофе (остатка)
            System.out.println("\nЗагружено 0.1 л");
            this.water = this.water - 0.1; // расчет используемой воды
            System.out.println("\nВаш американо готов");
            this.countCoffee++;
        } else {
            System.out.println("\nДоступный объем молотого кофе (грамм) " + String.format("%.1f", this.groundCoffee));
            System.out.println("\nДоступный объем воды (литр) " + String.format("%.1f", this.water));
            System.out.println("\n Не хватает ингредиентов для следующего приготовления.");
            System.out.println("\nПожалуйста, добавьте недостающие ингредиенты до начала приготовления кофе:");
            if (this.groundCoffee <= 22)
                System.out.println("Добавьте, пожалуйста, молотый кофе");
            if (this.water <= 0.1)
                System.out.println("Добавьте, пожалуйста, воды");

        }
    }

    // метод, отвечающий за цикл приготовления латте
    private void latte() {
        // цикл, расчитывающий объемы ингредиентов для приготовления латте
        if (this.groundCoffee >= 22 && this.water >= 0.03 && this.milk >= 50) {
            System.out.println("\nПриготовление латте...");
            System.out.println("\nЗагружено 22 грамма кофе");
            this.groundCoffee = this.groundCoffee - 22; // расчет используемого молотого кофе (остаток)
            System.out.println("\nЗагружено 0.03 л воды");
            this.water = this.water - 0.03; // расчет используемой воды
            System.out.println("Введите необходимый объем молока (не более 500 мл)");
            int volumeMilk = scanner.nextInt();
            if (volumeMilk > 500) {
                System.out.println("Превышен объем контейнера для молока");
                System.out.println("Пожалуйста, уменьшите объем загружаемого молока");
                while (true) {
                    if (volumeMilk > 500) {
                        volumeMilk = scanner.nextInt();
                    } else {
                        System.out.println("\nЗагружено " + volumeMilk + " мл молока");
                        break;
                    }
                }
                this.milk = this.milk - volumeMilk;
                System.out.println("Ваш латте готов");
                this.countCoffee++;
            }

        } else {
            System.out.println("\nДоступный объем молотого кофе (грамм) " + String.format("%.1f", this.groundCoffee));
            System.out.println("\nДоступный объем воды (литр) " + String.format("%.1f", this.water));
            System.out.println("\nДоступный объем молока (милилитр) " + String.format("%.1f", this.milk));
            System.out.println("\n Не хватает ингредиентов для следующего приготовления");
            System.out.println("\nПожалуйста, добавьте недостающие ингредиенты до начала приготовления кофе:");
            if (this.groundCoffee <= 22)
                System.out.println("Добавьте, пожалуйста, молотоый кофе");
            if (this.water <= 0.03)
                System.out.println("Добавьте, пожалуйста, воды");
            if (this.milk <= 50)
                System.out.println("Добавьте, пожалуйста, молоко");
        }
    }


    // метод, отвечающий за цикл приготовления капуччино
    private void cappuccino() {
        if (this.groundCoffee >= 22 && this.water >= 0.03 && this.milk >= 50) {
            System.out.println("\nПриготовление капуччино...");
            System.out.println("\nЗагружено 22 грамма кофе");
            this.groundCoffee = this.groundCoffee - 22; // расчет используемого молотого кофе (остаток)
            System.out.println("\nЗагружено 0.03 л воды");
            this.water = this.water - 0.03; // расчет используемой воды
            System.out.println("Введите необходимый объем молока (не более 500 мл)");
            int volumeMilk = scanner.nextInt();
            if (volumeMilk > 500) {
                System.out.println("Превышен объем контейнера для молока");
                System.out.println("Пожалуйста уменьшите объем загружаемого молока");
                while (true) {
                    if (volumeMilk > 500) {
                        volumeMilk = scanner.nextInt();
                    } else {
                        System.out.println("\nЗагружено " + volumeMilk + " мл молока");
                        break;
                    }
                }
                this.milk = this.milk - volumeMilk;
                System.out.println("Ваш капуччино готов");
                this.countCoffee++;
            }
        } else {
            System.out.println("\nДоступный объем молотого кофе (грамм) " + String.format("%.1f", this.groundCoffee));
            System.out.println("\nДоступный объем воды (литр) " + String.format("%.1f", this.water));
            System.out.println("\nДоступный объем молока (милилитр) " + String.format("%.1f", this.milk));
            System.out.println("\n Не хватает ингредиентов для следующего приготовления.");
            System.out.println("\nПожалуйста, добавьте недостающие ингредиенты до начала приготовления кофе: ");
            if (this.groundCoffee <= 22)
                System.out.println("Добавьте, пожалуйста, молотоый кофе");
            if (this.water <= 0.03)
                System.out.println("Добавьте, пожалуйста, воды");
            if (this.milk <= 50)
                System.out.println("Добавьте, пожалуйста, молоко");
        }
    }

    // метод, осуществляющий доступ к закрытым методам класса CoffeeMachineModern
    public void start() {
        System.out.println("=====================================================");
        System.out.println("Кофемашина <<My Coffee Machine 2>>");
        System.out.println("Статус текущих операций");
        this.getIngredient();
        boolean t = true;
        while (t) {
            System.out.println("================================================");
            System.out.println("Выберите один из пунктов меню: ");
            System.out.println("1. Объем загруженных ингредиентов");
            System.out.println("2. Заполнить контейнеры ингредиентами");
            System.out.println("3. Очистить кофемашину");
            System.out.println("4. Приготовить кофе");
            System.out.println("5. Какое количество кофе было приготовлено?");
            System.out.println("6. Выход из программы");
            System.out.println("=================================================");
            char c = CoffeeMachineModern.scanner.next().charAt(0);
            switch (c) {
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
                    this.makeCoffeeModern();
                    break;
                case '5':
                    System.out.println("\nКоличество приготовленного кофе: " + this.countCoffee);
                    break;
                case '6':
                    System.out.println("\nВыход...\n");
                    t = false;
                    break;
            }
        }
    }
}
