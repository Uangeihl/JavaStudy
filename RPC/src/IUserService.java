import java.sql.SQLException;

public interface IUserService {
    User findUserById(int id) throws Exception;
}
