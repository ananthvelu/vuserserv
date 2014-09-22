package com.vuser.api;

import com.vuser.model.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Consumes("application/json")
@Produces("application/json")
public interface UserManager {

    @POST
    @Path("/fetchUserById/")
    public User fetchUserById(String Id);



}
