package project.service;

import project.service.logic.ClubServiceLogic;

public class ServiceLogicLifeCycler {

    private static ServiceLogicLifeCycler uniqueInstance;
    private ClubService clubService;

    //생성자를 private로 만들어 내 자신 말고 객체를 생성할 수 없게 만든다.
    private ServiceLogicLifeCycler() {
        this.clubService = new ClubServiceLogic();
    }

    public static ServiceLogicLifeCycler getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance=new ServiceLogicLifeCycler();
        }
        return uniqueInstance;
    }

    public ClubService getClubService(){
        return this.clubService;
    }


}
