package com.jokerconf.jpapuzzlers;

import com.jokerconf.jpapuzzlers.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JpaPuzzler6Application implements CommandLineRunner {

    @Autowired
    private PetRepository petRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaPuzzler6Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        petRepository.findById(1L).ifPresent(System.out::println);
    }
}