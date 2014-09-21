package com.rest.services;


import com.vuser.UserRequest;
import com.vuser.UserResponse;

/**
 * Created by Ashok on 9/20/2014.
 */

@Consumes("application/json")
@produces("application/json")
public interface UserManager {

    @POST
    @PATH("/fetchUserById/")
    public UserResponse fetchUserById(UserRequest request);



}
