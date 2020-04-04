package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValenReader {


    static String readString () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       return reader.readLine();
    }
    static int readNumber () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        try {
            return Integer.parseInt(s);
        }
        catch (Exception e)
        {
            System.out.println("Не удалось преобразовать:"+s+" в число");

                }
        return 666;
    }

}
