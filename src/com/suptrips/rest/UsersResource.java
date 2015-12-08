package com.suptrips.rest;

import com.suptrips.FactoryDao;
import com.suptrips.Users;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/auth/profile")
public class UsersResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/auth/profile")
    public String getUserByIDJson() throws JSONException {
        List<Users> users = FactoryDao.getUsersDao().getAllUsers();
        JSONArray list1 = new JSONArray();
        for (Users users1 : users){
            JSONObject obj1 = new JSONObject();
            obj1.put("idbooster",users1.getIdbooster());
            obj1.put("campusname",users1.getCampus_name());
            obj1.put("firstname",users1.getFirstname());
            obj1.put("lastname",users1.getLastname());
            obj1.put("email",users1.getEmail());
            list1.put(obj1);
        }
        return list1.toString();
    }
}
