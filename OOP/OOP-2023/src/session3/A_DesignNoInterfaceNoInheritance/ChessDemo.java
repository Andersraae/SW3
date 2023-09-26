package session3.A_DesignNoInterfaceNoInheritance;

public class ChessDemo {

    public static void main(String[] args) {
        //Create the Chess Board
        ChessBoard chessBoard = new ChessBoard();

        ChessPiece blackKing = new ChessPiece("King", "Black", 0, 2, chessBoard);
    }
}
