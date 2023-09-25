package org.springframework.samples.petclinic.service;

import org.springframework.samples.petclinic.model.User;

public interface UserService {

    void saveUser(User user) ;
    void removeUser(User user);
    User findUserByUsername(String userName);
}
