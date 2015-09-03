package ua.burdyga.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.burdyga.app.model.Subscriber;

import javax.validation.Valid;

@Controller
public class GroupBuyingController {

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String loadFormPage(Model model) {
        model.addAttribute("subscriber", new Subscriber());
        return "fromPage";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String submitForm(@Valid Subscriber subscriber, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "formPage";
        }
        model.addAttribute("message", "Successfully saved person: " + subscriber.toString());
        return "formPage";
    }
}
