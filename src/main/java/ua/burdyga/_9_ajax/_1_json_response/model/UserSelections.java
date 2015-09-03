package ua.burdyga._9_ajax._1_json_response.model;

import java.util.Collections;
import java.util.List;

public class UserSelections {

    private List<String> selections = Collections.emptyList();

    public List<String> getSelections() {
        return selections;
    }

    public void setSelections(List<String> selections) {
        this.selections = selections;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Selections are: ");
        for (String selection : selections) {
            sb.append(selection);
            sb.append(",  ");
        }
        return sb.toString();
    }
}
