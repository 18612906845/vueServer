package cn.citms.vue.vs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.citms.vue.vs.dao")
public class VsApplication {

    public static void main(String[] args) {
        SpringApplication.run(VsApplication.class, args);
    }

}
