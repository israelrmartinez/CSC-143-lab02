package trucks;

import exercise.Display;
import java.awt.Color;
import java.awt.Graphics;

public class MainProgram {

    public static void testBoxedTruck(Display display, Truck truck) throws Exception{
        // Pause for a bit
        display.pause(200);

        // TODO : draw truck at specific location

        // TODO : move truck to a different location and draw

        // TODO : resize Truck at specific location

        // Pause for a bit
        display.pause(200);
    }

    public static void testFlatBedTruck(Display display, Truck truck) throws Exception{

        // Pause for a bit
        display.pause(200);

        // TODO : draw truck at specific location

        // TODO : move truck to a different location and draw

        // TODO : resize Truck at specific location

        // Pause for a bit
        display.pause(200);
    }

    public static void main(String[] args) throws Exception {

        Display display = new Display(600, 500);
        display.setBackground(Color.GRAY);

        // Get Graphics Pen Object for Drawing in Window
        Graphics pen = display.getGraphics();

        // TODO : Create a Boxed Truck for display

        // clear graphics (if you want to)
        // display.clear();

        // TODO : with same reference, to create a FlatBed Truck for display

    }
}
