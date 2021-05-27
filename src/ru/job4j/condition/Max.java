package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left;
        boolean condition = left == 1;
        int result1 = condition ? left : right;
        return result;
    }
    public static void main(String[] args) {
        String cond = Max.max(1, 2);
        System.out.println(cond);
    }
}


   // public static String permission(int age) {
     //   String label = age >= 18 ? "Please, enjoy it." : "You can't watch it.";
       // return label;
   //boolean can = age >= 18;
  //  String label = can ? "Please, enjoy it." : "You can't watch it.";
//return label;


   // public static void main(String[] args) {
      //  String msg = Film.permission(33);
    //    System.out.println(msg);
