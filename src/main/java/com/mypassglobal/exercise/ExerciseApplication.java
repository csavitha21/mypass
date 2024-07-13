package com.mypassglobal.exercise;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "MyPass Projects",
                version = "v1",
                description = "This is exercise project",
                contact = @Contact(
                        name = "Savitha Chalapathy",
                        email = "savithavinaykrishnan@gmail.com"
                )
        )
)
public class ExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseApplication.class, args);
    }

}
