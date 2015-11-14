
import java.util.TreeMap;

public class CSEngine {
    private static final int UP     = 0;
    private static final int LEFT   = 1;
    private static final int DOWN   = 2;
    private static final int RIGHT  = 3;

    private static final int[] xBounds  = new int[]{0, 1000};
    private static final int[] yBounds  = new int[]{0, 500};

    private static final int impulse = 5;

    private RedBlackBST<Integer, Actor> actors;
    private CSMailroom mailroom;
    private GameScreen screen;

    public void update(Actor a, int id) {
        switch(id) {
            case UP:    break;
            case LEFT:  break;
            case DOWN:  break;
            case RIGHT: break;
            default:    break;
        }
    }

    public Iterable<Actor> getActors() {
        return actors;
    }   

    public void setCSMailroom(CSMailroom mailroom) {
        this.mailroom = mailroom;
    }

    public void run() {
        for (Actor a : actors) {
            a.update();
        }
    }

    //**************** Move actor calls

    // give Actor a an up impulse
    private void moveUp(Actor a) {
        double currVY = a.getVY();
        currVY += impulse;
        a.setVY(currVY);
    }

    // give Actor a a down impulse
    private void moveDown(Actor a) {
        double currVY = a.getVY();
        currVY -= impulse;
        a.setVY(currVY);
    }

    // give Actor a a left impulse
    private void moveLeft(Actor a) {
        double currVX = a.getVX();
        currVX -= impulse;
        a.setVX(currVX);
    }

    // give Actor a a right impulse
    private void moveRight(Actor a) {
        double currVX = a.getVX();
        currVX += impulse;
        a.setVX(currVX);
    }

    //**************** Actor give/kill calls
    public void giveActor(Actor a) {
        actors.put(a);
        screen.setActors(actors);
    }

    public void killActor(Actor a) {

    }
}
