package part4.collection;

import java.util.HashSet;
import java.util.Set;

public class SetAssist {

    public static void main(String[] args) {

        Set<Customer> set = new HashSet<>();
        Customer customer = new Customer("aaa", "nick");
        //set은 중복을 허용하지 않기 때문에 아래 2문장은 중복으로 간주되어 하나만 저장된다.
        set.add(customer);
        set.add(customer);
        //그러나 set은 다른 객체여도 값이 중복되면 제외해야되는지를 판단하지 못한다.
        //따라서 equals와 hashcode 재정의가 필요하다.
        set.add(new Customer("aaa", "nick"));

        System.out.println(set.size());
    }
}
