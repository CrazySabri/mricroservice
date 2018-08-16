package club.itchina.controller;

import club.itchina.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: sabri
 * @date: 2018/8/14 22:52
 * @description:
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("user.userServiceUrl")
    private String userServiceUrl;

    @GetMapping("/user/{id}")
    public String findById(@PathVariable Long id) {
       return this.restTemplate.getForObject(this.userServiceUrl + id, User.class).toString();
    }
}
