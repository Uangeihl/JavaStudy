package Control;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class UserServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String operate = request.getParameter("operate");
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        UserDeal udl = new UserDeal();
        if (operate.equals("login")) {
            try {
                if (udl.isLogin(user)) response.sendRedirect("ShowScoresServlet");
                else {
                    request.setAttribute("message", "您的信息有误，请重新登录！");
                    request.getRequestDispatcher("Login.jsp").forward(request, response);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else if (operate.equals("register")) {
            String checkpassword = request.getParameter("checkpassword");
            try {
                if (username.equals("")||password.equals("") || checkpassword.equals("")) {
                    request.setAttribute("message", "账号或密码不可为空，请重新注册！");
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
                } else if (!password.equals(checkpassword)) {
                    request.setAttribute("message", "密码与确认密码不一致，请重新注册！");
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
                } else if (udl.isUserExist(user)) {
                    request.setAttribute("message", "用户名已被占用，请更换用户名或直接登录！");
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
                } else if(udl.isInsertSuccess(user)) {
                    request.setAttribute("message", "注册成功，请登录！");
                    request.getRequestDispatcher("Login.jsp").forward(request, response);
                } else {
                    request.setAttribute("message", "您的信息有误，请重新注册！");
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
