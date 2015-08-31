package ua.burdyga._2_spring.bean._4_di._9_jsr250_annotations;

import ua.burdyga._2_spring.bean._4_di.UserBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class JsrBean {

    private UserBean user;

    public UserBean getUser() {
        return user;
    }

    @Resource(name = "userBean")
    public void setUser(UserBean user) {
        this.user = user;
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean it going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will destroy now.");
    }

    @Override
    public String toString() {
        return "JsrBean {" + "user=" + user + '}';
    }
}
