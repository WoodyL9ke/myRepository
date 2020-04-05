package javaRush.lvl3;

/*
Обмен валют
*/

public class  ConvertEurToUsd {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(35, 0.93));

        //напишите тут ваш код

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
        //напишите тут ваш код

    }
}
