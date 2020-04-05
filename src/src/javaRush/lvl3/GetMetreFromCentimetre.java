package javaRush.lvl3;

public class GetMetreFromCentimetre {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(1100));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        return centimetre / 100;
    }
}