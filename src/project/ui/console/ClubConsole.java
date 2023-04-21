package project.ui.console;

import project.Entity.TravelClub;
import project.service.ClubService;
import project.service.logic.ClubServiceLogic;
import project.util.ConsoleUtil;

public class ClubConsole {

    private ConsoleUtil consoleUtil;
    private ClubService clubService;

    public ClubConsole() {
        this.consoleUtil = new ConsoleUtil();
        //이후 변경될 코드...
        this.clubService = new ClubServiceLogic();
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

            clubService.register(newClub);

            System.out.println("Register club : " + newClub.toString());
        }


    }

    public void findAll(){
        System.out.println("Find All ");
        TravelClub[] foundClubs = clubService.findAll();
        if(foundClubs.length == 0){
            System.out.println("Empty");
            return;
        }

        for(TravelClub club : foundClubs){
            System.out.println(club.toString());
        }

    }

    public void findById(){
        TravelClub foundClub = null;

        while(true){
            String clubId = consoleUtil.getValueOf("Club id to find(0.Club Menu)");
            if(clubId.equals("0")){
                break;
            }

            foundClub = clubService.findById(clubId);

            if(foundClub != null){
                System.out.println(foundClub.toString());
            }else{
                System.out.println("Can not find club, ID :" + clubId);
            }

        }

    }

    public void findByName(){
        TravelClub[] foundClubs = null;

        while(true) {
            String clubName = consoleUtil.getValueOf("Club id to find(0.Club Menu)");
            if (clubName.equals("0")) {
                break;
            }

            foundClubs = clubService.findByName(clubName);

            if(foundClubs !=null && foundClubs.length !=0){
                for(TravelClub club : foundClubs){
                    System.out.println(club);
                }
            }else{
                System.out.println("Can not find club, ID :" + clubName);
            }


        }


    }







}
