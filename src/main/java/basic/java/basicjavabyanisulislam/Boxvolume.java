package basic.java.basicjavabyanisulislam;

public class Boxvolume {
    double width, height, depth;
    Boxvolume(int width, int height,int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    void displayVol() {
        double vol = width*height*depth;
        System.out.println("volume is: "+vol);
    }
}
