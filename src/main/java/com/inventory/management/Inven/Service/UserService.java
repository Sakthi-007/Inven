package com.inventory.management.Inven.Service;

import com.inventory.management.Inven.Model.User;

import java.util.List;

public interface UserService {
    public User createUSer(User user);
    public User getUser(Long id);
    public User updateUser(User user);
    public void deleteUser(Long id);
    public List<User> getUsers();
}
