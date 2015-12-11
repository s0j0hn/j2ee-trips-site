package com.suptrips.rest;

import com.suptrips.FactoryDao;
import com.suptrips.Trips;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/listtrips")
public class TripsResource {


//un peu mieux en json
    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/listtrips")
    public String getAllTripsinJson() throws JSONException {
        List<Trips> trips = FactoryDao.getTripsDao().getAllTrips();
        JSONArray list1 = new JSONArray();
        for (Trips trips1 : trips){
            JSONObject obj1 = new JSONObject();
            obj1.put("idtrip",trips1.getIdtrip());
            obj1.put("arrive_campus",trips1.getArrive_campus());
            obj1.put("arrive_date",trips1.getArrive_campus());
            obj1.put("depart_campus",trips1.getDepart_campus());
            obj1.put("depart_date",trips1.getDepart_date());
            obj1.put("airport_name",trips1.getAirport_name());
            obj1.put("user_idbooster",trips1.getUsers_idboosterId());
            list1.put(obj1);
        }
        return list1.toString();
    }

    /*@GET @Path("/listtrips/{idtrip}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getTripsInJson(@PathParam("idtrip") Long idtrip) throws JSONException {
        Trips trips1 = FactoryDao.getTripsDao().findTripsById(idtrip);
        JSONObject obj1 = new JSONObject();
        obj1.put("idtrip",trips1.getIdtrip());
        obj1.put("arrive_campus",trips1.getArrive_campus());
        obj1.put("arrive_date",trips1.getArrive_campus());
        obj1.put("depart_campus",trips1.getDepart_campus());
        obj1.put("depart_date",trips1.getDepart_date());
        obj1.put("airport_name",trips1.getAirport_name());
        obj1.put("user_idbooster",trips1.getUsers_idboosterId());
        return obj1.toString();
    }
    @DELETE @Path("/listtrips/{id}")
    public void removeTrips(@PathParam("idtrip") Long idtrip){
        FactoryDao.getTripsDao().removeTrips(FactoryDao.getTripsDao().findTripsById(idtrip));
    }*/

    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/searchtrips")
    public String getAllTripsByCampusinJson(@PathParam("campus_list") String campus,@PathParam("choice") int choice) throws JSONException {
        List<Trips> trips14 = FactoryDao.getTripsDao().getAllTripsByCampus(campus,choice);
        JSONArray list14 = new JSONArray();
        for (Trips trips4 : trips14){
            JSONObject obj1 = new JSONObject();
            obj1.put("idtrip",trips4.getIdtrip());
            obj1.put("arrive_campus",trips4.getArrive_campus());
            obj1.put("arrive_date",trips4.getArrive_campus());
            obj1.put("depart_campus",trips4.getDepart_campus());
            obj1.put("depart_date",trips4.getDepart_date());
            obj1.put("airport_name",trips4.getAirport_name());
            obj1.put("user_idbooster",trips4.getUsers_idboosterId());
            list14.put(obj1);
        }
        return list14.toString();
    }
}
