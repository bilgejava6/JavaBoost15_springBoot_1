package com.muhammet.springboot_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
/**
 * http://localhost:9090/proje
 */
@RequestMapping("/proje")
public class SpringBoot1Application {

    /**
     * http://localhost:9090/proje/mrb
     *
     */
    @GetMapping("/mrb")
    public String merhaba(){
        System.out.println("Uygulama isteği buraya geldi..");
        return "merhaba";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot1Application.class, args);
    }

}
