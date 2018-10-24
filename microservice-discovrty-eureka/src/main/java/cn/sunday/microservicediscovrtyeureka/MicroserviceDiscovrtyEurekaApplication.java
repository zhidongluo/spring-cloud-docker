package cn.sunday.microservicediscovrtyeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscovrtyEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscovrtyEurekaApplication.class, args);
    }
}
