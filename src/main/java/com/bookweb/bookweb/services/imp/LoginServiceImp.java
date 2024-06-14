package com.bookweb.bookweb.services.imp;
import java.util.List;

import com.bookweb.bookweb.models.User;


public interface LoginServiceImp {
    List<User> getAllUser();
    boolean checkLogin(String username, String password);
}
