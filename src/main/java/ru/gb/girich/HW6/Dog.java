package ru.gb.girich.HW6;

public class Dog extends Animal {
        private static int count;


        public Dog(String name, int swims, int run) {
            this.name = name;
            this.swims = swims;
            this.run = run;
            count++;
        }

        public static int getCount() {
            return count;
        }

}

