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
        // Конечная позиция не равна начальной
        if (toLine != line && toColumn != column) {
            //проверил что бы не выходило за доску
            if (toLine >= 0 && toColumn <= 7 && toColumn >= 0 && toLine <= 7) {
            //Расписал как ходит конь, буковй "Г"
                if ((toLine == (line - 2) && toColumn == (column + 1)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line - 2) && toColumn == (column - 1)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line + 2) && toColumn == (column + 1)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line + 2) && toColumn == (column - 1)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line - 1) && toColumn == (column + 2)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line - 1) && toColumn == (column - 2)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line + 1) && toColumn == (column + 2)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line + 1) && toColumn == (column - 2)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else return false;
            }else return false;
        }else return false;
    }

    private boolean isHodHorse(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.board[toLine][toColumn] == null || chessBoard.board[line][column].getColor() != chessBoard.board[toLine][toColumn].getColor()){
            return true;
        }return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
