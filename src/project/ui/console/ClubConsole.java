package project.ui.console;

import project.Entity.TravelClub;
import project.util.ConsoleUtil;

public class ClubConsole {

    private ConsoleUtil consoleUtil;

    public ClubConsole() {
        this.consoleUtil = new ConsoleUtil();
    }

    public void register(){

        while(true){
            String clubName = consoleUtil.getValueOf("Club Name(0.Club Menu)");
            if(clubName.equals("0")){
                return;
            }

            String intro = consoleUtil.getValueOf("Club intro(0.club menu)");
            if(intro.equals("0")){
                return;
            }

            TravelClub newClub = new TravelClub(clubName, intro);
            System.out.println("Register club : " + newClub.toString());
        }


    }

    public void findAll(){
        System.out.println("Find All ");
    }

    public void findById(String id){
        System.out.println("findById ");
    }





}
