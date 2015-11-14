public class CSGame {

    public static void main(String[] args) {

        CSMailroom mail = new CSMailroom();
        CSEngine engine = new CSEngine();
        GameScreen game = new GameScreen();

        game.setEngine(engine);
        engine.setCSEngine(mail);
        engine.setGameScreen(game);
        mail.setEngine(engine);

        game.init();
        engine.init()

        while (true) {
            engine.run();
            game.run();
        }
    }
}