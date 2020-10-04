package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = 2;
        return rsl;
    }
    public static double distanceX(int x1, int x2) {
        double rsl = x2-x1;
        return rsl;
}
    public static double distanceY(int y1, int y2) {
        double rsl = y2-y1;
        return rsl;
}
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        short x1 = 0;
        short x2 = 2;
        short y1 = 0;
        short y2 = 0;
        double xall = Math.pow(2,2);
        double yall = Math.pow(0,2);
        double XY = xall+yall;
        double x2x1 = Point.distanceX(x1,x2);
        double y2y1 =Point.distanceY(y1,y2);
        double XYend = Math.sqrt(4);
        System.out.println("1. x2 - x1 = " + x2x1);
        System.out.println("2. x2 - x1 = " + y2y1);
        System.out.println("3. " + xall);
        System.out.println("4. " + yall);
        System.out.println("5. " + XY);
        System.out.println("6. " + XYend);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
