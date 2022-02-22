import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class note {
    ArrayList<String> notes=new ArrayList<String>();

    public note(int a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    private int a;

    @Override
    public String toString() {
        return "note{" +
                "notes=" + notes +
                '}';
    }


    private String b;
    public void add(String a){
        notes.add(a);
    }
    public void add(int index,String a){
        notes.add(index,a);
    }
    public void remove(int index){
        notes.remove(index);
    }
    public int size(){
        return notes.size();
    }
//    public String toString(){
//        return notes.toString();
//    }
    public static void main(String[] args) {
        note notes=new note(1,"2");
        notes.add("9");
        notes.add("8");
        notes.add("7");
//        notes.add(0,"1");
        notes.remove(2);
        System.out.println(notes);

    }

}
