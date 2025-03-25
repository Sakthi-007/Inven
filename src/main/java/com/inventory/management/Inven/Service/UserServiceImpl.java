package com.inventory.management.Inven.Service;

import com.inventory.management.Inven.Model.User;
import com.inventory.management.Inven.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public User createUSer(User user) {
        return userRepo.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public List<User> getUsers() {

        return userRepo.findAll();
    }
}
