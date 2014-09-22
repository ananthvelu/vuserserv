package com.vuser.domain.dao;

import com.vuser.model.User;

import java.util.List;


/**
 * DAO for user manager
 */
public interface UserManagerDAO {
    public User fetchUserById(Integer id);
    public List fetchAllUsers();
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
}
