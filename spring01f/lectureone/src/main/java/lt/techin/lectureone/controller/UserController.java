package lt.techin.lectureone.controller;

import org.springframework.web.bind.annotation.*;

@RestController()
public class UserController {

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

//    @PostMapping
//    @PutMapping
//    @DeleteMapping

}
