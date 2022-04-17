package Control;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class ScoresOperateServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ScoresDeal sdl = new ScoresDeal();
        String operate = request.getParameter("operate");
        if(operate.equals("delete")){
            try {
                if (sdl.deleteResult(Integer.parseInt(request.getParameter("id")))){
                    request.setAttribute("message", "删除成功");
                    request.getRequestDispatcher("Delete.jsp").forward(request, response);
                } else {
                    request.setAttribute("message", "删除不成功，学号不存在");
                    request.getRequestDispatcher("Delete.jsp").forward(request, response);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        Student student = new Student();
        student.setId(Integer.parseInt(request.getParameter("id")));
        student.setName(request.getParameter("name"));
        student.setCzxt(Integer.parseInt(request.getParameter("czxt")));
        student.setWjyl(Integer.parseInt(request.getParameter("wjyl")));
        student.setJsjwl(Integer.parseInt(request.getParameter("jsjwl")));
        if(operate.equals("add")){
            try {
                if (sdl.addResult(student)){
                    request.setAttribute("message", "添加成功");
                    request.getRequestDispatcher("Add.jsp").forward(request, response);
                } else {
                    request.setAttribute("message", "添加失败，学号已存在");
                    request.getRequestDispatcher("Add.jsp").forward(request, response);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(operate.equals("modify")){
            try {
                if (sdl.modifyResult(student)){
                    request.setAttribute("message", "修改成功");
                    request.getRequestDispatcher("Modify.jsp").forward(request, response);
                } else{
                    request.setAttribute("message", "修改不成功，学号不存在");
                    request.getRequestDispatcher("Modify.jsp").forward(request, response);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
