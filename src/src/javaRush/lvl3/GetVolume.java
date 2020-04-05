package javaRush.lvl3;

/*
Набираем воду в бассейн
*/

public class GetVolume {
    public static void main(String[] args) {
        System.out.println(getVolume(230, 40, 10));
    }

    public static long getVolume(int a, int b, int c) {
        int result = (a * b * c) * 1000;
        return result;
        //напишите тут ваш код
    }
}