package ai.springboot.adsmanagement;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@MapperScan("ai.springboot.adsmanagement.dao")
@SpringBootApplication
public class AdsmanagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdsmanagementApplication.class, args);

    }
}
