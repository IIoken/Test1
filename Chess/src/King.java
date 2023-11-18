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
//        if (line != toLine && column != toColumn) {
        if (toLine >= 0 && toLine <= 7 && toColumn >= 0 && toColumn <= 7) {
            boolean b = (toLine == line - 1) || (toLine == line) || (toLine == line + 1);
            if (
                       ((toColumn == column - 1) && b)
                    || ((toColumn == column + 1) && b)
                    || ((toColumn == column) && ((toLine == line -1) || (toLine == line + 1)))
                    && (!isUnderAttack(chessBoard, toLine, toColumn))
            ) {
                return true;
            } else return false;
        } else {
            return false;
        }
//        } else return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }
}
