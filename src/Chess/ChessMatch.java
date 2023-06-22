package Chess;

import BoardGame.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
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
}
