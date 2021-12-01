package week11;

import java.util.ArrayList;

public class Game {
  private final ArrayList<Move> moveHistory = new ArrayList<Move>();
  private Board board;

  /**
   * Instantiates a new game.
   *
   * @param board the board
   */
  public Game(Board board) {
    this.board = board;
  }

  /**
   * Gets the board.
   *
   * @return the board
   */
  public Board getBoard() {
    return board;
  }

  /**
   * Sets the board.
   *
   * @param board the new board
   */
  public void setBoard(Board board) {
    this.board = board;
  }

  /**
   * Gets the move history.
   *
   * @return the move history
   */
  public ArrayList<Move> getMoveHistory() {
    return moveHistory;
  }

  /**
   * Move piece.
   *
   * @param piece the piece
   * @param x the x
   * @param y the y
   */
  public void movePiece(Piece piece, int x, int y) {
    Move move = null;
    if (piece.canMove(board, x, y)) {
      if (board.getAt(x, y) != null) {
        move = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece,
            board.getAt(x, y));
        board.removeAt(x, y);
      } else {
        move = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece);
      }
      moveHistory.add(move);
      piece.setCoordinatesX(x);
      piece.setCoordinatesY(y);
    }
  }
}
