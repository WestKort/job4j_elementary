package ru.job4j.condition.ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rsl = -1;
        return rsl;
    }
    public static double areaP(double a, double b, double c) {
        double rsl = 2/(a+b+c);
        return rsl;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;
        double rsl = TrgArea.area(2, 2, 2);
        double pall = TrgArea.areaP(a,b,c);
        System.out.println("p = " + pall);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}