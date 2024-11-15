package oops_interface;

public class GameRunner {
    public static void main(String[] args) {
        MarioGame game = new MarioGame();
        game.up();
        game.down();
        game.left();
        game.right();

        ChessGame chessGame = new ChessGame();
        chessGame.up();
        chessGame.down();
        chessGame.left();
        chessGame.right();

        GamingConsole game2 = new MarioGame();
        game2.up();
        game2.down();

        GamingConsole game3 = new ChessGame();
        game3.up();
        game3.down();
        
    }
}
