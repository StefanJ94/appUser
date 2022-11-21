package com.example.hello_World_postgresSQL.appUser;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppUserService {

    // reference to Repository

    private final AppUserRepository appUserRepository;


    public String signUpUser(AppUser appUser) {
     // Check if User exists
     boolean userExists =  appUserRepository.findByEmail(appUser.getEmail()).isPresent();

     if (userExists) {
         throw  new IllegalStateException("Email already taken!");
     }

     appUserRepository.save(appUser);

     return "It works!";
    }
}
