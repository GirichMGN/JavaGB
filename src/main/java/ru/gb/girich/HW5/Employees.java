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
            System.out.println("Фамилия: " + fio);
            System.out.println("Должность: " + position);
            System.out.println("Почта: " + email);
            System.out.println("Телефон: " + phone);
            System.out.println("Возраст: " + age);
            System.out.println("Зарплата: " + salary);

        }

        public int getAge() {
            return age;
        }
    }


