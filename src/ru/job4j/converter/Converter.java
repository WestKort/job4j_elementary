package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {

        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(360);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("360 rubles are " + dollar + " dollars.");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int in2 = 360;
        int expectedq = 6;
        int out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expectedq == out2;
        System.out.println("360 rubles are 6. Test result : " + passed2);
    }
}


