package ua.burdyga._7_views._4_parameter_method_name_resolver;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EnrollmentController extends MultiActionController {

    public ModelAndView enroll(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("EnrollmentPage", "msg", "enroll() method");
    }

    public ModelAndView findProvider(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("EnrollmentPage", "msg", "findProvider() method");
    }

    public ModelAndView addApplication(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("EnrollmentPage", "msg", "addApplication() method");
    }

    public ModelAndView listPractitioner(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("EnrollmentPage", "msg", "listPractitioner() method");
    }
}
