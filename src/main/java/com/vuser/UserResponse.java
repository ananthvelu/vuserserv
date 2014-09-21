package com.vuser;

import java.util.List;

/**
 * This class is for holding the information on the list of returned User Objects.
 */
public class UserResponse {
    private List users;
    private String errorMessage;
    private Boolean success = true;

    public List getUsers() {
        return users;
    }

    public void setUsers(List users) {
        this.users = users;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
