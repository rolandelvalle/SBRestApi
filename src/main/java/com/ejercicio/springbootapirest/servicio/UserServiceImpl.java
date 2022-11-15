package com.ejercicio.springbootapirest.servicio;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    HashMap<User, Object> userHashMap = new HashMap<>();

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
    public User deleteById(String id) {
        return null;
    }

    @Override
    public User update(User user, String userId) {
        return null;
    }
}
