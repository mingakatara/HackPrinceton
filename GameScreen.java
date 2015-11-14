// Dependancies: StdDraw.java

public class GameScreen {

    public static void main(String[] args) {

        // Engine engine = new Engine();

        StdDraw.setCanvasSize(1000,600);
        StdDraw.setXscale(-100, 100);
        StdDraw.setYscale(-100, 100);

        while (true) {
        //     for (Actor a : engine.getActors()) {
        //        StdDraw.picture(a.getX(), a.getY(), a.setImgName());
        //     }
        StdDraw.show(10);
        }
    }
}