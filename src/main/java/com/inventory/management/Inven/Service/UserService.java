package com.inventory.management.Inven.Service;

import com.inventory.management.Inven.Model.User;
import com.inventory.management.Inven.Roles.UserRole;

import java.util.List;

public interface UserService {
    public User createUSer(User user);
    public User getUser(Long id);
    public User updateUser(User user);
    public void deleteUser(Long id);
    public List<User> getUsers();
    public User registerUser(User user, UserRole role);
    public User authUser(String email,String password);
}
