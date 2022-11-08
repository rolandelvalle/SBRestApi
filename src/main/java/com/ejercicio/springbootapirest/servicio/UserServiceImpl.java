package com.ejercicio.springbootapirest.servicio;

import org.apache.catalina.User;

import java.util.HashMap;
import java.util.List;

public class UserServiceImpl implements UserService{

    HashMap<String, Object> map = new HashMap <String, Object> ();
    HashMap x = new HashMap ();

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> all() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public User update(User user, String userId) {
        return null;
    }
}
