package project.ui.console;

import project.service.ClubService;
import project.service.ServiceLogicLifeCycler;

//예시로 작성한 클래스
public class ClubSubConsole {
    private ClubService clubService;

    public ClubSubConsole() {
        this.clubService = ServiceLogicLifeCycler.getUniqueInstance().getClubService();
    }
}
