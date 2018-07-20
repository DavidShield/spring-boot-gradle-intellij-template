package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/test")
    public Test test() {
        return new Test("123", "wang");
    }

    @RequestMapping("/index")
    public ResponseEntity<String> get(@RequestBody(required = false) String name) {
        return new ResponseEntity<String>("Dawei", HttpStatus.OK);
    }
}
