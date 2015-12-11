package com.suptrips.rest;

import com.suptrips.FactoryDao;
import com.suptrips.Trips;
import com.suptrips.Users;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/auth/updateuser")
public class UsersResource {


    /*@GET @Produces(MediaType.APPLICATION_XML)
    @Path("/auth/updateuser")
    public String getUserByIDXml(@PathParam("idbooster") long idbooster) {
        Users users = FactoryDao.getUsersDao().findUserById(idbooster);
        String result = new String("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        result = result.concat("<users><idbooster>"+
                users.getIdbooster()+"</idbooster><firstname>"+
                users.getFirstname()+"</firstname><lastname>"+
                users.getLastname()+"</lastname><email>"+
                users.getEmail()+"</email></users>");

        return result;
    }*/

    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/auth/updateuser")
    public String getUserByIDJson(@PathParam("idbooster") long idbooster) throws JSONException {
        Users users = FactoryDao.getUsersDao().findUserById(idbooster);
        JSONObject obj1 = new JSONObject();
        obj1.put("idbooster",users.getIdbooster());
        obj1.put("campusname",users.getCampus_name());
        obj1.put("firstname",users.getFirstname());
        obj1.put("lastname",users.getLastname());
        obj1.put("email",users.getEmail());
        return users.toString();
    }

    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/auth/updateuser")
    public String getUsersTripsJson(@PathParam("idbooster") long idbooster) throws JSONException {
        List<Trips> trips2 = FactoryDao.getTripsDao().getAllUsersTrips(idbooster);
        JSONArray list2 = new JSONArray();
        for (Trips trips12 : trips2){
            JSONObject obj1 = new JSONObject();
            obj1.put("idtrip",trips12.getIdtrip());
            obj1.put("arrive_campus",trips12.getArrive_campus());
            obj1.put("arrive_date",trips12.getArrive_campus());
            obj1.put("depart_campus",trips12.getDepart_campus());
            obj1.put("depart_date",trips12.getDepart_date());
            obj1.put("airport_name",trips12.getAirport_name());
            list2.put(obj1);
        }
        return list2.toString();

    }
}
