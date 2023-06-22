package App;
import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessMatch;

public class Main {
    public static void main(String[] args) {

         ChessMatch cm = new ChessMatch();
         UI.printBoard(cm.getPieces());
    }
}

