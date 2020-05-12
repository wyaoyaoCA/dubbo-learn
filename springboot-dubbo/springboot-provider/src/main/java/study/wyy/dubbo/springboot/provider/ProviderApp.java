package study.wyy.dubbo.springboot.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wyaoyao
 * @data 2020-05-12 08:34
 */
@SpringBootApplication
@EnableDubbo // 开启注解dubbo
public class ProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class);
    }
}
