package Control;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String operate = request.getParameter("operate");
        DBManager db = new DBManager();
        if(operate.equals("login")){
            String sql = "select * from user.check where userName='"+userName+"'and password='"+password+"'";
            ResultSet resultSet = null;
            try {
                resultSet = db.executeQuery(sql);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                if(resultSet.next()) response.sendRedirect("success.jsp");
                else {
                    request.getSession().setAttribute("message", "您的信息有误，请重新登录！");
                    response.sendRedirect("Login.jsp");
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }else if(operate.equals("register")) {
            String checkpassword = request.getParameter("checkpassword");
            ResultSet resultSet = null;
            String sql1 = "select * from user.check where userName='"+userName+"'";
            String sql2 = "INSERT INTO user.check (userName,password) values('"+userName+"','"+password+"')";
            try {
                resultSet = db.executeQuery(sql1);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                if(resultSet.next()) {
                    request.setAttribute("message", "您已注册，请直接登录！");
                    response.sendRedirect("Login.jsp");
                }
                else {
                    try {
                        if(userName.equals("")||password.equals("")||checkpassword.equals("")) {
                            request.getSession().setAttribute("message", "userName或password不可为空，请重新注册！");
                            response.sendRedirect("register.jsp");
                        }
                        else if(!password.equals(checkpassword)){
                            request.setAttribute("message", "password与checkpassword不一致，请重新注册！");
                            response.sendRedirect("register.jsp");
                        }
                        else if(db.executeUpdate(sql2)>=1) response.sendRedirect("success.jsp");
                        else {
                            request.setAttribute("message", "您的信息有误，请重新注册！");
                            response.sendRedirect("register.jsp");
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
