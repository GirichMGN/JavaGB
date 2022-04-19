package ru.gb.girich.HW2;

public class HomeWork2 {
    public static void main (String[] args) {
        boolean result = task1(10, 10);
        System.out.println(result);
    }
      public static boolean task1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
        return true;
    } else {
        return false;
        }
    }
}
