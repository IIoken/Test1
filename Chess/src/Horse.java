public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // начальная позиция ровна конечной
        if (line != toLine && column != toColumn) {
            //проверил что бы не выходило за доску
            if (toLine >= 0 && toColumn <= 7 && toColumn >= 0 && toLine <= 7) {
                //Расписал как ходит конь, буковй "Г"
                if (toLine == (line - 2) && toColumn == (column + 1)) return true;
                else if (toLine == (line - 2) && toColumn == (column - 1)) return true;
                else if (toLine == (line + 2) && toColumn == (column + 1)) return true;
                else if (toLine == (line + 2) && toColumn == (column - 1)) return true;
                else if (toLine == (line - 1) && toColumn == (column + 2)) return true;
                else if (toLine == (line - 1) && toColumn == (column - 2)) return true;
                else if (toLine == (line + 1) && toColumn == (column + 2)) return true;
                else if (toLine == (line + 1) && toColumn == (column - 2)) return true;
                else return false;
            }else return false;
        }else return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
