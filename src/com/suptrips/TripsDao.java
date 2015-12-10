package com.suptrips;
import java.util.List;

public interface TripsDao {

    Trips addTrip(Trips trips);
    Trips findTripsById(Long idtrip);
    List<Trips> getAllTrips();
    List<Trips> getAllUsersTrips(Long idtrip);
    List<Trips> getAllTripsByDepartCampus(String dcampus);
    List<Trips> getAllTripsByArriveCampus(String acampus);
    void updateTrips(Trips trips);
    void removeTrips(Trips trips);
}
