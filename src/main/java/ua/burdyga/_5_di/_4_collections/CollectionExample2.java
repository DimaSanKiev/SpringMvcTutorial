package ua.burdyga._5_di._4_collections;

import ua.burdyga._5_di.UserBean;

import java.util.List;

public class CollectionExample2 {
    private List<UserBean> usersList;

    public List<UserBean> getUsersList() {
        System.out.println("List Elements: " + usersList);
        return usersList;
    }

    public void setUsersList(List<UserBean> usersList) {
        this.usersList = usersList;
    }
}
