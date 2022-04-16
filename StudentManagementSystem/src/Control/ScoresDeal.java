package Control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ScoresDeal {
    ResultSet resultSet = null;
    public int getRowCount() throws SQLException {
        int rowcount = 0;
        DBManager db = new DBManager();
        String sql = "select * from user.score";
        resultSet = db.executeQuery(sql);
        while (resultSet.next()) rowcount = resultSet.getInt(1);
//        db.close();
        return rowcount;
    }
    public int getPageCount(int pagesize,int rowcount){
        int pagecount = 0;
        if(rowcount%pagesize==0){
            pagecount = rowcount/pagesize;
        }else{
            pagecount = rowcount/pagesize+1;
        }
        return pagecount;
    }
    public ArrayList<Student> showSelectResult(String selectsql) throws SQLException {
        ArrayList<Student> scoreal = new ArrayList<Student>();
        DBManager db = new DBManager();
        resultSet = db.executeQuery(selectsql);
        while (resultSet.next()){
            Student stu = new Student();
            stu.setId(resultSet.getInt("id"));
            stu.setName(resultSet.getString("name"));
            stu.setClassname(resultSet.getString("classname"));
            stu.setScore(resultSet.getInt("score"));
            scoreal.add(stu);
//            db.close();
        }
        return scoreal;
    }
}
