import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class Ocean {

    public static void main(String[] args) {
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);

        drawOcean();
        drawShips();
        drawBoats();
        drawFishermen();
    }

    public static void drawOcean() {
        StdDraw.setPenColor(new Color(0, 119, 190)); // Deep blue
        StdDraw.filledRectangle(50, 50, 50, 50);
    }

    public static void drawShips() {
        drawShip(20, 25, 15, 30, Color.gray);
        drawShip(60, 30, 20, 40, Color.blue);
    }

    public static void drawShip(double x, double y, double width, double height, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x, y, width / 2, height / 2);
        StdDraw.setPenColor(new Color(139, 69, 19)); // Brown
        StdDraw.filledRectangle(x, y + height / 2 + 5, width / 2, 5); // Ship's deck
    }

    public static void drawBoats() {
        drawBoat(30, 15, 10, Color.orange);
        drawBoat(80, 10, 8, Color.green);
    }

    public static void drawBoat(double x, double y, double radius, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(x, y, radius);
        StdDraw.setPenColor(new Color(139, 69, 19)); // Brown
        StdDraw.filledRectangle(x, y - radius - 3, radius, 3); // Boat's base
    }

    public static void drawFishermen() {
        drawFisherman(25, 15, Color.red);
        drawFisherman(70, 10, Color.magenta);
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
}

