package xin.stxkfzx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(value = "xin.stxkfzx.cosplayman.mapper")
public class CosplaymanApplication {

    public static void main(String[] args) {
        SpringApplication.run(CosplaymanApplication.class, args);
    }
}
