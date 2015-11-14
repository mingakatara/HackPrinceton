// Dependancies: StdDraw.java

import java.util.Stack;

public class GameScreen {

    private CSEngine engine;
    private Stack<Actor> iterable;
    private double mouseX;
    private double mouseY;

    public GameScreen() {}

    public void setEngine(CSEngine e) {
        this.engine = e;
    }

    public void setActors(Stack<Actor> x) {
        this.iterable = x;
    }

    public void init() {
        Player player = new Player();

        StdDraw.setCanvasSize(1000,500);
        StdDraw.setXscale(0, 1000);
        StdDraw.setYscale(0, 500);

        StdDraw.rectangle(500.0, 250.0, 250.0, 125.0);
    }

    public void run() {

        Double xshift = 500.0 - player.getX();
        Double yshift = 200.0 - player.getY();

        for (Actor a : iterable) {
            if (s instanceof Player) {
                StdDraw.picture(500, 200, a.getImgName());
            }
            else {
                StdDraw.picture((a.getX() + xshift), (a.getY() + yshift), a.getImgName());
            }
        }
        
        if (StdDraw.hasNextKeyTyped()) {
            char next = StdDraw.nextKeyTyped();
            switch (next) {
                case 'w': engine.event(player, 0);
                case 'a': engine.event(player, 1);
                case 's': engine.event(player, 2);
                case 'd': engine.event(player, 3);
                }
            }
        if (StdDraw.mousePressed()) {
            mouseX = StdDraw.mouseX();
            mouseY = StdDraw.mouseY();
            engine.event(player, 4, mouseX, mouseY);
        }
        StdDraw.show(10);
    }
}