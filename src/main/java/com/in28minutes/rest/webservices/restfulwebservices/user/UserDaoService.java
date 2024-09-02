package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component()
public class UserDaoService {
    //private User user;
    public List<User> users = new ArrayList<>();
    public UserDaoService() {

        users.add(new User(1, "ahad", LocalDate.now().minusYears(30)));
        users.add(new User(2, "aman", LocalDate.now().minusYears(20)));
        users.add(new User(3, "Jack", LocalDate.now().minusYears(10)));
        users.add(new User(4, "Jill", LocalDate.now().minusYears(5)));
    }
    public List<User> findAll() {
        return users;
    }
    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        throw new UserNotFoundException("user not found with id-" + id);
    }
    public User save(User user) {
        if (user.getId() == null) {
            user.setId(users.size() + 1);
        }
        users.add(user);
        return user;
    }
}
