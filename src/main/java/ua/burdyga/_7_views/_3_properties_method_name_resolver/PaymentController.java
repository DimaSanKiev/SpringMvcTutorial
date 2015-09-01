package ua.burdyga._7_views._3_properties_method_name_resolver;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PaymentController extends MultiActionController {

    public ModelAndView capture(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("PaymentPage", "msg", "capture() method");
    }

    public ModelAndView setPayment(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("PaymentPage", "msg", "setPayment() method");
    }

    public ModelAndView saveCC(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("PaymentPage", "msg", "saveCC() method");
    }

    public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("PaymentPage", "msg", "process() method");
    }
}
