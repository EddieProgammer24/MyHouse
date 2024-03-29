import edu.princeton.cs.introcs.StdDraw;

public class MyHouse {
    public static void main(String[]args){
        //set the size of the window to 500 pixels by 500 pixels
        StdDraw.setCanvasSize(500,500);
        StdDraw.clear(StdDraw.BLUE);//draw a blue sky
        //Draw a green field
        StdDraw.setPenColor(0,170,0);
        StdDraw.filledRectangle(0.5,0.25,0.6,0.3);

        double[]x = {0.255,0.745,0.49};
        double[]y = {0.70,0.70,0.90};
        StdDraw.filledPolygon(x,y);
        StdDraw.setPenRadius(0.05);//thicken the pen for outline drawing
        StdDraw.rectangle(250/500.0,260/500.0,120/500.0,90/500.0);

        while (true){
            double cloudX = StdDraw.mouseX();
            double cloudY = StdDraw.mouseY();
            StdDraw.setPenColor(StdDraw.WHITE);
            if(cloudY > 0.55){
                StdDraw.filledCircle(cloudX,cloudY,0.005);
            }
            StdDraw.show(30);
        }
    }
}
