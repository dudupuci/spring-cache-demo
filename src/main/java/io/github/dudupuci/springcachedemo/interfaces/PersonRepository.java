package io.github.dudupuci.springcachedemo.interfaces;

import io.github.dudupuci.springcachedemo.entities.Person;

import java.util.Optional;

public interface PersonRepository {
    Person getById(String id);
}
