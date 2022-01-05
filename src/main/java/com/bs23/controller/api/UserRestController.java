package com.bs23.controller.api;

import com.bs23.controller.dto.UserDto;
import com.bs23.entity.Role;
import com.bs23.entity.User;
import com.bs23.service.RoleService;
import com.bs23.service.UserService;
import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1")
public class UserRestController {

    final UserService userService;
    final RoleService roleService;

    public UserRestController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("/users")
    public List<User> getAll(){
        return this.userService.getAll();
    }

    @PostMapping("/users")
    public User save(@RequestBody @NotNull UserDto userDto) {
        Optional<Role> role = roleService.getRoleById(userDto.getRoleId());

        if (role.isPresent()) {
            User user = new User();
            if (userDto.getId() != null) user.setId(userDto.getId());
            user.setFirstName(userDto.getFirstName());
            user.setLastName(userDto.getLastName());
            user.setRole(role.get());
            return userService.save(user);
        }

        return null;
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
