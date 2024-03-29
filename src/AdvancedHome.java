import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class AdvancedHome {

    public static void main(String[] args) {
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);

        drawSky();
        drawMountains();
        drawSun(80, 80, 15, Color.yellow);
        drawLake(50, 15, 60, Color.blue);
        drawBridge(50, 15, 30, 5, Color.gray);
        drawTrees();
    }

    public static void drawSky() {
        StdDraw.setPenColor(new Color(135, 206, 250)); // Light sky blue
        StdDraw.filledRectangle(50, 50, 50, 50);
    }

    public static void drawMountains() {
        StdDraw.setPenColor(new Color(139, 69, 19)); // Brown
        StdDraw.filledPolygon(new double[]{0, 30, 60, 100}, new double[]{15, 40, 15, 15});
    }

    public static void drawSun(double x, double y, double radius, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(x, y, radius);
    }

    public static void drawLake(double x, double y, double length, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x, y, length / 2, 5);
    }

    public static void drawBridge(double x, double y, double length, double width, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x, y, length / 2, width / 2);
    }

    public static void drawTrees() {
        drawTree(10, 20, 8, 20, Color.green);
        drawTree(30, 20, 10, 25, Color.green);
        drawTree(70, 20, 12, 30, Color.green);
        drawTree(90, 20, 8, 20, Color.green);
    }

    public static void drawTree(double x, double y, double trunkWidth, double canopyRadius, Color trunkColor) {
        StdDraw.setPenColor(trunkColor);
        StdDraw.filledRectangle(x, y, trunkWidth / 2, y / 2);

        StdDraw.setPenColor(Color.green);
        StdDraw.filledCircle(x, y + y / 2, canopyRadius);
    }
}
