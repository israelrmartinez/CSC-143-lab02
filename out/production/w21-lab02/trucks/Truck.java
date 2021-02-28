package trucks;

import java.awt.Color;
import java.awt.Graphics;

public class Truck {

    protected  Color    color;
    protected  Graphics pen;
    protected  int      size;
    protected  int      startX;
    protected  int      startY;

    //TODO: Update Class, you are expected to figure this out!
    public Truck(Graphics pen, Color color) {
        this.pen = pen;
        this.color = color;
        System.out.println("Truck");
    }

    protected void drawWheel(int outerX, int outerY, int innerX, int innerY, int length){
        pen.setColor(Color.BLACK);
        pen.fillOval(outerX, outerY, length, length);
        pen.setColor(Color.LIGHT_GRAY);
        pen.fillOval(innerX, innerY, length / 2, length / 2);

    }

    protected void drawWindow(int x, int y, int width, int height){
        pen.setColor(Color.LIGHT_GRAY);
        pen.fillRect(x, y, width, height);
    }

    public void move(int dx, int dy) {
        setLocation(dx, dy);
    }

    public void setLocation(int x, int y) {
        startX = x;
        startY = y;
    }

    public int setSize(int size) {
        this.size = size;
        return this.size;
    }
}
