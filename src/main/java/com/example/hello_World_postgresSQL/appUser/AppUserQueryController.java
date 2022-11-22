package com.example.hello_World_postgresSQL.appUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppUserQueryController {

    private AppUserRepository appUserRepository;


    @Autowired
    public AppUserQueryController(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @GetMapping("/api/name/{name}")
    public List<AppUser> getAppUserNameStartsWith(@PathVariable String name) {
        return appUserRepository.findByNameStartsWith(name);
    }

}
