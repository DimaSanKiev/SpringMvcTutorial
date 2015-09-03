package ua.burdyga._9_ajax._1_json_response.model;

import java.util.List;

public class OrderForm {

    private final List<Item> items;
    private final String purchaseId;

    public OrderForm(String purchaseId, List<Item> items) {
        this.purchaseId = purchaseId;
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getPurchaseId() {
        return purchaseId;
    }
}
