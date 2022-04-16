package Control;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String operate = request.getParameter("operate");
        DBManager db = new DBManager();
        if (operate.equals("login")) {
            String sql = "select * from user.check where userName='" + userName + "'and password='" + password + "'";
            ResultSet resultSet = null;
            try {
                resultSet = db.executeQuery(sql);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                if (resultSet.next()) response.sendRedirect("ShowScoresServlet");
                else {
                    request.setAttribute("message", "您的信息有误，请重新登录！");
                    request.getRequestDispatcher("Login.jsp").forward(request, response);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else if (operate.equals("register")) {
            String checkpassword = request.getParameter("checkpassword");
            String sql1 = "select * from user.check where userName='" + userName + "'";
            String sql2 = "INSERT INTO user.check (userName,password) values('" + userName + "','" + password + "')";
            try {
                if (userName.equals("")||password.equals("") || checkpassword.equals("")) {
                    request.getSession().setAttribute("message", "userName或password不可为空，请重新注册！");
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
                } else if (!password.equals(checkpassword)) {
                    request.setAttribute("message", "password与checkpassword不一致，请重新注册！");
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
                } else {
                    ResultSet resultSet = null;
                    try {
                        resultSet = db.executeQuery(sql1);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    try {
                        if (resultSet.next()) {
                            resultSet.close();
//                            db.close();
                            request.setAttribute("message", "用户名已注册，请更换用户名或直接登录！");
                            request.getRequestDispatcher("Login.jsp").forward(request, response);
                        } else {
                            if(db.executeUpdate(sql2) >= 1) {
//                                db.close();
                                request.setAttribute("message", "注册成功，请登录！");
                                request.getRequestDispatcher("Login.jsp").forward(request, response);
                            }
                            else {
                                request.setAttribute("message", "您的信息有误，请重新注册！");
                                request.getRequestDispatcher("Register.jsp").forward(request, response);
                            }
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            } catch (ServletException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
