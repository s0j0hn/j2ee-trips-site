package com.suptrips;


public class FactoryDao {

    private static TripsDao tripsservice;
    private static UsersDao userservice;

    public static TripsDao getTripsDao(){
        if (tripsservice == null) {
            tripsservice = new JpaTripsDao(PersistenceManager.getEntityManagerFactory());
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
