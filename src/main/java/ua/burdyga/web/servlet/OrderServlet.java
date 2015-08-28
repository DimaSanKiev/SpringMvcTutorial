package ua.burdyga.web.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import ua.burdyga._2_spring.bean._2_container.ItemBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        ApplicationContext appContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());

        ItemBean itemBean = (ItemBean) appContext.getBean("itemBean");
        itemBean.setId(1);
        itemBean.setName("SwissWatch");
        itemBean.setPrice(500);

        response.getWriter().print(itemBean.toString());
        response.getWriter().close();
    }
}
