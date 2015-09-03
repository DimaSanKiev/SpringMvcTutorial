package ua.burdyga._9_ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/jsoncontroller")
public class JSONController {

    @RequestMapping(value = "(name)", method = RequestMethod.GET)
    public @ResponseBody Shop getShopInJson(@PathVariable String name) {
        Shop shop = new Shop();
        shop.setName(name);
        shop.setStaffName(new String[] {"manager", "Bob"});
        return shop;
    }
}
