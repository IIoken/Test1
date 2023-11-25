import java.util.Objects;

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

        if (canPosition(toLine,toColumn)) {
            boolean b = (toLine == line - 1) || (toLine == line) || (toLine == line + 1);
            return ((toColumn == column - 1) && b && isHodKing(chessBoard, line, column, toLine, toColumn))
                    || ((toColumn == column) && ((toLine == line - 1) || (toLine == line + 1)) && isHodKing(chessBoard, line, column, toLine, toColumn))
                    || ((toColumn == column + 1) && b && isHodKing(chessBoard, line, column, toLine, toColumn))
                    && (!isUnderAttack(chessBoard, toLine, toColumn));
        } else return false;
    }

    private boolean isHodKing(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return (chessBoard.board[toLine][toColumn] == null) || (!Objects.equals(chessBoard.board[line][column].getColor(), chessBoard.board[toLine][toColumn].getColor()));
    }

    @Override
    public String getSymbol() {
        return "K";
    }
}
