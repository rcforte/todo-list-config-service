package com.rcforte.todolistconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TodoListConfigServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(TodoListConfigServiceApplication.class, args);
  }
}

