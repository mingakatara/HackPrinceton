// Dependancies: StdDraw.java

public class GameScreen {

    private CSEngine engine;
    private RedBlackBST<Integer, Actor> iterable;
    private double mouseX;
    private double mouseY;

    public GameScreen() {}

    public void setEngine(Engine e) {
        this.engine = e;
    }

    public void setActors(RedBlackBST x) {
        this.iterable = x;
    }

    public void run() {

        Player player = new Player();

        StdDraw.setCanvasSize(1000,500);
        StdDraw.setXscale(0, 1000);
        StdDraw.setYscale(0, 500);

        while (true) {
            for (Actor a : iterable) {
                StdDraw.picture(a.getX(), a.getY(), a.setImgName());
            }

            if (StdDraw.hasNextKeyTyped()) {
                char next = StdDraw.nextKeyTyped();
                switch (next) {
                case 'w': engine.update(player, 0);
                case 'a': engine.update(player, 1);
                case 's': engine.update(player, 2);
                case 'd': engine.update(player, 3);
                }
            }
            if (StdDraw.mousePressed()) {
                mouseX = StdDraw.mouseX();
                mouseY = StdDraw.mouseY();
            }
            StdDraw.show(10);
        }
    }
}