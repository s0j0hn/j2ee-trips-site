package com.suptrips.rest;

import com.suptrips.FactoryDao;
import com.suptrips.Trips;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/listtrips")
public class TripsResource {

    @GET @Produces(MediaType.APPLICATION_XML)
    @Path("/listtrips")
    public String getAllTripsInXml() {
        List<Trips> trips = FactoryDao.getTripsDao().getAllTrips();
        String result = new String("<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?><products>");
        for (Trips trips1 : trips){
            result = result.concat("<trips><idtrip>"+trips1.getIdtrip()+"</idtrip><arrive_date>"+trips1.getArrive_campus()+"</arrive_date><depart_date>"+trips1.getDepart_date()+"</depart_date><depart_campus>"+trips1.getDepart_campus()+"</depart_campus></trips>");
        }
        result = result.concat("</trips>");
        return result;
    }
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
            list1.put(obj1);
        }
        return list1.toString();
    }

    @GET @Path("/listtrips/{idtrip}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getTripsInJson(@PathParam("idtrip") Long idtrip) throws JSONException {
        Trips trips1 = FactoryDao.getTripsDao().findProductById(idtrip);
        JSONObject obj1 = new JSONObject();
        obj1.put("idtrip",trips1.getIdtrip());
        obj1.put("arrive_campus",trips1.getArrive_campus());
        obj1.put("arrive_date",trips1.getArrive_campus());
        obj1.put("depart_campus",trips1.getDepart_campus());
        obj1.put("depart_date",trips1.getDepart_date());
        return obj1.toString();
    }
}