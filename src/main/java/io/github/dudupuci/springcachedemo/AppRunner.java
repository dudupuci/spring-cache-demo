package io.github.dudupuci.springcachedemo;

import io.github.dudupuci.springcachedemo.interfaces.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Component
public class AppRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);
    private final PersonRepository personRepository;

    public AppRunner(PersonRepository personRepository) {
        this.personRepository = Objects.requireNonNull(personRepository);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("...Fetching persons....");
        logger.info("person-1 -->" + personRepository.getById("person-1"));
        logger.info("person-2 -->" + personRepository.getById("person-2"));
        logger.info("person-3 -->" + personRepository.getById("person-3"));
        logger.info("person-2 -->" + personRepository.getById("person-2"));
        logger.info("person-3 -->" + personRepository.getById("person-3"));
        logger.info("person-2 -->" + personRepository.getById("person-2"));
        logger.info("person-3 -->" + personRepository.getById("person-3"));
        logger.info("person-2 -->" + personRepository.getById("person-2"));
        logger.info("person-3 -->" + personRepository.getById("person-3"));
        logger.info("person-1 -->" + personRepository.getById("person-1"));
    }
}
