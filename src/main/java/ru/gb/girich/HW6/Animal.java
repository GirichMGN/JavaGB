package ru.gb.girich.HW6;

public class Animal {
    protected String name;
    protected int run;
    protected int swims;
    private static int count;

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String toString() {
        return ", Кличка: '" + name + "\' \nТТХ:" +
               ", Может проплыть " + swims + "м. " +
               ", Может пробежать " + run + "м. " +
               "м. \n";
    }

    protected void run(int distance) {
        if (run >= distance) {
            System.out.println(" по кличке " + this.name + "  - УСПЕШНО пробежал(а) " + distance + "м.");
        } else {
            System.out.println(" по кличке " + this.name + " ---- сошел(а) с дистанции ---- ");
        }
    }

    protected void swim(int distance) {
        if (swims >= distance) {
            System.out.println(" по кличке " + this.name + "   - УСПЕШНО проплыл(а) " + distance + "м.");
        } else {
            System.out.println(" по кличке " + this.name + " ---- не выполнил норматив ---- ");
        }
    }
}

