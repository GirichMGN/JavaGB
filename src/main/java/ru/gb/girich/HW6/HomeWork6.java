package ru.gb.girich.HW6;

public class HomeWork6 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("������", 0, 200);
        animals[1] = new Cat("������", 0, 200);
        animals[2] = new Dog("����", 10, 500);
        animals[3] = new Dog("���", 10, 500);

        System.out.println("�������������� ��������� ��������");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------");


        System.out.println("����� ����� �������: " + (Cat.getCount()));
        System.out.println("����� ����� �������: " + (Dog.getCount()));
        System.out.println("����� �������� �������: " + Animal.getCount());

        System.out.println("���: ");
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("��������: ");
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(50);
        }

    }
}

