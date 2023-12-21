package org.example.plus2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Plus2Application {

  public static void main(String[] args) {
    SpringApplication.run(Plus2Application.class, args);
  }

}
