import java.util.*;

public class test {
//    public static Comparable max(Comparable o1, Comparable o2){
//        if(o1.compareTo(o2)>0)
//            return o1;
//        else
//            return o2;
//    }
    public static <E extends Comparable<E>>E max(E o1,E o2){
        if (o1.compareTo(o2)>0)
        return o1;
            else
        return o2;
    }

    public static void main(String[] args) {
        System.out.println(max("welcome", "123"));

//        ArrayList list=new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(5);
//        list.add(4);
////        list.remove(4);
////        Iterator it = list.iterator( );
////        while(it.hasNext( )) {
////            System.out.println(it.next());
////        }k
//        System.out.println(list);
//        Map map = new TreeMap( );
//        map.put("1", "Monday");
//        map.put("3", "Wendsday");
//        map.put("4"," Thursday");
//        map.put("2"," Tuesday");
//        Set keys = map.keySet( );
//        Iterator it = keys.iterator( );
//        while(it.hasNext( )) {
//            String key = (String)it.next( );
//            String value = (String)map.get(key);
//            System.out.println(key + " " + value);
//        }
//

//        Scanner in=new Scanner(System.in);
//        int[] a=new int[10];
//        try{
//            a[in.nextInt()]=10;
//            System.out.println("try");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("catch");
//        }
//        Scanner input=new Scanner(System.in);
//        String s="012345hello";
//        s="input.nextLine()";
//        System.out.println(s.charAt(6));
//        System.out.println((int)(Math.random()*100));
//        System.out.println(Character.toUpperCase('a'));
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        System.out.println(sums(98,a));

//        int[] number = new int[n];
//        int[] number = {1, 2, 3, 4, 5, 6, 8};
//        int[] b = number;
//        for (int i : b) {
//            if(n==i)
//                System.out.println("yes");
//            break;
//        }
//        for (int i = 0; i < n; i++) {
//            number[i] = 2*i+1;
//            System.out.println("number[" + i + "] = " + number[i]);
//        }
//        int sum=1;
//        for (int i = 1; i <= n; i++) {
//            sum*=i;
//        }
//        System.out.println("sum = " + sum);
//        int count = 0;
//        while (n > 0) {
//            count=count*10+n%10;
//            System.out.println(n%10);
//            n /= 10;
//        }
//        System.out.println("count = " + count);
//        while(true){
//            int i = 1;
//            do {
//                i = i + 5;
//            } while (i < 17);
//            System.out.println("i = " + i);
//            if (i == 21) {
//                break;
//            }
//        }
//        System.out.println("Hello World");
//        Scanner scan = new Scanner(System.in);
//        System.out.print("a = ");
//        int a =scan.nextInt();
//        int b = 0;
//        switch (a){
//            case 1:
//                b = 1;
//                break;
//            case 2:
//                b = 2;
//                break;
//            default:
//                b = 10;
//        }
//        
//        System.out.println("b = " + b);
//

//        if(a>5){
//            System.out.println("a = " + a);
//        }
//        else {
//            System.out.println("false");
//        }




//        double input = scan.nextDouble();
//        Math.abs()
//        System.out.println("args = " + Arrays.deepToString(args));
//        System.out.println("hello.main");
//        System.out.println("input = " + input);

        
//        while(scan.hasNextDouble()){
//            System.out.println(scan.nextDouble());
//        }
//        String num = scan.next();
//        System.out.println("num = " + num);
    }
}
