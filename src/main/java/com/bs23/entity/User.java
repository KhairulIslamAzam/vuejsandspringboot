package com.bs23.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */

@Getter
@Setter
@Table
@Entity(name = "USER_TABLE")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role;
}
