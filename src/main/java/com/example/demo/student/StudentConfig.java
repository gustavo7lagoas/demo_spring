package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.NOVEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {
            Student fran = new Student(
                    "Fran",
                    "franfonseca@email.com",
                    LocalDate.of(1987, AUGUST, 19)
            );

            Student gus = new Student(
                    "Gus",
                    "gusfonseca@email.com",
                    LocalDate.of(1984, NOVEMBER, 19)
            );

            repository.saveAll(
                    List.of(fran, gus)
            );

        };
    }
}
