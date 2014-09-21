package com.rest.DAO;

import com.vuser.User;

import java.util.List;

/**
 * Created by Ashok on 9/20/2014.
 */
public interface UserManagerDAO {
    public User fetchUserById(Integer id);
    public List fetchAllUsers();
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
}
