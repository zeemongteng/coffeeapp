package com.pongsapat.coffeeapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pongsapat.coffeeapp.model.Coffee;

@Service
public class CoffeeService {

    private final List<Coffee> coffees = new ArrayList<>();
    private int nextId = 1;

    public CoffeeService() {
        // seed data so GET works immediately
        coffees.add(new Coffee(nextId++, "Espresso", 45.0));
        coffees.add(new Coffee(nextId++, "Latte", 55.0));
    }

    public List<Coffee> getAll() {
        return coffees;
    }

    public Optional<Coffee> getById(int id) {
        return coffees.stream()
                .filter(c -> c.getId() == id)
                .findFirst();
    }

    public Coffee add(Coffee coffee) {
        coffee.setId(nextId++);
        coffees.add(coffee);
        return coffee;
    }

    public Optional<Coffee> update(int id, Coffee updated) {
        Optional<Coffee> existing = getById(id);
        existing.ifPresent(c -> {
            c.setName(updated.getName());
            c.setPrice(updated.getPrice());
        });
        return existing;
    }

    public boolean delete(int id) {
        return coffees.removeIf(c -> c.getId() == id);
    }
}