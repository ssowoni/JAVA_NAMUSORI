package project.util;

import java.util.Scanner;

public class ConsoleUtil {
    private Scanner sc;

    public ConsoleUtil() {
        this.sc = new Scanner(System.in);
    }

    //사용자로부터 입력을 받은 값 ex) register할때 club name과 info, findByID할때 ID 값 등등 ....
    public String getValueOf(String label){
        System.out.print(label + " : ");
        String inputStr = sc.nextLine();
        inputStr = inputStr.trim();
        return inputStr;
    }

}
