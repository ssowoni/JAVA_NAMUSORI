package project.service;

import project.Entity.TravelClub;

import java.util.List;

public interface ClubService {

/*    void register(TravelClub travelClub);
    TravelClub [] findAll();
    TravelClub [] findByName(String clubName);
    TravelClub findById(String clubId);

    void modify(TravelClub modifyClub);
    void remove(String clubId);*/

    void register(TravelClub travelClub);
    List<TravelClub> findAll();
    List<TravelClub> findByName(String clubName);
    TravelClub findById(String clubId);

    void modify(TravelClub modifyClub);
    void remove(String clubId);


}
