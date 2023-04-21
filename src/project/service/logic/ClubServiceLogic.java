package project.service.logic;

import project.Entity.TravelClub;
import project.service.ClubService;

import java.util.Arrays;

public class ClubServiceLogic implements ClubService {

    private TravelClub[] clubs;
    private int index;

    public ClubServiceLogic() {
        this.clubs = new TravelClub[10]; //10개 정보를 저장할 수 있는 클럽
        this.index = 0;
    }

    @Override
    public void register(TravelClub travelClub) {
        clubs[index] = travelClub;
        index++;
    }

    @Override
    public TravelClub[] findAll() {
        return Arrays.copyOfRange(clubs, 0, index);
    }

    @Override
    public TravelClub[] findByName(String clubName) {

        TravelClub[] createdClubs = Arrays.copyOfRange(clubs, 0, index);
        TravelClub[] foundClubs = new TravelClub[createdClubs.length];
        int subIndex = 0;

        for(TravelClub club : createdClubs){
            if(club.getClubName().equals(clubName)){
                foundClubs[subIndex] = club;
                subIndex++;
            }
        }



        return Arrays.copyOfRange(foundClubs, 0,subIndex);


    }

    @Override
    public TravelClub findById(String clubId) {
        //만약 10개의 배열 중 5개의 클럽이 저장되어 있다면
        //10개에서 찾는 게 아닌 null 값 제외하고 5개에서만 찾는게 바람직하다.
        TravelClub[] createdClubs = Arrays.copyOfRange(clubs, 0, index);
        TravelClub foundClub = null;
        for(TravelClub club : createdClubs){
            if(club.getId().equals(clubId)){
                foundClub = club;
                break;
            }
        }
        return foundClub;

    }

    @Override
    public void modify(TravelClub modifyClub) {

    }

    @Override
    public void remove(String clubId) {

    }
}
