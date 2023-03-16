package br.com.tiagoguerreirodev.youreducation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableFeignClients(basePackages = {"br.com.tiagoguerreirodev"})
@ComponentScan(basePackages = {"br.com.tiagoguerreirodev"})
public class YourEducationApplication {

    public static void main(String[] args) {
        SpringApplication.run(YourEducationApplication.class, args);
    }

}
