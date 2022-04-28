import dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.print();
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ctx.registerShutdownHook();
//        UserService userService = (UserService) ctx.getBean("userService");
//        userService.print();
//        UserDao userDao = (UserDao) ctx.getBean("userDao");
//        userDao.print();
//        ctx.close();
    }
}
