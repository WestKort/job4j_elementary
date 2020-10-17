package ru.job4j.condition.ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k, double l, double h) {
        double rsl = h * l;
        return rsl;
    }
    public static double squareH(double p, double k) {
        double rsl = p/(2*(k+1));
        return rsl;
    }
    public static double squareL(double h, double k) {
        double rsl = h * k;
        return rsl;
    }
    public static void main(String[] args) {
        double result1 = SqArea.square(6,2,2,1);
        int p = 6;
        int k = 2;
        double h = SqArea.squareH(p,k);
        double l = SqArea.squareL(h,k);
        System.out.println(" h = " + h);
        System.out.println(" L = " + l);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
