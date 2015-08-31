package ua.burdyga._5_di;

public class UserBean {
    private String name;
    BillingDetailsBean userBilling;

    public UserBean() {
        this.userBilling = new BillingDetailsBean();
    }

    public UserBean(BillingDetailsBean userBilling) {
        this.userBilling = userBilling;
    }

    public BillingDetailsBean getUserBilling() {
        return userBilling;
    }

    public void setUserBilling(BillingDetailsBean userBilling) {
        this.userBilling = userBilling;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", userBilling=" + userBilling +
                '}';
    }
}
