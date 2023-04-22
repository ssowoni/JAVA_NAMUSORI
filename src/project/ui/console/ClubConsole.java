package project.ui.console;

import project.Entity.TravelClub;
import project.service.ClubService;
import project.service.ServiceLogicLifeCycler;
import project.service.logic.ClubServiceLogic;
import project.util.ConsoleUtil;

public class ClubConsole {

    private ConsoleUtil consoleUtil;
    private ClubService clubService;

    public ClubConsole() {
        this.consoleUtil = new ConsoleUtil();
        //이후 변경될 코드...
        //this.clubService = new ClubServiceLogic();

        // 위의 코드는 나중에 clubConsole과 같은 클래스가 늘어났을때 참조무결성을 위배한다.
        // 예를들어 clubSubConsole이 생겨난다 가정하자. 거기서도 new ClubServiceLogic()을 호출한다.
        // 이렇게 되면 clubConsole의 ClubServiceLogic 객체 1개, clubSubConsole의 ClubServiceLogic 객체 1개
        // 그럼 clubs[] 배열도 각각 2개가 생성되는 것이다. 그렇기에 문제가 발생한다.

        // 우리는 아래와 같은 조건을 전제로 깔아야 한다.
        // 1. clubConsole이 ClubServiceLogic을 모르게 한다.
        // 2. ClubServiceLogic이 전체 소스에서 하나의 인스턴스만 갖게 한다.
        this.clubService = ServiceLogicLifeCycler.getUniqueInstance().getClubService();

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

    private TravelClub findOne(){
        TravelClub foundClub = null;

        while(true){
            String clubId = consoleUtil.getValueOf("Club id to find(0.Club Menu)");
            if(clubId.equals("0")){
                break;
            }

            foundClub = clubService.findById(clubId);

            if(foundClub != null){
               break;
            }else{
                System.out.println("Can not find club, ID :" + clubId);
            }

        }
        return foundClub;

    }


    public void modify(){
        //id를 통해 찾아온 값
        TravelClub targetClub = findOne();

        String newName = consoleUtil.getValueOf("New Club Name(0.Club menu, Enter. No change)");
        if(newName.equals("0")){
            return;
        }

        if(!newName.isEmpty()){
            targetClub.setClubName(newName);
        }

        String newIntro = consoleUtil.getValueOf("New Club newIntro(0.Club menu, Enter. No change)");
        if(!newIntro.isEmpty()){
            targetClub.setIntro(newIntro);
        }

        clubService.modify(targetClub);
        System.out.println("Modify club : " + targetClub.toString());

    }

    public void remove(){

        TravelClub targetClub = findOne();
        String confirmStr = consoleUtil.getValueOf("Remove this club? (Y:yes, N:no)");
        if(confirmStr.toLowerCase().equals("y")||confirmStr.toLowerCase().equals("yes")){
            System.out.println("Removing a club --> " + targetClub.getClubName());
            clubService.remove(targetClub.getId());
        }else{
            System.out.println("Remove cancelled, your club is safe. " + targetClub.getClubName());
        }











    }






}
