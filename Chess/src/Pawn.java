import java.util.Objects;

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
                // // шаг на 1 клетки, проверка что пустая
                if (
                        ((toLine == line + 2) && line == 1) && (Objects.equals(this.getColor(), "White")) // шаг на 2 клетки
                                && chessBoard.board[line + 2][column] == null && chessBoard.board[line + 1][column] == null // проверяем что клетка пустая если мы ходим на 2 клетки
                                || ((toLine == line - 2) && line == 6) && (Objects.equals(this.getColor(), "Black")) // шаг на 2 клетки
                                && chessBoard.board[line - 2][column] == null && chessBoard.board[line - 1][column] == null // проверяем что клетка пустая если мы ходим на 2 клетки
                ) {
                    return true;
                } else return ((toLine == line + 1) && Objects.equals(this.getColor(), "White")) && chessBoard.board[line + 1][column] == null // шаг на 1 клетки, проверка что пустая
                        || ((toLine == line - 1) && Objects.equals(this.getColor(), "Black")) && chessBoard.board[line - 1][column] == null;
            } else return toLine >= 0 && line <= 7 && // шаг на клетку проверка на атаку
                    ((
                            (toLine == line + 1) && (Objects.equals(this.getColor(), "White")) // ход вперёд белыми
                                    && (!Objects.equals(chessBoard.board[line + 1][column + 1].getColor(), "White") // проверка права
                                    || !Objects.equals(chessBoard.board[line + 1][column - 1].getColor(), "White")) // проверка лево
                    ) || (
                            (toLine == line - 1) && (Objects.equals(this.getColor(), "Black")) // ход вперёд чёрными
                                    && (!chessBoard.board[line - 1][column + 1].getColor().equals("Black")  // проверка права
                                    || !chessBoard.board[line - 1][column - 1].getColor().equals("Black")) // проверка лева
                    ));
        } else return false;
    }


    @Override
    public String getSymbol() {
        return "P";
    }
}
