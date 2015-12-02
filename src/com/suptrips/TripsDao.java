package com.suptrips;
import java.util.List;

public interface TripsDao {

    Trips addTrip(Trips trips);
    Trips findProductById(Long idtrip);
    List<Trips> getAllTrips();
    void updateTrips(Trips trips);
    void removeTrips(Trips trips);
}
