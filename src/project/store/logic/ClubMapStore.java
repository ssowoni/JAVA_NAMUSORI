package project.store.logic;

import project.Entity.TravelClub;
import project.store.ClubStore;

import java.util.*;

public class ClubMapStore implements ClubStore {

    private Map<String, TravelClub> clubMap ;

    public ClubMapStore() {
        this.clubMap = new HashMap<>();
    }

    @Override
    public void create(TravelClub travelClub) {
        this.clubMap.put(travelClub.getId(), travelClub);

    }

    @Override
    public TravelClub retrieve(String clubId) {
        return this.clubMap.get(clubId);
    }

    @Override
    public List<TravelClub> retrieveAllByName(String clubName) {

        List<TravelClub> foundClubs = new ArrayList<>();
        for(TravelClub club : this.clubMap.values()){
            if(club.getClubName().equals(clubName)){
                foundClubs.add(club);
            }
        }

        /*
        위와 같은 방식
        Iterator<TravelClub> it = this.clubMap.values().iterator();
        while (it.hasNext()){
            TravelClub club = it.next();
            if(club.getClubName().equals(clubName)){
                foundClubs.add(club);
            }
        }*/

        return foundClubs;
    }

    @Override
    public List<TravelClub> retrieveAll() {
        return new ArrayList<>(this.clubMap.values());
    }

    @Override
    public void update(TravelClub updateClub) {
        this.clubMap.put(updateClub.getId(), updateClub);
    }

    @Override
    public void delete(String clubId) {
        this.clubMap.remove(clubId);

    }
}
