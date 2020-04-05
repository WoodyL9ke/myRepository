package javaRush.lvl3;

public class AddPrice {
    public static void main(String[] args) {
        //Apple apple = new Apple();
        Apple.addPrice(2345);
        Apple.addPrice(2345);
        //apple.addPrice(300);
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            Apple.applesPrice = Apple.applesPrice + applesPrice;

            //напишите тут ваш код


        }
    }
}
