package fr.pernisi.exemple.userManager.users;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping(path="/api/users",  produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @GetMapping("/")
    public List<User> getUserString( ) {
        return List.of(
            new User("user1", "password1"),
            new User("user2", "password2"));
    }
    


}
