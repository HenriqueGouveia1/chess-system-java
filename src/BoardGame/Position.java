package BoardGame;

public class Position {

    private  int column;
    private  int row;

    public Position(int row, int column){

        this.column = column;
        this.row= row;

    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return row + "," + column;
    }
}
