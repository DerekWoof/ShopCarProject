package CarsType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CarAdvisor", value = "/wiek")


public class AgeAdvisor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        super.doGet(httpServletRequest, httpServletResponse);
        String carType = httpServletRequest.getParameter("wiek");
        CarType carAdvisorFinal = new CarType(carType);
        String car = carAdvisorFinal.getCarType();
        httpServletRequest.setAttribute("car", car);
        httpServletRequest.getRequestDispatcher("carType.jsp").forward(httpServletRequest, httpServletResponse);
    }
}
