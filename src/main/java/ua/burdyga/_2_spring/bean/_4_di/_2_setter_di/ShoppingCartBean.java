package ua.burdyga._2_spring.bean._4_di._2_setter_di;

import ua.burdyga._2_spring.bean._4_di.UserBean;

public class ShoppingCartBean {

    private String date;
    private UserBean user;
    private ProductBean product;

    public ShoppingCartBean() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public ProductBean getProduct() {
        return product;
    }

    public void setProduct(ProductBean product) {
        this.product = product;
    }

    public void displayCart() {
        if (product != null) {
            System.out.println("Cart date: " + date + ", has: " + product);
        }
    }
}
