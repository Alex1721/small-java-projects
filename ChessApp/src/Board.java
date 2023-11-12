/*
 * It contains the pawns and the player constants that we'll use in on the board.
 */

public class Board {
    public static final String PAWN = "P";
    public static final String ROOK = "R";
    public static final String KNIGHT = "N";
    public static final String BISHOP = "B";
    public static final String QUEEN = "Q";
    public static final String KING = "K";
    public static final String PLAYER_1 = "1";
    public static final String PLAYER_2 = "2";
    public static final String EMPTY = "-";
    public static String board[][] = new String[8][8];

    // Let's set the initial state of the board.
    public static void setInitialBoard() {
        for (int i = 0; i < board.length; i++) {
            board[1][i] = PAWN + PLAYER_1;
            board[6][i] = PAWN + PLAYER_2;
            switch (i) {
                case 0:
                    setPiece(i, ROOK);
                    break;
                case 1:
                    setPiece(i, KNIGHT);
                    break;
                case 2:
                    setPiece(i, BISHOP);
                    break;
            }
            for (int j = 2; j < 6; j++) {
                board[j][i] = EMPTY;
            }
        }
    }

    // q: Why is this method private?
    // a: Because it's only used in this class.
    // q: We can't access it from other classes?
    // a: No, we can't.
    // q: why is it static?
    // a: Because we don't need to create an instance of this class to use it.
    // q: Why is it void?
    // a: Because it doesn't return anything.
    private static void setPiece(int i, String Piece) {
        board[0][i] = Piece + PLAYER_1;
        board[0][7 - i] = Piece + PLAYER_1;
        board[7][i] = Piece + PLAYER_2;
        board[7][7 - i] = Piece + PLAYER_2;
    }
}
