package guru.springframework.sfgpetclinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners/list", "/owners/index", "/owners/index.html"})
    public String listOnwers() {
        return "owners/list";
    }
}
