import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class NairobiCityscape {

    public static void main(String[] args) {
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);

        drawSky();
        drawSun();
        drawRiver();
        drawBuildings();
        drawTrees();
        drawBuses();
        drawCars();
        drawBicycles();
        drawAirplane();
    }

    public static void drawSky() {
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
        drawBuilding(50, 20, 20, 50, Color.blue);
        drawBuilding(80, 20, 15, 30, Color.green);
    }

    public static void drawBuilding(double x, double y, double width, double height, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x, y, width / 2, height / 2);
    }

    public static void drawTrees() {
        drawTree(10, 20, 5, 15, Color.green);
        drawTree(30, 20, 8, 20, Color.green);
        drawTree(70, 20, 5, 15, Color.green);
        drawTree(90, 20, 8, 20, Color.green);
    }

    public static void drawTree(double x, double y, double trunkWidth, double canopyRadius, Color trunkColor) {
        StdDraw.setPenColor(trunkColor);
        StdDraw.filledRectangle(x, y, trunkWidth / 2, y / 2);

        StdDraw.setPenColor(Color.green);
        StdDraw.filledCircle(x, y + y / 2, canopyRadius);
    }

    public static void drawBuses() {
        drawBus(35, 10, Color.orange);
        drawBus(75, 10, Color.red);
    }

    public static void drawBus(double x, double y, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x, y, 8, 4);
        StdDraw.setPenColor(Color.black);
        StdDraw.rectangle(x, y, 8, 4);
        StdDraw.text(x, y, "BUS");
    }

    public static void drawCars() {
        drawCar(45, 15, Color.yellow);
        drawCar(60, 15, Color.blue);
    }

    public static void drawCar(double x, double y, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x, y, 4, 2);
        StdDraw.setPenColor(Color.black);
        StdDraw.rectangle(x, y, 4, 2);
        StdDraw.text(x, y, "CAR");
    }

    public static void drawBicycles() {
        drawBicycle(25, 10, Color.green);
        drawBicycle(65, 10, Color.cyan);
    }

    public static void drawBicycle(double x, double y, Color color) {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x, y, 2, 1);
        StdDraw.setPenColor(Color.black);
        StdDraw.rectangle(x, y, 2, 1);
        StdDraw.text(x, y, "BIKE");
    }

    public static void drawAirplane() {
        StdDraw.setPenColor(Color.gray);
        StdDraw.filledRectangle(80, 80, 10, 2);
        StdDraw.setPenColor(Color.red);
        StdDraw.filledPolygon(new double[]{80, 85, 85}, new double[]{82, 81, 83});
    }
}
