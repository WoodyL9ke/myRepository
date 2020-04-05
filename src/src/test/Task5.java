package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Задача №5: Таблица умноженияЗадание
 * Необходимо вывести на экран таблицу умножения от 1 до 10
 * для введённого пользователем любого числа. Использовать циклы запрещено.
 */
public class Task5 {
    public static void main(String[] args) throws Exception {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        */
        int a= ValenReader.readNumber();
        System.out.println(a*1);
        System.out.println(a*2);
        System.out.println(a*3);
        System.out.println(a*4);
        System.out.println(a*5);
        System.out.println(a*6);
        System.out.println(a*7);
        System.out.println(a*8);
        System.out.println(a*9);
        System.out.println(a*10);



    }
}
