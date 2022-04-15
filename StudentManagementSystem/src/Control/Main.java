package Control;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Operate operate = new Operate();
        ArrayList<Student> show = operate.show();
        System.out.println(show);
    }

}
