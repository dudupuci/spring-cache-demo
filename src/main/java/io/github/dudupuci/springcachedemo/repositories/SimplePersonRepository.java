package io.github.dudupuci.springcachedemo.repositories;

import io.github.dudupuci.springcachedemo.entities.Person;
import io.github.dudupuci.springcachedemo.interfaces.PersonRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class SimplePersonRepository implements PersonRepository {
    @Override
    @Cacheable("persons")
    public Person getById(String id) {
        simulateSlowService();
        return new Person(id, "Unknown Person", "Male", 23);
    }


    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException err) {
            throw new IllegalStateException(err);
        }
    }
}
