package guru.springframework.sfgpetclinic.web.controllers;

import guru.springframework.sfgpetclinic.data.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners", "/owners/list", "/owners/index", "/owners/index.html"})
    public String listOnwers(Model model) {
        model.addAttribute("owners", ownerService.findAll());

        return "owners/list";
    }
}
