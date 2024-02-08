package com.groupeisi.CrudApplication.service;


import com.groupeisi.CrudApplication.entities.UserEntity;
import com.groupeisi.CrudApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    public Optional<UserEntity> updateUser(Long id, UserEntity updatedUser) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setPrenom(updatedUser.getPrenom());
                    user.setNom(updatedUser.getNom());
                    user.setAdresse(updatedUser.getAdresse());
                    user.setTelephone(updatedUser.getTelephone());
                    return userRepository.save(user);
                });
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
