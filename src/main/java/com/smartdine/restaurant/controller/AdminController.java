package com.smartdine.restaurant.controller;

import com.smartdine.restaurant.model.Admin;
import com.smartdine.restaurant.repository.AdminRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin
public class AdminController {

    private final AdminRepository repo;

    public AdminController(AdminRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/login")
    public boolean login(@RequestBody Admin a) {
        Admin db = repo.findByUsername(a.getUsername());
        return db != null && db.getPassword().equals(a.getPassword());
    }
}
