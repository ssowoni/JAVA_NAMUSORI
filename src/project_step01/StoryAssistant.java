package project_step01;

import project_step01.Entity.TravelClub;

//프로그램의 시작점
public class StoryAssistant {
    public static void main(String[] args) {
        TravelClub newClub = new TravelClub("Jeju Club", "Jeju TravelClub~");
        System.out.println(newClub.toString());
        System.out.println(TravelClub.getSample().toString());
    }
}
