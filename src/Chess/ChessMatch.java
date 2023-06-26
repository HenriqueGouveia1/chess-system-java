package Chess;

import BoardGame.Board;
import BoardGame.Position;
import Chess.Pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
    }
     public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumn()];
        for (int i=0 ;i<mat.length;++i){
            for (int j=0 ;j<mat[i].length;++j){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
     }
        return mat;
}

    public void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
    }
}
