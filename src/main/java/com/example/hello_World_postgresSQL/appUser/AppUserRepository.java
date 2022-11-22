package com.example.hello_World_postgresSQL.appUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface AppUserRepository extends JpaRepository<AppUser,Long> {

    Optional<AppUser> findByEmail(String email);

    List<AppUser> findByNameStartsWith(String name);

    List<AppUser> findAll();

}
