package com.suptrips.rest;

import com.suptrips.FactoryDao;
import com.suptrips.Users;
import org.json.JSONException;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/auth/updateuser")
public class UsersResource {


    @GET @Produces(MediaType.APPLICATION_XML)
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
    }

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
}
