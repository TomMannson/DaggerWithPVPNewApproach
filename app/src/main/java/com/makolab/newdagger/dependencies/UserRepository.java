package com.makolab.newdagger.dependencies;

/**
 * Created by tomasz.krol on 2017-07-07.
 */

public interface UserRepository {

    public void setUserName(String userName);

    public void setUserPassword(String password);

    public String getUserName();

    public String getUserPassword();
}
