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
@Entity(name = "ROLE_TABLE")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;
}
