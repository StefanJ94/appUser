package com.example.hello_World_postgresSQL.appUser;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class AppUser {


    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;

    public AppUser(String name,
                   String username,
                   String email,
                   String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
