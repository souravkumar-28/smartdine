package com.smartdine.restaurant.controller;

import com.smartdine.restaurant.model.Order;
import com.smartdine.restaurant.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.List;



@RestController
@RequestMapping("/api/orders")
@CrossOrigin
public class OrderController {

    private final OrderRepository repo;

    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Order> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Order place(@RequestBody Order order) {
        order.setStatus("NEW");
        return repo.save(order);
    }

    @PutMapping("/{id}/status/{status}")
    public Order updateStatus(@PathVariable Long id,@PathVariable String status){
        Order o = repo.findById(id).orElseThrow();
        o.setStatus(status);
        return repo.save(o);
    }

    @GetMapping("/stats")
    public Map<String, Object> stats() {
        List<Order> list = repo.findAll();

        double revenue = list.stream()
                .mapToDouble(Order::getTotal)
                .sum();

        long pending = list.stream()
                .filter(o -> !o.getStatus().equals("READY"))
                .count();

        return Map.of(
                "totalOrders", list.size(),
                "revenue", revenue,
                "pending", pending
        );
    }

}
