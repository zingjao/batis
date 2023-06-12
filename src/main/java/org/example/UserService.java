package org.example;

import org.example.user.User;
import org.springframework.stereotype.Component;

public interface UserService {
    public User getUserById(int userId);

    boolean addUser(User record);
}
