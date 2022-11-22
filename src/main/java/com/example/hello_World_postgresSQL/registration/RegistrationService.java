package com.example.hello_World_postgresSQL.registration;

import com.example.hello_World_postgresSQL.appUser.AppUser;
import com.example.hello_World_postgresSQL.appUser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    // Inject appUserService
    private final AppUserService appUserService;


    public String register(RegistrationRequest request) {
        return appUserService.signUpUser(new AppUser(
                request.getName(),
                request.getUsername(),
                request.getEmail(),
                request.getPassword()
        ));
    }
}
