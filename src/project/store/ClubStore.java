package project.store;

import project.Entity.TravelClub;

import java.util.List;

public interface ClubStore {

    void create(TravelClub travelClub);

    TravelClub retrieve(String clubId);

    List<TravelClub> retrieveAllByName(String clubName);

    List<TravelClub> retrieveAll();

    void update(TravelClub updateClub);

    void delete(String clubId);


}
