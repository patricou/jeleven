package com.pat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.pat"})
public class JelevenApplication {

    public static void main(String[] args) {
        SpringApplication.run(JelevenApplication.class, args);
    }

    public void run(String... arg0) throws Exception{

    }

}
