package project.util;

import java.util.Scanner;

public class ConsoleUtil {
    private Scanner sc;

    public ConsoleUtil() {
        this.sc = new Scanner(System.in);
    }

    public String getValueOf(String label){
        System.out.print(label + " : ");
        String inputStr = sc.nextLine();
        inputStr = inputStr.trim();
        return inputStr;
    }

}
