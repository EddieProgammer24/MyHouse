import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class MyHome {

    public static void main(String[] args) {
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);

        drawBackground();
        drawLighthouse(20, 20, 15);
        drawBoat(60, 20, 10, Color.red);
        drawBoat(70, 30, 8, Color.blue);
        drawBoat(80, 40, 12, Color.green);
        drawSun(80, 80, 10, Color.yellow);
        drawWaves();
    }

    public static void drawBackground() {
        StdDraw.setPenColor(new Color(135, 206, 250)); // Light sky blue
        StdDraw.filledRectangle(50, 50, 50, 50);
    }

    public static void drawLighthouse(double x, double y, double size) {
        StdDraw.setPenColor(Color.gray);
        StdDraw.filledRectangle(x, y, size, size * 2);

        StdDraw.setPenColor(Color.red);
        StdDraw.filledRectangle(x, y + size * 1.5, size * 1.5, size * 0.5);

        StdDraw.setPenColor(Color.yellow);
        StdDraw.filledCircle(x, y + size * 1.5, size * 0.3);
    }

    public static void drawBoat(double x, double y, double size, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x, y, size * 2, size);

        StdDraw.setPenColor(Color.white);
        // Draw boat sail with multiple filledPolygons
        StdDraw.filledPolygon(new double[]{x - size * 2, x, x + size * 2},
                new double[]{y, y + size * 2, y});
        StdDraw.filledPolygon(new double[]{x - size * 2, x, x + size * 2},
                new double[]{y, y + size, y});
    }

    public static void drawSun(double x, double y, double radius, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(x, y, radius);
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
