import java.util.Objects;

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
        if (canPosition(toLine, toColumn)) {
            return ((toLine != line) && (toColumn == column) && isHodLine(chessBoard, line, toLine, column, toColumn) && isHodColumn(chessBoard, line, toLine, column, toColumn))
                    || ((toLine == line) && (toColumn != column) && isHodColumn(chessBoard, line, toLine, column, toColumn) && isHodLine(chessBoard, line, toLine, column, toColumn));
        } else return false;
    }

    private boolean isHodColumn(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int c = 0;
        for (int i = 1; i < Math.abs(toColumn - column); i++) {
            if (toColumn > column) {
                c = column + 1;
            } else c = column - 1;
        }
        if (chessBoard.board[line][c] == null || chessBoard.board[toLine][toColumn] == null) {
            return true;
        } else
            return c == toColumn && toLine == line && (!Objects.equals(chessBoard.board[line][column].getColor(), chessBoard.board[toLine][toColumn].getColor()));
    }

    private boolean isHodLine(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int l = 0;
        for (int i = 1; i < Math.abs(toLine - line); i++) {
            if (toLine > line) {
                l = line + 1;
            } else l = line - 1;
        }
        if (chessBoard.board[l][column] == null || chessBoard.board[toLine][toColumn] == null) {
            return true;
        } else
            return l == toLine && toColumn == column && !Objects.equals(chessBoard.board[toLine][toColumn], chessBoard.board[line][column]);
    }


    @Override
    public String getSymbol() {
        return "R";
    }
}