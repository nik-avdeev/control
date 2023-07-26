package control;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();
        int X = random.nextInt(10);
        int Y = random.nextInt(10);
        int Z = random.nextInt(10);

        System.out.println("X: " + X);
        System.out.println("Y: " + Y);
        System.out.println("Z: " + Z);

        if (X > Z) {
            int sumXY = X + Y;
            System.out.println("X больше Z. Сумма X и Y: " + sumXY);
        } else {
            System.out.println("Z больше либо равно X. Значение Z: " + Z);
        }

        double average = (X + Y + Z) / 3.0;
        System.out.println("Среднее арифметическое: " + average);
    }
}
