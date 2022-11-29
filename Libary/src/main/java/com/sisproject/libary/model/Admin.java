package com.sisproject.libary.model;
import java.util.Collection;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "admin")

public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")

    private Long id;

    private String firstname;

    private String lastname;

    private String username;

    private String password;

    @Lob
    @Column(columnDefinition = "MEDIUMLOB")
    private String image;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "admin_roles",joinColumns = @JoinColumn(name = "admin_id",referencedColumnName = "admin_id"),
    inverseJoinColumns = @JoinColumn(name = "roles_id",referencedColumnName = "role_id"))

    private Collection<Role> roles;
}

