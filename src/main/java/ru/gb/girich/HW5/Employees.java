package ru.gb.girich.HW5;

    public class Employees {
        private String fio;
        private String position;
        private String email;
        private String phone;
        private double salary;
        private int age;

        public Employees(String fio, String position, String email, String phone, int salary, int age) {
            this.fio = fio;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
        void printInfo() {
            System.out.println("�������: " + fio);
            System.out.println("���������: " + position);
            System.out.println("�����: " + email);
            System.out.println("�������: " + phone);
            System.out.println("�������: " + age);
            System.out.println("��������: " + salary);

        }

        public int getAge() {
            return age;
        }
    }


