package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    public static double womanWeight (short heightw) {
        double rsl = (heightw - 110) * 1.15;
        return rsl;
    }
    public static void main(String[] args) {
        short height = 180;
        short heightw = 170;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(heightw);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 150 is " + woman);
    }
}
