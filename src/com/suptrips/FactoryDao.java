package com.suptrips;


import javax.persistence.Persistence;

public class FactoryDao {

    private static TripsDao tripsservice;
    private static UsersDao userservice;

    public static TripsDao getTripsDao(){
        if (tripsservice == null) {
            tripsservice = new JpaTripsDao(Persistence.);
        }
        return tripsservice;
    }

    public static UsersDao getUsersDao(){
        if (userservice == null){
            userservice = new JpaUsersDao(PersistenceManager.getEntityManagerFactory());
        }
        return userservice;
    }
}
