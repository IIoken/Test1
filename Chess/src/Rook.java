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
        if (toLine >= 0 && toLine <= 7 && toColumn >= 0 && toColumn <= 7) {
            if (((toLine != line) && (toColumn == column) && isHodLine(chessBoard, line, toLine, column, toColumn))
                    || ((toLine == line) && (toColumn != column) && isHodColumn(chessBoard, line, toLine, column, toColumn))) {
                return true;
            } else return false;
        } else return false;
    }

    private boolean isHodLine(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int l = 0;

        for (int i = 1; i < Math.abs(toLine - line); i++) {
            if (toLine > line) {
                l = line + 1;
            } else l = line - 1;
        }
        if (chessBoard.board[l][column] == null) {
            return true;
        } else {
            if (l == toLine && (chessBoard.board[line][column].getColor() != chessBoard.board[toLine][toColumn].getColor())) {
                return true;
            }else return false;
        }
        }

    private boolean isHodColumn(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int c = 0;

        for (int i = 1; i < Math.abs(toColumn - column); i++) {
            if (toColumn > column) {
                c = column + 1;
            } else c = column - 1;
        }
        if (chessBoard.board[line][c] == null) {
            return true;
        } else {
           if (c == toColumn && (chessBoard.board[line][column].getColor() != chessBoard.board[toLine][toColumn].getColor())){
                return true;
            }else return false;

        }
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
