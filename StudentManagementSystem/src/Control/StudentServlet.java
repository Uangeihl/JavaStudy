package Control;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class StudentServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operate = request.getParameter("operate");
        Operate oper = new Operate();
        if (operate.equals("delete")) {
            try {
                if(oper.delete());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if(operate.equals("modify")){
            oper.modify();
        }
    }

}
