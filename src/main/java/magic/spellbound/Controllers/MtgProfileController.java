package magic.spellbound.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("profile")
public class MtgProfileController {

    @GetMapping
    public String GetAll() {
        return "Hello there";
    }
}
