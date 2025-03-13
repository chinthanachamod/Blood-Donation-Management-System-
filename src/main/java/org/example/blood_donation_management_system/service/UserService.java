package org.example.blood_donation_management_system.service;


import org.example.blood_donation_management_system.dto.UserDTO;


public interface UserService {
    int saveUser(UserDTO userDTO);
    UserDTO searchUser(String username);
}