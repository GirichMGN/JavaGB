package ru.gb.girich.HW5;

public class Test {
    public static void main(String[]args){

        Employees[] E = new Employees[5];

        E[0] = new Employees("Ivan Ivanov", "Engineer", "Ivanov@gmail.com ", "89836129910", 150000, 30);
        E[1] = new Employees("Petr Petrov", "Actor", "Petrov@mail.ru", "89056051188", 80000, 39);
        E[2] = new Employees("Borisov Ivan", "Actor", "Borisov@yandex.ru", "89955056677", 200000, 37);
        E[3] = new Employees("Avdeev Kirill", "Actor", "Avdeev@gmail.com", "89098765645", 130000, 49);
        E[4] = new Employees("Cheh Alex", "Actor", "Cheh@gmail.com", "89996543445", 300000, 54);
        for (int i = 0; i < E.length; i++) {
            if(E[i].getAge() > 40){
                E[i].printInfo();
            }
        }
    }

}



