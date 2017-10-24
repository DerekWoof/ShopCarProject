package CarsType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CarAdvisor", value = "/car")


public class CarAdvisor extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        super.doPost(httpServletRequest, httpServletResponse);
        String carType = httpServletRequest.getParameter("rodzaj");
        CarType carAdvisorFinal = new CarType(carType);
        String car = carAdvisorFinal.getCarType();
        httpServletRequest.setAttribute("car", car);
        httpServletRequest.getRequestDispatcher("carType.jsp").forward(httpServletRequest, httpServletResponse);
    }
}
