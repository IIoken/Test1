public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

            if (canPosition(toLine,toColumn)) {
                if (
                        (((toLine - line) == (toColumn - column) && isHodQueen(chessBoard,line,column,toLine,toColumn)) || ((toLine - line) == -1 * (toColumn - column) && isHodQueen(chessBoard,line,column,toLine,toColumn) ))
                        && (line != toLine && column != toColumn && isHodQueen(chessBoard,line,column,toLine,toColumn)) || (((toLine != line) && (toColumn == column) && isHodQueen(chessBoard,line,column,toLine,toColumn))
                                || ((toLine == line) && (toColumn != column) && isHodQueen(chessBoard,line,column,toLine,toColumn))))
                {
                    return true;
                } else return false;
            } else return false;

    }

    private boolean isHodQueen(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((chessBoard.board[toLine][toColumn] == null) || (chessBoard.board[line][column].getColor() != chessBoard.board[toLine][toColumn].getColor())){
            return true;
        }return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
