package Bean;

public class Box {
    int length, width, height;

    public Box() {
        length = 1;
        width = 1;
        height = 1;
    }

    public void setlength(int newlength) {
        length = newlength;
    }

    public void setwidth(int newwidth) {
        width = newwidth;
    }

    public void setheight(int newheight) {
        height = newheight;
    }

    public int getlength() {
        return length;
    }

    public int getwidth() {
        return width;
    }

    public int getheight() {
        return height;
    }
    public int BoxVolume(){
        int volume;
        volume=length*width*height;
        return volume;
    }
    public int BoxArea(){
        int area;
        area=2*(length*width+width*height+length*height);
        return area;
    }

}
