package part4;

import java.util.Scanner;

public class AgeInputExample {


    public static void main(String[] args) {

        System.out.println("나이를 입력하세요.");
        try{
            int age = readAge();
            System.out.println("입력하신 나이는 : " + age);
        }catch (NotAvailableAgeException e){
            System.out.println(e.getMessage());
        }

    }

    private static int readAge() throws NotAvailableAgeException {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age <0){
            throw new NotAvailableAgeException();
        }

        return age;


    }

}




