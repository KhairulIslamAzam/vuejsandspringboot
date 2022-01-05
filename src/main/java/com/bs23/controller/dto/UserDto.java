package com.bs23.controller.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
@Getter
@Setter
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private Long roleId;
}
