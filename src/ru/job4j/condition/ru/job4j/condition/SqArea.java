package ru.job4j.condition.ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p/(2*(k+1));
        System.out.println(" h = " + h);
        double L = h * k;
        System.out.println(" L = " + L);
        double rsl = L * h;
        return rsl;
        //qwa
    }
    public static void main(String[] args) {
        double result1 = SqArea.square(6,2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
