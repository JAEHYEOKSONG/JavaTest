package JAVA;

import java.util.Arrays;
import java.util.Locale;

public class Java100_method {
    public static String[] change(String a, String b){
        String a1= a.toLowerCase();
        String b2= b.toUpperCase();
        String[]ret = {a1,b2};
        return ret;
    }
    public static void main(String[] args) {
        String result [] = change("STRING","spring");
        System.out.println(Arrays.toString(result));
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
