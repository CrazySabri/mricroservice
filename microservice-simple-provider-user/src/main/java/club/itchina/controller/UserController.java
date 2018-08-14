package club.itchina.controller;

import club.itchina.domain.User;
import club.itchina.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: sabri
 * @date: 2018/8/14 21:04
 * @description:
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public String findById(@PathVariable Long id) {
        return this.userRepository.getOne(id).toString();
    }
}
