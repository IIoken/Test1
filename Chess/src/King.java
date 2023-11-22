public class King extends ChessPiece {

    public King(String color) {
        super(color);
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        return false;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (toLine >= 0 && toLine <= 7 && toColumn >= 0 && toColumn <= 7) {
            boolean b = (toLine == line - 1) || (toLine == line) || (toLine == line + 1);
            if (
                       ((toColumn == column - 1) && b && isHodKing(chessBoard,line,column,toLine,toColumn))
                    || ((toColumn == column) && ((toLine == line -1) || (toLine == line + 1)) && isHodKing(chessBoard,line,column,toLine,toColumn))
                    || ((toColumn == column + 1) && b && isHodKing(chessBoard,line,column,toLine,toColumn))
                    && (!isUnderAttack(chessBoard, toLine, toColumn))
            ) {
                return true;
            } else return false;
        } else {
            return false;
        }

    }

    private boolean isHodKing(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((chessBoard.board[toLine][toColumn] == null) || (chessBoard.board[line][column].getColor() != chessBoard.board[toLine][toColumn].getColor())){
            return true;
        }return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }
}
