package com.ejercicio.springbootapirest.controlador;

import com.ejercicio.springbootapirest.dto.UserDto;
import com.ejercicio.springbootapirest.servicio.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/v1/user" )
public class UserController {
    private final UserService userService;

    public UserController(@Autowired UserService userService )
    {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> all()
    {
        return new ResponseEntity<>(userService.all(), HttpStatus.OK);
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById( @PathVariable("id") String id )
    {
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<User> create( @RequestBody User userDto)
    {
        return new ResponseEntity<>(userService.create(userDto), HttpStatus.CREATED);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<User> update( @RequestBody User userDto, @PathVariable("id") String id )
    {
        return new ResponseEntity<>(userService.update(userDto, id), HttpStatus.OK);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity delete( @PathVariable("id") String id )
    {
        User user = userService.deleteById(id);
        if (user != null){
            return new ResponseEntity(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}

