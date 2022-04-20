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
        String strId = request.getParameter("id");
        if(operate.equals("delete")){
            if(strId.equals("")||!sdl.isNumber(strId)){
                request.setAttribute("message", "请输入正确值,且不可空");
                request.getRequestDispatcher("Delete.jsp").forward(request, response);
            } else {
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
        }
        Student student = new Student();
        boolean flage = false;
        String strName = request.getParameter("name");
        String strCzxt = request.getParameter("czxt");
        String strWjyl = request.getParameter("wjyl");
        String strJsjwl = request.getParameter("jsjwl");
        if (strId.equals("")||strName.equals("")||strCzxt.equals("")||strWjyl.equals("")||strJsjwl.equals("")){
            flage = true;
        } else if (!sdl.isNumber(strId)||!sdl.isNumber(strCzxt)||!sdl.isNumber(strWjyl)||!sdl.isNumber(strJsjwl)){
            flage = true;
        } else {
            student.setId(Integer.parseInt(strId));
            student.setName(strName);
            student.setCzxt(Integer.parseInt(strCzxt));
            student.setWjyl(Integer.parseInt(strWjyl));
            student.setJsjwl(Integer.parseInt(strJsjwl));
        }
        if(operate.equals("add")){
            if(flage){
                request.setAttribute("message", "请输入正确值,且不可空");
                request.getRequestDispatcher("Add.jsp").forward(request, response);
            } else {
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
        }
        if(operate.equals("modify")){
            if(flage){
                request.setAttribute("message", "请输入正确值,且不可空");
                request.getRequestDispatcher("Modify.jsp").forward(request, response);
            } else {
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
}
