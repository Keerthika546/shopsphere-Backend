package com.shopsphere.shopsphere;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    private final Map<Long, User> users = new HashMap<>();

    // Create User (POST /users)
    @PostMapping
    public User createUser(@RequestBody User user) {
        // Temporary ID generation (for now)
        long id = users.size() + 1L;
        user.setId(id);

        // default status if not provided
        if (user.getStatus() == null || user.getStatus().isEmpty()) {
            user.setStatus("ACTIVE");
        }

        users.put(id, user);
        return user;
    }

    // Get User by ID (GET /users/{id})
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return users.get(id);
    }
}
