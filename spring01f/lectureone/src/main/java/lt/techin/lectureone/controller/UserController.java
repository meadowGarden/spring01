package lt.techin.lectureone.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lt.techin.lectureone.model.request.User;
import lt.techin.lectureone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequiredArgsConstructor
@NoArgsConstructor
//@AllArgsConstructor
public class UserController {

//    @Autowired
    private UserService userService;
//    private String somethin;

//    public UserController(UserService userService) {
//        this.userService = userService;
//    }





    @GetMapping()
    public Object getUser() {
        return "@";
    }
    @GetMapping("/different")
    public Object getDifferentThing() {
        return "@@@";
    }

    @PostMapping
    public Object returnWhateverWeReceived(
           @RequestParam String input
    ) {
        return input;
    }

    @PostMapping("/body")
    public User tryPassBody(@RequestBody User body) {
        return userService.capitalizeName(body);
    }


}
