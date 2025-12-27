package com.smartdine.restaurant.controller;

import com.smartdine.restaurant.model.MenuItem;
import com.smartdine.restaurant.repository.MenuItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin
public class MenuController {

    private final MenuItemRepository repo;

    public MenuController(MenuItemRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<MenuItem> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public MenuItem add(@RequestBody MenuItem item) {
        return repo.save(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }

}
