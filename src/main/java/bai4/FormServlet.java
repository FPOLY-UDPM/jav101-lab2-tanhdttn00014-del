package bai4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/form/update/4")
public class FormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User bean = new User();
        bean.setFullname("Nguyễn Văn Tèo");
        bean.setGender(true);
        bean.setCountry("VN");

        req.setAttribute("user", bean);

        req.setAttribute("editabled", true);

        req.getRequestDispatcher("/lab2_4/form.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullname = req.getParameter("fullname");
        System.out.println(fullname);
        req.getRequestDispatcher("/lab2_4/form.jsp").forward(req, resp);
    }
}

