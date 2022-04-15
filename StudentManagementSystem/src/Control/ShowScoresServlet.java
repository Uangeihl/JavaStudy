package Control;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShowScoresServlet extends HttpServlet {
    private int pageNow=1;
    private int rowCount=0;
    private int pageSize=5;
    private int pageCount=0;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ScoresDeal sdl = new ScoresDeal();
        try {
            rowCount = sdl.getRowCount();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        pageCount = sdl.getPageCount(pageSize,rowCount);

        String sql = "";
        pageNow = Integer.parseInt(request.getParameter("pageNow"));
        if(pageNow>1){
            sql = "select top" + pageSize +" * form user.score where id not in(select top" + pageSize*(pageNow-1) +"id form user.score";
        }else{
            sql = "select top" + pageSize +" * form user.score";
        }
        ArrayList<Student> al = null;
        try {
            al = sdl.showSelectResult(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.setAttribute("selresult",al);
        request.setAttribute("pageNow",pageNow+"");
        request.setAttribute("rowCount",rowCount+"");
        request.setAttribute("pageCount",pageCount+"");
        request.getRequestDispatcher("showselect.jsp").forward(request,response);
    }
}
