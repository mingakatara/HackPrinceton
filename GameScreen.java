// Dependancies: StdDraw.java

public class GameScreen {

    public static void main(String[] args) {

        // Client Reader

        StdDraw.setCanvasSize(1000,600);
        StdDraw.setXscale(-100, 100);
        StdDraw.setYscale(-100, 100);

        while (true) {
        //     for (Actor a : engine.getActors()) {
        //        StdDraw.picture(a.getX(), a.getY(), a.setImgName());
        //     }
        char next = StdDraw.nextKeyTyped();

        switch (next) {
            case 'w': player.setVY(player.getVY += 1);
            case 'a': player.setVX(player.getVX -= 1);
            case 's': player.setVY(player.getVY -= 1);
            case 'd': player.setVX(player.getVX += 1);
        }
        StdDraw.show(10);
        }
    }
}