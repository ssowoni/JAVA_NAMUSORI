package project.service.logic;

import project.Entity.TravelClub;
import project.service.ClubService;

public class ClubServiceLogic implements ClubService {

    private TravelClub[] clubs;
    private int index;



    @Override
    public void register(TravelClub travelClub) {

    }

    @Override
    public TravelClub[] findAll() {
        return new TravelClub[0];
    }

    @Override
    public TravelClub[] findByName(String clubName) {
        return new TravelClub[0];
    }

    @Override
    public TravelClub findById(String clubId) {
        return null;
    }

    @Override
    public void modify(TravelClub modifyClub) {

    }

    @Override
    public void remove(String clubId) {

    }
}
