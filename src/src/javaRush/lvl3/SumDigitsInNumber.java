package javaRush.lvl3;

public class SumDigitsInNumber {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(557));
    }

    public static int sumDigitsInNumber(int number) {
        int b = number / 100;
        int a = number % 100 / 10;
        int c = number % 100 % 10;
        return b + a + c;
        //напишите тут ваш код
    }
}