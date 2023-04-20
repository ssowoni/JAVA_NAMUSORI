package project_ex.ui.menu;

import java.util.Scanner;

public class ClubMenu {

    private Scanner sc;
    private int inputNumber =0;

    public ClubMenu() {
        this.sc = new Scanner(System.in);
    }

    public void show() {


        while (true) {

            displayMenu();
            inputNumber = selectNumber();
            System.out.println(inputNumber);

            switch (inputNumber){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    //switch문이 빠져나가려면 0 입력.
                    return;
                default:
                    System.out.println("Choose again!");

            }
        }
    }


     private void displayMenu() {
        System.out.println("....................");
        System.out.println("Club Menu");
        System.out.println("....................");
        System.out.println("1. Register");
        System.out.println("2. Find(All)");
        System.out.println("3. Find(ID)");
        System.out.println("4. Find(Name)");
        System.out.println("5. Modify");
        System.out.println("6. Remove");
        System.out.println("....................");
        System.out.println("0. Previous");
        System.out.println("....................");

    }

    public int selectNumber(){
        System.out.print("select number : ");
        int selectNumber = sc.nextInt();
        if(selectNumber >=0 && selectNumber <=6){
            return selectNumber;
        }else{
            System.out.println("number between 0~ 6 ");
            return -1;
        }
    }

}
