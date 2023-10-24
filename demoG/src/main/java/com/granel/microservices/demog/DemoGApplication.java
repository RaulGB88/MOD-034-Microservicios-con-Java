package com.granel.microservices.demog;

import com.granel.microservices.demog.dao.ActorIDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGApplication implements CommandLineRunner {

    @Autowired
    ActorIDao actorIDao;

    public static void main(String[] args) {
        SpringApplication.run(DemoGApplication.class, args);
    }

    @Override
    public void run(String... args) {
        doIt();
    }

    public void doIt() {
        var list = actorIDao.findAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getFirstName());
        }

    }

}
