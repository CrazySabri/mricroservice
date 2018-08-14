package club.itchina;

import club.itchina.domain.User;
import club.itchina.repository.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

/**
 * @author: sabri
 * @date: 2018/8/14 21:07
 * @description:
 */
@SpringBootApplication
public class ProviderUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
    }


/*    @Bean
    InitializingBean saveData(UserRepository repository) {
        return ()-> {
            repository.save(new User("account1", "云天河1", 20, new BigDecimal("100.00")));
            repository.save(new User("account2", "云天河2", 20, new BigDecimal("100.00")));
            repository.save(new User("account3", "云天河3", 20, new BigDecimal("100.00")));
        };
    }*/
}
