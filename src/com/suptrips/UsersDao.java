package com.suptrips;

import java.util.List;

/**
 * Created by root on 02/12/15.
 */
public interface UsersDao  {

    Users addUser(Users users);
    Users findUserById(int idbooster);
    List<Users> getAllUsers();
    void updateUsers(Users users);
    void removeUsers(Users users);
}
