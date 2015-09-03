package ua.burdyga._9_ajax._1_json_response.dao;

import org.springframework.stereotype.Component;
import ua.burdyga._9_ajax._1_json_response.model.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Catalogue {

    private static String[] names = {"Harry Potter", "Sherlock Holmes", "Alice in Wonderland", "Twilight", "The Great Gatsby"};
    private static String[] descriptions = {
            "Tale of Harry Potter, an orphan who discovers at the age of 11 that he is a wizard, who lives within the ordinary world of non-magical people, known as Muggles..",
            "Detective Sherlock Holmes and his stalwart partner Watson engage in a battle of wits and brawn with a nemesis whose plot is a threat to all of England.",
            "Nineteen-year-old Alice returns to the magical world from her childhood adventure, where she reunites with her old friends and learns of her true destiny: to end the Red Queen's reign of terror.",
            "A teenage girl risks everything when she falls in love with a vampire.",
            "A Midwestern war veteran finds himself drawn to the past and lifestyle of his millionaire neighbor."
    };
    private static BigDecimal[] prices = {new BigDecimal("10.45"), new BigDecimal("9.98"), new BigDecimal("4.05"), new BigDecimal("4.78"), new BigDecimal("3.85")};
    private final Map<Integer, Item> itemMap = new HashMap<>();

    public Catalogue() {
        for (int i = 0; i < names.length; i++) {
            int itemNumber = i + 1;
            Item item = Item.getInstance(itemNumber, names[i], descriptions[i], prices[i]);
            itemMap.put(itemNumber, item);
        }
    }

    public List<Item> read() {
        List<Item> items = new ArrayList<>();
        items.addAll(itemMap.values());
        return items;
    }

    public Item findItem(int itemNumber) {
        return itemMap.get(itemNumber);
    }
}
