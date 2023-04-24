package part4.collection;

import java.sql.SQLOutput;

public class Equals {

    public static void main(String[] args) {

        String str = "JAVA";
        String str2 = "JAVA";
        String str3 = new String("JAVA");

        System.out.println(str==str2); //true
        System.out.println(str==str3); //false
        System.out.println(str.equals(str3)); //true


    }


}
