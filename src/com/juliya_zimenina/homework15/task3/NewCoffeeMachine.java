package com.juliya_zimenina.homework15.task3;
/*
После модернизации, завод начал выпускать новые кофемашины, в которые можно загружать, кроме молотого кофе,
еще и немолотый кофе. Машина сама мелет кофе. Размер
бака для немолотого кофе зависит от модели. Зерновое кофе
после помолки попадает в бак для молотого кофе и уже оттуда идет в приготовление.
Чтобы удешевить машины, маркетинговый отдел придумал сократить функции этих кофемашин.
Данные кофемашины умеют готовить только:
* американо;
* лате.
 */

import java.util.Scanner;

public class NewCoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    private double groundCoffee; // Объем молотого кофе
    private double beenCoffee;   // Объем кофейных зерен
    private double water;      // Объем воды
    private double milk;      // Объем молока
    private int countCoffee; // учет использованного кофе

    // инициализируем конструктор без параметров


    public NewCoffeeMachine() {
        this.groundCoffee = 0;
        this.beenCoffee = 0;
        this.water = 0;
        this.milk = 0;
    }

    // метод для вызова заполнения ингредиентов
    private void setIngredient() {
        System.out.println("\nКофемашина заполняется...");
        this.groundCoffee = 500;
        this.beenCoffee = 500;
        this.water = 2;
        this.milk = 500;
        System.out.println("\nКофемашина заполнена");
    }

    // метод, определяющий статус ингредиентов
    private void getIngredient() {
        System.out.println("\nДоступный объем молотого кофе (грамм) " + String.format("%.1f", this.groundCoffee));
        System.out.println("\nДоступный объем кофе в зернах (грамм) " + String.format("%.1f", this.beenCoffee));
        System.out.println("\nДоступный объем воды (литр) " + String.format("%.1f", this.water));
        System.out.println("\nДоступный объем молока (милилитр) " + String.format("%.1f", this.milk));
    }

    // метод для очистки кофемашины
    private void cleenMachine() {
        System.out.println("\nОчистка кофемашины...");
        this.groundCoffee = 0;
        this.beenCoffee = 0;
        this.water = 0;
        this.milk = 0;
    }

    // метод, отвечающий за приготовление кофе
    private void makeCoffeeNew() {
        System.out.println("===============================");
        System.out.println("Выберите кофе: ");
        System.out.println("1. Американо (основа молотый кофе)");
        System.out.println("2. Американо (основа зерновой кофе)");
        System.out.println("3. Латте (основа молотый кофе)");
        System.out.println("4. Латте (основа зерновой кофе)");
        System.out.println("0. Выход");
        System.out.println("===============================");
        char input = scanner.next().charAt(0);
        switch (input) {
            case '1':
                this.americano();
                break;
            case '2':
                this.americanoBeen();
                break;
            case '3':
                this.latte();
                break;
            case '4':
                this.latteBeen();
            case '0':
                break;
        }
    }

    // метод, отвечающий за цикл приготовления американо из молотого кофе
    private void americano() {
        // цикл, рассчитывающий объемы ингредиентов для приготовления американо
        if (this.groundCoffee >= 22 && this.water >= 0.1) {
            System.out.println("\nПриготовление американо из молотого кофе...");
            System.out.println("\nЗагружено 22 грамма молотого кофе");
            this.groundCoffee = this.groundCoffee - 22; // расчет используемого молотого кофе
            System.out.println("\nЗагружено 0.1 л");
            this.water = this.water - 0.1; // расчет используемой воды
            System.out.println("\nВаш американо готов");
            this.countCoffee++;
        } else {
            System.out.println("\nДоступный объем молотого кофе (грамм) " + String.format("%.1f", this.groundCoffee));
            System.out.println("\nДоступный объем зернового кофе(грамм) " + String.format("%.1f", this.beenCoffee));
            System.out.println("\nДоступный объем воды (литр) " + String.format("%.1f", this.water));
            System.out.println("\nНе хватает ингредиентов для следующего приготовления");
            System.out.println("\nПожалуйста, добавьте недостающие ингредиенты до начала приготовления кофе");
            if (this.groundCoffee <= 22)
                System.out.println("Добавьте, пожалуйста, молотоый кофе");
            if (this.water <= 0.1)
                System.out.println("Добавьте, пожалуйста, воды");
        }
    }

    // метод, отвечающий за цикл приготовления американо из зернового кофе
    private void americanoBeen() {
        if (this.beenCoffee >= 22 && this.water >= 0.1) {
            System.out.println("\nПриготовление американо из зернового кофе...");
            System.out.println("\nЗагружено 22 грамма молотого кофе");
            this.beenCoffee = this.beenCoffee - 22;
            System.out.println("\nЗагружено 0.1 л");
            this.water = this.water - 0.1;
            System.out.println("\nВаш американо готов");
            this.countCoffee++;
        } else {
            System.out.println("\nДоступный объем  молотого кофе (грамм) " + String.format("%.1f", this.groundCoffee));
            System.out.println("\nДоступный объем зернового кофе(грамм) " + String.format("%.1f", this.beenCoffee));
            System.out.println("\nДоступный объем воды (литр) " + String.format("%.1f", this.water));
            System.out.println("\nНе хватает ингредиентов для следующего приготовления");
            System.out.println("\nПожалуйста, добавьте недостающие ингредиенты до начала приготовления кофе");
            if (this.groundCoffee <= 22)
                System.out.println("Добавьте, пожалуйста, молотоый кофе");
            if (this.water <= 0.1)
                System.out.println("Добавьте, пожалуйста, воды");
        }
    }

    // метод, отвечающий за цикл приготовления латте из молотого кофе
    private void latte() {
        if (this.groundCoffee >= 22 && this.water >= 0.1 && this.milk >= 100) {
            System.out.println("\nПриготовление латте из молотого кофе...");
            System.out.println("\nЗагружено 22 грамма молотого кофе");
            this.groundCoffee = this.groundCoffee - 22;
            System.out.println("\nЗагружено 0.1 л воды");
            this.water = this.water - 0.1;
            System.out.println("\nВведите необходимый объем молока (милилитр)");
            int volumeMilk = scanner.nextInt();
            if (volumeMilk > 500) {
                System.out.println("Превышен объем контейнера для молока");
                System.out.println("Пожалуйста, уменьшите объем загружаемого молока");
                while (true) {
                    if (volumeMilk > 500) {
                        volumeMilk = scanner.nextInt();
                    } else {
                        System.out.println("\nЗагружено" + volumeMilk + " мл молока");
                        break;
                    }
                }
                this.milk = this.milk - volumeMilk;
                System.out.println("Ваш латте готов");
                this.countCoffee++;
            }

        }else{
            System.out.println("\nДоступный объем молотого кофе (грамм) " + String.format("%.1f", this.groundCoffee));
            System.out.println("\nДоступный объем воды (литр) " + String.format("%.1f", this.water));
            System.out.println("\nДоступный объем молока (милилитр) " + String.format("%.1f", this.milk));
            System.out.println("\nНе хватает ингредиентов для следующего приготовления");
            System.out.println("\nПожалуйста, добавьте недостующие ингредиенты до начала приготовления кофе");
            if (this.groundCoffee <= 22)
                System.out.println("Добавьте, пожалуйста, молотоый кофе");
            if (this.water <= 0.1)
                System.out.println("Добавьте, пожалуйста, воды");
            if (this.milk <= 50)
                System.out.println("Добавьте, пожалуйста, молоко");
        }
    }

    //метод, отвечающий за приготовление латте из зернового кофе
    private void latteBeen(){
        if (this.beenCoffee >= 22 && this.water >= 0.1 && this.milk >= 100){
            System.out.println("\nПриготовление латте из зернового кофе...");
            System.out.println("\nЗагружено 22 грамма зернового кофе");
            this.beenCoffee = this.beenCoffee - 22;
            System.out.println("\nЗагружено 0.1 л воды");
            this.water = this.water - 0.1;
            System.out.println("\nВведите необходимый объем молока (милилитр)");
            int volumeMilk = scanner.nextInt();
            if (volumeMilk > 500) {
                System.out.println("Превышен объем контейнера для молока");
                System.out.println("Пожалуйста, уменьшите объем загружаемого молока ");
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

        }else{
            System.out.println("\nДоступный объем молотого кофе (грамм) " + String.format("%.1f", this.beenCoffee));
            System.out.println("\nДоступный объем воды (литр) " + String.format("%.1f", this.water));
            System.out.println("\nДоступный объем молока (милилитр) " + String.format("%.1f", this.milk));
            System.out.println("\nНе хватает ингредиентов для следующего приготовления");
            System.out.println("\nПожалуйста, добавьте недостующие ингредиенты до начала приготовления кофе");
            if (this.groundCoffee <= 22)
                System.out.println("Добавьте, пожалуйста, молотоый кофе");
            if (this.water <= 0.1)
                System.out.println("Добавьте, пожалуйста, воды");
            if (this.milk <= 50)
                System.out.println("Добавьте, пожалуйста, молоко");
        }
    }

    // метод, осуществляющий доступ к закрытым методам класса NewCoffeeMachine
    public void start(){
        System.out.println("===================================================");
        System.out.println("Кофемашина <<New My Coffee Machine>>");
        this.getIngredient();
        boolean t = true;
        while (t){
            System.out.println("================================================");
            System.out.println("Выберите один из пунктов меню: ");
            System.out.println("1. Объем загруженных ингредиентов");
            System.out.println("2. Заполнить контейнеры ингредиентами");
            System.out.println("3. Очистить кофемашину");
            System.out.println("4. Приготовить кофе");
            System.out.println("5. Какое количество кофе было приготовлено?");
            System.out.println("6. Выход из программы");
            System.out.println("================================================");
            char c = NewCoffeeMachine.scanner.next().charAt(0);
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
                    this.cleenMachine();
                    break;
                case '4':
                    this.makeCoffeeNew();
                    break;
                case'5':
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

