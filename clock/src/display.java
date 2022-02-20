public class display {
    private int value=0;
    private int limit=0;
    public void setvalue(int value){
        this.value=value;
    }
    public void setlimit(int limit){
        this.limit=limit;
    }
    public int getvalue(){
        return value;
    }
    public void increase(){
        value++;
//        try {
//            //睡眠1s
//            Thread.currentThread().sleep(10);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        if(value==limit){
            setvalue(0);
        }
    }
    void run(){
        for(;;) {
            increase();
            System.out.println(value);
        }
    }
}
