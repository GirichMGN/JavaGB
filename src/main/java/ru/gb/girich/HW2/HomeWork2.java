package ru.gb.girich.HW2;

public class HomeWork2 {
    public static void main(String[] args) {
        boolean result = task1(3, 2);
    System.out.println(result);
        task2(-5);
        boolean result3 = task3(10);
    System.out.println(result3);
        task4("Hellow World",2);
        boolean result4 = task5(2024);
    System.out.println(result4);
}

    public static boolean task1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void task2(int x) {
        if (x >= 0)
            System.out.println("Положительное число");
        else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean task3 (int x){
        if (x>=0){
            return true;
            }
            return false;
    }
    public static void task4 (String word, int x) {
        for (int y = 0; y < x; y++) {
            System.out.println(word);
        }
    }
    public static boolean task5 (int x) {
            if (x % 100 == 0 && x % 400 == 0){
                return true;
        } else if (x %4 ==0 && x %100 >0){
                return true;
            } else if (x %100 == 0) {
                return false;
            } else {
                return false;
            }

}
}

