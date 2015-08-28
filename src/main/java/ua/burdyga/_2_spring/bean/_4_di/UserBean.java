package ua.burdyga._2_spring.bean._4_di;

public class UserBean {
    BillingDetailsBean userBilling;

    public UserBean() {
        super();
        this.userBilling = new BillingDetailsBean();
    }

    public UserBean(BillingDetailsBean userBilling) {
        super();
        this.userBilling = userBilling;
    }

    public BillingDetailsBean getUserBilling() {
        return userBilling;
    }

    public void setUserBilling(BillingDetailsBean userBilling) {
        this.userBilling = userBilling;
    }
}
