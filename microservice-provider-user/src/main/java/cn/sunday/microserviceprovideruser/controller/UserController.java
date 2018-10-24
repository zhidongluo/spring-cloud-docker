package cn.sunday.microserviceprovideruser.controller;

import cn.sunday.microserviceprovideruser.dao.UserRepository;
import cn.sunday.microserviceprovideruser.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        Optional<User> user = this.userRepository.findById(id);
        return user.get();
    }
}
