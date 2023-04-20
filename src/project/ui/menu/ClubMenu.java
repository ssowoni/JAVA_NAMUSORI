package project.ui.menu;

import project.ui.console.ClubConsole;

import java.util.Scanner;

public class ClubMenu {

    private Scanner sc ;
    private ClubConsole console;

    public ClubMenu(){
        this.sc = new Scanner(System.in);
        this.console = new ClubConsole();
    }

    public void show() {
        int inputNumber = 0;

        while (true) {
            displayMenu();
            inputNumber = selectMenu();

            System.out.println(inputNumber);

            switch (inputNumber){
                case 1:
                    console.register();
                    break;
                case 2:
                    console.findAll();
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


    private int selectMenu(){
        System.out.print("select : ");
        //nextInt는 cmd창에 들어온 문자열을 각각 합쳐서 int형으로 만들어준다.
        int menuNumber = sc.nextInt();
        if(menuNumber >= 0 && menuNumber <=6){
            //nextLine : 키보드 입력받을떄 버퍼를 사용한다. 버퍼 값을 다 지우기 위해 일부러 사용., 버퍼에 있는 값들을 모두 String 형태로 가져와라.
            sc.nextLine();
            return menuNumber;
        }else{
            System.out.println("It's a invalid number --> " + menuNumber);
            return -1;
        }


    }

}
