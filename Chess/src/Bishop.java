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
            if (toLine >= 0 && toLine <= 7 && toColumn >= 0 && toColumn <= 7) {
//                Сделали линию по вертикали
                if ((toLine - line) == (toColumn - column) && isHodBishop(chessBoard, line, column, toLine, toColumn)
//                        ПО горизонтали
                        || (toLine - line) == -1*(toColumn - column) && isHodBishop(chessBoard, line, column, toLine, toColumn)) {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }
    private boolean isHodBishop(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.board[toLine][toColumn] == null || chessBoard.board[line][column].getColor() != chessBoard.board[toLine][toColumn].getColor()){
            return true;
        }return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }

}
