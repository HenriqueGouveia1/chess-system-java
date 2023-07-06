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

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    public void initialSetup() {
        placeNewPiece('a',1, new Rook(board, Color.BLACK));
    }
}
