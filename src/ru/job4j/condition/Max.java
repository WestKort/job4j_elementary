package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
    public static void main(String[] args) {
        int cond = Max.max(3, 2);
        System.out.println(cond);
    }
}
