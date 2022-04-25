package ru.gb.girich.HW3;

public class HomeWork3 {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5(2, 4);
        Task6();
    }

    public static void Task1() {
        int[] arr = {1, 1, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void Task2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void Task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i] + " ");
        }
    }

    public static void Task4() {
        int[][] arr = {
                {1, 2, 3,},
                {4, 5, 6,},
                {7, 8, 9,}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && j == i) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Task5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    public static void Task6() {
        int[] arr = {1,12,3,2,9};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            System.out.println(max);
            System.out.println(min);
        }
    }
}

