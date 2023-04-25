package part5.stream;

import graphicEditor.step01.Line;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssist {
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Song", 45));
        customers.add(new Customer("Kim", 33));
        customers.add(new Customer("Park", 21));
        customers.add(new Customer("Lee", 67));
        customers.add(new Customer("choi", 19));
        customers.add(new Customer("Kim", 33));

        List<String> customersNames = customers.stream()
                                        .filter(customer -> customer.getAge()>30)
                                        .sorted()
                                        //.map(Customer::getName)
                                         .map(cus -> cus.getName())
                                        .collect(Collectors.toList());
        for(String name : customersNames){
            System.out.println(name);
        }



     /*
      Stream을 사용하지 않았을 떄
      List<Customer> list = new ArrayList<>();
        for(Customer cus : customers){
            if(cus.getAge()>30){
                list.add(cus);
            }
        }// age 가 30 이상 추출

        Collections.sort(list);//age 오름차순

        List<String> results = new ArrayList<>();
        for(Customer cus : list){
            results.add(cus.getName());
        }
        for(String str : results){
            System.out.println(str);
        }
*/


    }
}
