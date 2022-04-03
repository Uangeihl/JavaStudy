public class Client {
    public static void main(String[] args) throws Exception {
//        System.out.println(new IUserServiceImpl().findUserById(1));
        IUserService service = (IUserService) Stub.getStub(IUserService.class);
        IProductService service2 = (IProductService) Stub.getStub(IProductService.class);
        System.out.println(service.findUserById(1));
        System.out.println(service2.findProductByName("Cat"));
    }
}
