package com.rest.DAO.impl;

import com.rest.DAO.UserManagerDAO;
import com.vuser.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ashok on 9/20/2014.
 */
public class UserManagerMemoryDAO implements UserManagerDAO{
    private int nextUserId = 0;

    List users = new ArrayList();

    public User fetchUserById(Integer id)
    {
        for (User user : users)
        {
            if (user.getId() == id)
            {
                return user;
            }
        }

        throw new RuntimeException("User Not Found: " + id);
    }

    public List fetchAllUsers()
    {
        return users;
    }

    public void insertUser(User user)
    {
        user.setId(nextUserId++);
        users.add(user);
    }

    public void updateUser(User user)
    {
        User editUser = fetchUserById(user.getId());

        editUser.setBirthDate(user.getBirthDate());
        editUser.setCity(user.getCity());
        editUser.setEmail(user.getEmail());
        editUser.setName(user.getName());
        editUser.setState(user.getState());
    }

    public void deleteUser(User user)
    {
        User delUser = fetchUserById(user.getId());
        users.remove(delUser);
    }
}
