import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    private static boolean running = true;
    private static HashMap<String,Class> registerTable = new HashMap<>();
    static{
        registerTable.put(IUserService.class.getName(),IUserServiceImpl.class);//key类型是接口，value是具体实现类才能完成调用
        registerTable.put(IProductService.class.getName(), IProductServiceImpl.class);
    }
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8088);
//        System.out.println("Server Running");
        while(running){
            Socket client = server.accept();
            process(client);
            client.close();
        }

        server.close();
    }
    public static void process(Socket socket) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

        String clazzName = ois.readUTF();
        String methodName = ois.readUTF();
        Class[] parameterTypes = (Class[]) ois.readObject();
        Object[] parameters = (Object[]) ois.readObject();

        //IUserService service = new IUserServiceImpl();
        Object service = registerTable.get(clazzName).newInstance();
        Method method = service.getClass().getMethod(methodName, parameterTypes);
        Object o = method.invoke(service, parameters);
        oos.writeObject(o);
        oos.flush();
    }
}
