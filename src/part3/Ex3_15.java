package part3;

import java.util.Arrays;

public class Ex3_15 {
    public static void main(String[] args) {


        int[] month = {1, 2, 3, 4};

        /*
        배열의 초기화는 배열 선언시에만 사용.
        int[] mon;
        mon = {1, 2, 3, 4};*/

        int[] a = new int[5];
        int[] b = a;

        System.out.println(a);
        System.out.println(b);

        b[0] = 5 ; //a의 값도 변경 된다.

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        int[] copy = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(copy));




    }
}
