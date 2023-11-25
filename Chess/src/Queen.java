import java.util.Objects;

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
                return (((toLine - line) == (toColumn - column) && isHodQueen(chessBoard, line, column, toLine, toColumn))
                        || ((toLine - line) == -1 * (toColumn - column) && isHodQueen(chessBoard, line, column, toLine, toColumn)))
                        && (line != toLine && column != toColumn && isHodQueen(chessBoard, line, column, toLine, toColumn))
                        || (((toLine != line) && (toColumn == column) && isHodQueen(chessBoard, line, column, toLine, toColumn))
                        || ((toLine == line) && (toColumn != column) && isHodQueen(chessBoard, line, column, toLine, toColumn)));
            } else return false;
    }

    private boolean isHodQueen(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int l = 0;
        int c = 0;
        for (int i = 1; i < Math.abs(toLine - line); i++) {
            if (toLine > line) {
                l = line + 1;  // Движение в ввехр
                if (toColumn > column) {
                    c = column + 1;
                } else c = column - 1;
            } else {
                l = line - 1; // Движение в низ
                if (toColumn > column) {
                    c = column + 1;
                } else c = column - 1;
            }}
        for (int i = 1; i < Math.abs(toLine - line); i++) {
            if (toLine > line) {
                l = line + 1;
            } else l = line - 1;
        }
        for (int i = 1; i < Math.abs(toColumn - column); i++) {
            if (toColumn > column) {
                c = column + 1;
            } else c = column - 1;
        }
        if (chessBoard.board[l][c] == null) { // Проверка что клетка пуста
            return true;
        } else return l == toLine && c == toColumn && !Objects.equals(chessBoard.board[toLine][toColumn].getColor(), chessBoard.board[line][column].getColor());
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
