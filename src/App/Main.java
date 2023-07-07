package App;
import java.util.Scanner;

import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Main {
    public static void main(String[] args) {

         ChessMatch cm = new ChessMatch();
         Scanner sc = new Scanner(System.in);         

         while (true) {
            UI.printBoard(cm.getPieces());
            
            System.out.println();
            System.out.println("Source:");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.println("target:");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = cm.performChessMove(source, target);
            
         }
         
         
    }
}

