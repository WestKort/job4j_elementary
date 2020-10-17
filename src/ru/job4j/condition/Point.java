package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = -1;
        return rsl;

    }
    public static double distanceX(int x1, int x2) {
        double rsl = x2-x1;
        return rsl;
}
    public static double distanceY(int y1, int y2) {
        double rsl = y2 - y1;
        return rsl;
}
    public static double distanceB(double x) {
        //степень X
        double rsl = Math.pow(x,2);
        return rsl;
    }
    public static double distanceC(double y) {
        //степень Y
        double rsl = Math.pow(y, 2);
        return rsl;
    }
    public static double distanceD(double first, double second) {
        double rsl = first + second;
        return rsl;
    }
    public static double distanceE(double XY) {
        double rsl = Math.sqrt(XY);
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        short x1 = 0;
        short x2 = 2;
        short y1 = 0;
        short y2 = 0;
        double x = Point.distanceX(x1,x2);
        double y = Point.distanceY(y1,y2);
        double first = Point.distanceB(x);
        double second = Point.distanceC(y);
        double XY = Point.distanceD(first,second);
        double sqrt = Point.distanceC(XY);
        System.out.println("1. x2 - x1 = " + x);
        System.out.println("2. y2 - y1 = " + y);
        System.out.println("3. " + first);
        System.out.println("4. " + second);
        System.out.println("5. " + XY);
        System.out.println("6. " + sqrt);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
