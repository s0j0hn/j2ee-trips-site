package com.suptrips;

import java.util.List;

public interface UsersDao  {

    Users addUser(Users users);
    Users findUserById(int idbooster);
    List<Users> getAllUsers();
    void updateUsers(Users users);
    void removeUsers(Users users);
}
