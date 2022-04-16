package Control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Operate {
    public ArrayList<Student> show() throws SQLException {
        DBManager db = new DBManager();
        ResultSet resultSet = null;
        String sql = "select * from user.score limit 5,10";
        resultSet = db.executeQuery(sql);
        ArrayList<Student> al = new ArrayList<Student>();
        while (resultSet.next()){
            Student stu = new Student();
            stu.setId(resultSet.getInt("id"));
            stu.setName(resultSet.getString("name"));
            stu.setClassname(resultSet.getString("classname"));
            stu.setScore(resultSet.getInt("score"));
            al.add(stu);
        }
        db.close();
        return al;
    }
    public void add(){

    }
    public boolean delete() throws SQLException {
        boolean result = false;
        DBManager db = new DBManager();
        ResultSet resultSet = null;
        String sql = "select * from user.score";
        if(db.executeUpdate(sql)>=1) result=true;
        return result;
    }
    public void modify(){

    }
}
