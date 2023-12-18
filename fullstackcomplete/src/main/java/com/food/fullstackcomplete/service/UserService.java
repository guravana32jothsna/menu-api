package com.food.fullstackcomplete.service;

import com.food.fullstackcomplete.Dto.LoginDTO;
import com.food.fullstackcomplete.Dto.UserDTO;
import com.food.fullstackcomplete.payloadResponse.LoginMessage;

public interface UserService {

    String addUser(UserDTO userDTO);

    LoginMessage loginUser(LoginDTO loginDTO);
}
