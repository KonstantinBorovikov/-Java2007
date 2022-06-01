package ru.geekbrains.homework11;

public class homework11 {
    public static void main(String[] args) {
        printThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int c = 15;
        int d = 12;
        if (c >= d) ;
        System.out.println("c >= d");
        if (c < d) ;
        System.out.println("c < d");
    }


    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void chekSumSign() {
        int a = 10;
        int b = 20;
        if (a + b >= 0) ;
        System.out.println("Сумма положительная");
        if (a + b <= 0)
            System.out.println("Сумма отрицательная");

    }

    public static void printColor() {
        {
            int value = 5;
            if (value < 0) {
                System.out.println("Красный");
            }
            if (value > 0 && value < 100) {
                System.out.println("Жёлтый");
            }
            if (value > 100) {
                System.out.println("Зелёный");
            }
        }
    }
}

