public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
//        if (line != toLine && column != toColumn) {
            if (toLine >= 0 && toLine <= 7 && toColumn >= 0 && toColumn <= 7) {
                if (((toLine != line) && (toColumn == column)) || ((toLine == line) && (toColumn != column))) {
                    return true;
                } else return false;
            } else return false;
//        } else return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
