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
            if (canPosition(toLine,toColumn)) {
                if (
                        ((toLine == line + 2) && line == 1) && (this.getColor() == "White") // шаг на 2 клетки
                                && chessBoard.board[line + 2][column] == null && chessBoard.board[line + 1][column] == null // проверяем что клетка пустая если мы ходим на 2 клетки
                                || ((toLine == line - 2) && line == 6) && (this.getColor() == "Black") // шаг на 2 клетки
                                && chessBoard.board[line - 2][column] == null && chessBoard.board[line - 1][column] == null // проверяем что клетка пустая если мы ходим на 2 клетки
                ) {
                    return true;
                } else if (((toLine == line + 1) && this.getColor() == "White") && chessBoard.board[line + 1][column] == null // шаг на 1 клетки, проверка что пустая
                        || ((toLine == line - 1) && this.getColor() == "Black") && chessBoard.board[line - 1][column] == null) { // // шаг на 1 клетки, проверка что пустая
                    return true;
                } else return false;
            } else if (toLine >= 0 && line <= 7 && // шаг на клетку проверка на атаку
                    ((
                            (toLine == line + 1) && (this.getColor() == "White") // ход вперёд белыми
                                    && (chessBoard.board[line + 1][column + 1].getColor() != "White" // проверка права
                                    || chessBoard.board[line + 1][column - 1].getColor() != "White") // проверка лево
                    ) || (
                            (toLine == line - 1) && (this.getColor() == "Black") // ход вперёд чёрными
                                    && (chessBoard.board[line - 1][column + 1].getColor() != "Black"  // проверка права
                                    || chessBoard.board[line - 1][column - 1].getColor() != "Black") // проверка лева
                    ))) {
                return true;
            }
        } else return false;
        return false;
    }


    @Override
    public String getSymbol() {
        return "P";
    }
}
