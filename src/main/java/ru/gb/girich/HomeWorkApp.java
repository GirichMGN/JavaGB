package ru.gb.girich;

public class HomeWorkApp {
    public static void main (String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

        public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
            }

        public static void checkSumSign(){
        int a = -10;
        int b = 5;

        if (a+b>= 0){
            System.out.println("����� �������������");}
            else if (a+b<0){
            System.out.println("����� �������������");}
        }

        public static void printColor(){
        int value = -10;

        if (value <= 0){
            System.out.println("�������");}
        else if (value > 0 && value <= 100){
            System.out.println("������");}
            else if (value > 100){
            System.out.println("�������");}
            }

        public static void compareNumbers(){
        int a = 10;
        int b = 11;

        if (a>=b){
            System.out.println("a>=b");}
            else {
                System.out.println("a<b");}
        }
        }

