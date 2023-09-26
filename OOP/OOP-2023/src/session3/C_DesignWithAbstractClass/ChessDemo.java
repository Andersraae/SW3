package session3.C_DesignWithAbstractClass;

public class ChessDemo {

    public static void main(String[] args) {
        //Create the Chess Board
        ChessBoard chessBoard = new ChessBoard();

        King king = new King(chessBoard, "Black", 1, 1);
        Queen queen = new Queen(chessBoard, "Black", 0, 0);

        ChessPiece[] pieces = new ChessPiece[2];
        pieces[0] = king;
        pieces[1] = queen;




     }
}
