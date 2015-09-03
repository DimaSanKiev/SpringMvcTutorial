package ua.burdyga._9_ajax._1_json_response.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.burdyga._9_ajax._1_json_response.dao.Catalogue;
import ua.burdyga._9_ajax._1_json_response.model.Item;
import ua.burdyga._9_ajax._1_json_response.model.OrderForm;
import ua.burdyga._9_ajax._1_json_response.model.UserSelections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RentMovieController {
    private static final Logger logger = LoggerFactory.getLogger(RentMovieController.class);

    private static final String FORM_VIEW = "browsemovies";

    private final Catalogue catalogue;

    private static Map<String, String> moviesPromos;

    static {
        moviesPromos = new HashMap<String, String>();
        moviesPromos.put("Harry Potter", "harrypotter.jpg");
        moviesPromos.put("Sherlock Holmes", "sherlockholmes.jpg");
        moviesPromos.put("Alice in Wonderland", "aliceinwonderland.jpg");
    }

    @Autowired
    public RentMovieController(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    @RequestMapping(value = "/rent-movies", method = RequestMethod.GET)
    public String createForm(Model model) {
        logger.debug("Displaying items available.");
        adddisplayItemToTheModel(model);
        addFormObjectToModel(model);
        return FORM_VIEW;
    }

    private void adddisplayItemToTheModel(Model model) {
        List<Item> items = catalogue.read();
        model.addAttribute("items", items);
    }

    private void addFormObjectToModel(Model model) {
        UserSelections userSelections = new UserSelections();
        model.addAttribute(userSelections);
    }

    @RequestMapping(value = "/rental-confirm", method = RequestMethod.POST)
    public
    @ResponseBody
    OrderForm confirmPurchases(@ModelAttribute("userSelections") UserSelections userSelections) {
        OrderForm orderForm = createOrderForm(userSelections.getSelection());
        return orderForm;
    }

    private OrderForm createOrderForm(List<String> selections) {
        List<Item> items = findItemsInCatalogue(selections);
        String purchaseId = getPurchaseId();

        OrderForm orderForm = new OrderForm(items, purchaseId);
        return orderForm;
    }

}
