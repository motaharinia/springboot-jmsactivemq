package com.motaharinia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;


@SpringBootApplication(scanBasePackages = {"com.motaharinia"})
@EnableJms
public class JmsActiveMqApplication {

  public static void main(String[] args) {
    SpringApplication.run(JmsActiveMqApplication.class, args);
  }
}
