package Bean;

public class Counter {
    private int count;

    public Counter(){
        count=0;
    }

    public int getCount() {
        count++;
        return count;}

    public void setCount(int count) {
        this.count = count;}
}