import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class NewHome_Icon {

    public static void main(String[] args) {
        // Set canvas size
        StdDraw.setCanvasSize(800, 600);

        // Draw background
        drawSky();
        drawSun();
        drawClouds();

        // Draw buildings
        drawBuilding(100, 100, 40, 200, Color.BLUE);
        drawBuilding(200, 100, 60, 150, Color.GREEN);
        drawBuilding(300, 100, 50, 180, Color.RED);
        drawBuilding(450, 100, 70, 220, Color.MAGENTA);

        // Draw a river
        drawRiver();

        // Draw a tree
        drawTree(600, 100, 20, 120, Color.DARK_GRAY, Color.GREEN);
    }

    private static void drawSky() {
        StdDraw.setPenColor(new Color(135, 206, 250)); // Light Sky Blue
        StdDraw.filledRectangle(400, 300, 400, 300);
    }

    private static void drawSun() {
        StdDraw.setPenColor(Color.YELLOW);
        StdDraw.filledCircle(700, 500, 50);
    }

    private static void drawClouds() {
        StdDraw.setPenColor(Color.WHITE);
        StdDraw.filledCircle(100, 500, 30);
        StdDraw.filledCircle(150, 530, 40);
        StdDraw.filledCircle(200, 500, 35);
    }

    private static void drawBuilding(double x, double y, double width, double height, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x, y + height / 2, width / 2, height / 2);
        // Draw windows on the building
        StdDraw.setPenColor(Color.YELLOW);
        for (double i = x - width / 4; i < x + width / 4; i += 20) {
            for (double j = y + height / 2 - 20; j > y; j -= 30) {
                StdDraw.filledRectangle(i, j, 8, 15);
            }
        }
    }

    private static void drawRiver() {
        StdDraw.setPenColor(new Color(30, 144, 255)); // Dodger Blue
        StdDraw.filledRectangle(400, 50, 400, 30);
    }

    private static void drawTree(double x, double y, double trunkWidth, double canopyHeight, Color trunkColor, Color canopyColor) {
        // Draw trunk
        StdDraw.setPenColor(trunkColor);
        StdDraw.filledRectangle(x, y, trunkWidth / 2, canopyHeight / 2);

        // Draw canopy
        StdDraw.setPenColor(canopyColor);
        StdDraw.filledCircle(x, y + canopyHeight / 2, canopyHeight / 2);
    }
}
