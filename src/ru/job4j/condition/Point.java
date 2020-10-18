package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double xall = x2 - x1;
        System.out.println("1. " + xall);
        double yall = y2  - y1;
        System.out.println("2. " + yall);
        double masx = Math.pow(xall,2);
        System.out.println("3. " + masx);
        double masy = Math.pow(yall,2);
        System.out.println("4. " + masy);
        double xyall = masx + masy;
        System.out.println("5. " + xyall);
        double sqrt = Math.sqrt(xyall);
        System.out.println("6. " + sqrt);
        double rsl = sqrt;
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        int x1 = 0;
        int x2 = 2;
        double y1 = 0;
        double y2 = 0;
        System.out.println("1. " + result);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
