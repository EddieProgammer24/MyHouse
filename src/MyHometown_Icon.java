import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdDraw3D;

import java.awt.*;

public class MyHometown_Icon {
   public static void main(String[]args){
       //Set Canvas size and scale
       StdDraw.setCanvasSize(1500,800);
       StdDraw.setXscale(0,100);
       StdDraw.setYscale(0,100);


       // Draw clouds
       drawCloud(200, 500, 30);
       drawCloud(600, 400, 20);

       //Draw background
       drawBackground();


       //Draw lighthouse
       drawLightHouse(20,20,15);

       //Draw boats
       drawBoat(60,20,10, Color.red);
       drawBoat(70,30,8, Color.blue);
       drawBoat(80,40,12, Color.green);

       //Draw sun
       drawSun(90,90,8, Color.yellow);

       //Draw Airplane
       drawAirplane();

       //Draw waves
       drawWaves();

       // Simulate rain
       simulateRain(500, 300, 1, 200, 2, Color.BLACK);

       //Draw FisherMen
       drawFishermen();

       //Draw Fishing Boat
       drawBoats();


   }

    public static void drawBoats() {
        drawBoat(80, 15, 10, Color.orange);
        drawBoat(80, 10, 8, Color.green);
    }

    public static void drawFishermen() {
        drawFisherman(25, 59, Color.red);
        StdDraw.text(25,59,"A");
        drawFisherman(10, 59, Color.magenta);
        StdDraw.text(10,59,"B");
    }
    public static void drawFisherman(double x, double y, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(x, y, 2); // Head

        StdDraw.setPenColor(Color.black);
        // Body
        StdDraw.line(x, y - 2, x, y - 7);
        // Legs
        StdDraw.line(x, y - 7, x - 2, y - 9);
        StdDraw.line(x, y - 7, x + 2, y - 9);
        // Arms
        StdDraw.line(x, y - 2, x - 2, y - 5);
        StdDraw.line(x, y - 2, x + 2, y - 5);
    }
   public static void drawCloud(double x, double y, double size){
       StdDraw.setPenColor(Color.WHITE);
       StdDraw.filledCircle(x, y, size);
       StdDraw.filledCircle(x + size * 1.5, y, size * 1.2);
       StdDraw.filledCircle(x + size * 3, y, size);
   }
   public static void drawBackground(){
       StdDraw.setPenColor(new Color(135,206,250));//Light sky blue
       StdDraw.filledRectangle(50,50,50,50);
   }

    public static void drawLightHouse(double x,double y,double size){
       //Draw lighthouse tower
       StdDraw.setPenColor(Color.gray);
       StdDraw.filledRectangle(x,y,size,size*2);
       StdDraw.setPenColor(Color.black);
       StdDraw.square(x, 20,4);
       StdDraw.text(x,y,"Tower");

       //Draw lighthouse top
       StdDraw.setPenColor(Color.red);
       StdDraw.filledRectangle(x, y + size * 1.5, size * 1.5, size * 0.5);
       StdDraw.setPenColor(Color.black);

       //Draw lighthouse light
       StdDraw.setPenColor(Color.yellow);
       StdDraw.filledCircle(x, y + size * 1.5, size * 0.3);
   }

   public static void drawBoat(double x, double y,double size,Color color){
       //Draw boat body
       StdDraw.setPenColor(color);
       StdDraw.filledRectangle(x,y, size*2,size);

       //Draw a sailing boat
       StdDraw.setPenColor(Color.WHITE);

       StdDraw.filledPolygon(
               new double[]{x - size * 2, x, x + size * 2},
               new double[]{y, y + size * 2, y}
       );
       StdDraw.setPenColor(Color.black);
       StdDraw.square(x, 20,5);
       StdDraw.text(x,y,"Boat");
   }
    public static void drawSun(double x, double y, double radius, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(x, y, radius);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(90,90,"Sun");
    }

    public static void drawAirplane() {
        StdDraw.setPenColor(Color.gray);
        StdDraw.filledRectangle(80, 80, 10, 2);
        StdDraw.setPenColor(Color.red);
        StdDraw.text(80,80,"Airplane");
        StdDraw.filledPolygon(new double[]{80, 85, 85}, new double[]{82, 81, 83});
    }

    public static void simulateRain(double x, double startY, int numDrops, double length, double speed, Color color){
        StdDraw.setPenColor(color);
        for (int i = 0; i < numDrops; i++) {
            double dropX = x + Math.random() * 20 - 10;
            double dropY = startY - Math.random() * length;
            StdDraw.line(dropX, dropY, dropX, dropY - length);
        }

    }
    public static void drawWaves() {
        double y = 10;
        while (y < 20) {
            for (double x = 0; x < 100; x += 2) {
                StdDraw.setPenColor(new Color(0, 191, 255)); // Deep sky blue
                StdDraw.filledEllipse(x, y, 2, 1);

            }
            y += 0.5;
        }
    }
}
