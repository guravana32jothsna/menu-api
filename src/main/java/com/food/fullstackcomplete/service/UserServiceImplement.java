package com.food.fullstackcomplete.service;

import com.food.fullstackcomplete.Dto.LoginDTO;
import com.food.fullstackcomplete.Dto.UserDTO;
import com.food.fullstackcomplete.model.User_db;
import com.food.fullstackcomplete.payloadResponse.LoginMessage;
import com.food.fullstackcomplete.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplement implements UserService{

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private EmailSendService emailSendService;
    @Override
    public String addUser(UserDTO userDTO) {
        User_db userDb = new User_db(
                userDTO.getUserId(),
                userDTO.getUserName(),
                userDTO.getEmail(),
//                userDTO.getPassword()
                this.passwordEncoder.encode(userDTO.getPassword())
        );
        userRepo.save(userDb);
        emailSendService.sendEmail(userDb.getEmail());
//        emailService.sendRegistrationEmail(user.getEmail(), user.getUsername());
        return userDb.getUserName();
    }

    @Override
    public LoginMessage loginUser(LoginDTO loginDTO) {
        String msg = "";
        User_db userDb = userRepo.findByEmail(loginDTO.getEmail());
        if(userDb != null) {
            String password = loginDTO.getPassword();
            String encodedpassword = userDb.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password , encodedpassword);
            if(isPwdRight) {
                Optional<User_db> userDb1 = userRepo.findOneByEmailAndPassword(loginDTO.getEmail() , encodedpassword);
                if(userDb1.isPresent()) {
                    return new LoginMessage("Login Sucess" ,true);
                }
                else {
                    return new LoginMessage("Login Failed" , false);
                }
            }
            else {
                return new LoginMessage("password Not Match",false);
            }
        }
        else {
            return new LoginMessage("Email does not exist",false);
        }

    }
}
