package ua.burdyga._6_controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class EmployeeController {

    @RequestMapping("/employee/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("EmployeePage", "msg", "add() method");
    }

    @RequestMapping("/employee/delete")
    public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("EmployeePage", "msg", "delete() method");
    }

    @RequestMapping("/employee/update")
    public ModelAndView update(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("EmployeePage", "msg", "update() method");
    }

    @RequestMapping("/employee/list")
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("EmployeePage", "msg", "list() method");
    }

}
