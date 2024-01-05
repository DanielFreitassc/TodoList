package danielfreitassc.todolist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import danielfreitassc.todolist.models.User;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @PostMapping("/save")
    public void created(@RequestBody User user){
        System.out.println(user.getName());
    }
    @GetMapping("/buscar")
    
}
