package ua.burdyga._6_controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends MultiActionController {

    public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("[addUser]");
        return new ModelAndView("UserPage", "msg", "add() method");
    }

    public ModelAndView deleteUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("[deleteUser]");
        return new ModelAndView("UserPage", "msg", "delete() method");
    }

    public ModelAndView updateUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("[updateUser]");
        return new ModelAndView("UserPage", "msg", "update() method");
    }

    public ModelAndView listUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("[listUser]");
        return new ModelAndView("UserPage", "msg", "list() method");
    }
}
