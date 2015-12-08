package com.suptrips;

import java.util.List;

public interface UsersDao  {

    Users addUser(Users users);
    Users findUserById(String idbooster);
    Users verifUserPassword(String iduser, String pass);
    List<Users> getAllUsers();
    void updateUsers(Users users);
    void removeUsers(Users users);

}
