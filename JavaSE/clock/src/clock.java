public class clock {
    public static void main(String[] args) {
        display hour =new display();
        display minute =new display();
        hour.setlimit(24);
        minute.setlimit(60);
        while(true){
            minute.increase();
            if(minute.getvalue()==0)
                hour.increase();
            System.out.printf("%02d:%02d\n",hour.getvalue(),minute.getvalue());
        }
    }
}



