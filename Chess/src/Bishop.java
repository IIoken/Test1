import java.util.Objects;

public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line != toLine && column != toColumn) {
            if (canPosition(toLine,toColumn)) {
//                Движение по горизонтали в верх
                return (toLine - line) == (toColumn - column) && isHodBishop(chessBoard, line, column, toLine, toColumn)
//                        в низ
                        || (toLine - line) == -1 * (toColumn - column) && isHodBishop(chessBoard, line, column, toLine, toColumn);
            } else return false;
        } else return false;
    }

    private boolean isHodBishop(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
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
            if (chessBoard.board[l][c] == null) { // Проверка что клетка пуста
                return true;
            } else return l == toLine && c == toColumn && !Objects.equals(chessBoard.board[toLine][toColumn].getColor(), chessBoard.board[line][column].getColor());
        }

    @Override
    public String getSymbol() {
        return "B";
    }

}
