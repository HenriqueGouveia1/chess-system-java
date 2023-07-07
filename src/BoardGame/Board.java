package BoardGame;

public class Board {

    private int rows;
    private int columns;

    private Piece[][] pieces;

    public Board(int row, int column) {
        if (row < 1 || column <1) {
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = row;
        this.columns = column;
        pieces = new Piece[row][column];
    }

    public int getRow() {
        return rows;
    }
   

    public int getColumn() {
        return columns;
    }
   

    public Piece piece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position){
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is already a piece in here: "+ position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public Piece removePiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Position not exists");
        }
        if (!thereIsAPiece(position)) {
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getColumn()][position.getRow()] = null;
        return aux;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean positionExists(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return piece(position) != null;
    }
}
