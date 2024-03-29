import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class Nairobi {

    public static void main(String[] args) {
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);

        drawBackground();
        drawSun();
        drawRiver();
        drawBuildings();
        drawTrees();
    }

    public static void drawBackground() {
        StdDraw.setPenColor(new Color(135, 206, 250)); // Light sky blue
        StdDraw.filledRectangle(50, 50, 50, 50);
    }

    public static void drawSun() {
        StdDraw.setPenColor(Color.yellow);
        StdDraw.filledCircle(80, 80, 10);
    }

    public static void drawRiver() {
        StdDraw.setPenColor(new Color(0, 191, 255)); // Deep sky blue
        StdDraw.filledRectangle(50, 10, 80, 5);
    }

    public static void drawBuildings() {
        drawBuilding(20, 20, 15, 40, Color.gray);
        drawBuilding(50, 20, 15, 30, Color.blue);
        drawBuilding(80, 20, 15, 50, Color.green);
    }

    public static void drawBuilding(double x, double y, double width, double height, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x, y, width / 2, height / 2);
    }

    public static void drawTrees() {
        drawTree(10, 20, 5, 15, Color.green);
        drawTree(30, 20, 5, 15, Color.green);
        drawTree(90, 20, 5, 15, Color.green);
    }

    public static void drawTree(double x, double y, double trunkWidth, double canopyRadius, Color trunkColor) {
        StdDraw.setPenColor(trunkColor);
        StdDraw.filledRectangle(x, y, trunkWidth / 2, y / 2);

        StdDraw.setPenColor(Color.green);
        StdDraw.filledCircle(x, y + y / 2, canopyRadius);
    }
}
