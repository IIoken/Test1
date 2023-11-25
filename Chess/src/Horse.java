import java.util.Objects;

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
            if (canPosition(toLine,toColumn)) {
            //Расписал как ходит конь, буковй "Г"
                if ((toLine == (line - 2) && toColumn == (column + 1)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line - 2) && toColumn == (column - 1)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line + 2) && toColumn == (column + 1)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line + 2) && toColumn == (column - 1)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line - 1) && toColumn == (column + 2)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line - 1) && toColumn == (column - 2)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else if ((toLine == (line + 1) && toColumn == (column + 2)) && isHodHorse(chessBoard,line,column,toLine,toColumn)) return true;
                else return (toLine == (line + 1) && toColumn == (column - 2)) && isHodHorse(chessBoard, line, column, toLine, toColumn);
            }else return false;
        }else return false;
    }

    private boolean isHodHorse(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return (chessBoard.board[toLine][toColumn] == null) || !Objects.equals(chessBoard.board[toLine][toColumn].getColor(), chessBoard.board[line][column].getColor());
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
