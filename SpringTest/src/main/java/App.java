import com.test.config.SpringConfig;
import com.test.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService) ctx.getBean("userService");
//        userService.print();
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ctx.registerShutdownHook();
//        UserService userService = (UserService) ctx.getBean("userService");
//        userService.print();
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        UserService userService = ctx.getBean(UserService.class);
//        userService.print();
        UserDao userDao = ctx.getBean(UserDao.class);
        userDao.print();
//        ctx.close();
    }
}
