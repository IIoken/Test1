public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine != line) {
            if (toLine >= 0 && line <= 7 && toColumn == column) {
                if (((toLine == line + 2) && line == 1) && (this.getColor() == "White") || ((toLine == line - 2) && line == 6) && (this.getColor() == "Black")) {
                    return true;
                } else if (((toLine == line + 1) && this.getColor() == "White") || ((toLine == line - 1) && this.getColor() == "Black")) {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
