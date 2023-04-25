package part5.etc;

import java.util.ArrayList;
import java.util.List;

public class LambdaTypeExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("React");

        for(String str : list){
            System.out.println(str.toString());
        }

        System.out.println();


        //forEach : 데이터를 순회한다.
        list.stream().forEach(str-> System.out.println(str.toString()));
        /*list.stream().forEach((String str)-> {System.out.println(str.toString())});*/
        list.stream().forEach(System.out::println);




    }
}
