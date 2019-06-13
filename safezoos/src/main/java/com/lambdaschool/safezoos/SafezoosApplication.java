package com.lambdaschool.safezoos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SafezoosApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SafezoosApplication.class, args);
    }

}
