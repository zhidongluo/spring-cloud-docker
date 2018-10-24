package cn.sunday.microservicesimpleprovideruser.controller;

import cn.sunday.microservicesimpleprovideruser.dao.UserRepository;
import cn.sunday.microservicesimpleprovideruser.model.User;
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
