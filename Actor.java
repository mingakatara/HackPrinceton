
public class Actor {
    private double x; // x coord of this actor on the screen
    private double y; // y coord of this actor on the screen
    private String imgName; // image associated with this actor

    // empty constructor
    public Actor() {
        this.x = 0;
        this.y = 0;
        this.imgName = null;
    }

    // full constructor
    public Actor(double x, double y, String imgName) {
        this.x = x;
        this.y = y;
        this.imgName = imgName;
    }

    // returns the x location of this Actor
    public double getX() {
        return x;
    }

    // returns the y location of this Actor
    public double getY() {

    }

    public void draw() {
        StdDraw.image(x, y, imgName);
    }
}