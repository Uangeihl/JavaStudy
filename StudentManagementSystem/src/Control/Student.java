package Control;

public class Student {
    private int id;
    private String name;
    private String classname;
    private int score;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClassname() {
        return classname;
    }
    public void setClassname(String classname) {
        this.classname = classname;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classname='" + classname + '\'' +
                ", score=" + score +
                '}';
    }
}
