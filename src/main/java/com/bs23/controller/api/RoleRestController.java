package com.bs23.controller.api;

import com.bs23.entity.Role;
import com.bs23.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1")
public class RoleRestController {

    final RoleService roleService;

    public RoleRestController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/roles")
    public List<Role> getAllRole(){
        return this.roleService.getAll();
    }

    @PostMapping("/roles")
    public Role save(@RequestBody Role role) {
        return this.roleService.save(role);
    }

    @DeleteMapping("roles/{id}")
    public void get(@PathVariable Long id) {
        this.roleService.deleteById(id);
    }
}
