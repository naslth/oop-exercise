package week10;

import java.util.ArrayList;

public class Board {
  public static final int WIDTH = 8;
  public static final int HEIGHT = 8;
  private ArrayList<Piece> pieces = new ArrayList<Piece>();

  /**
   * Instantiates a new board.
   */
  public Board() {}

  /**
   * Gets the pieces.
   *
   * @return the pieces
   */
  public ArrayList<Piece> getPieces() {
    return pieces;
  }

  /**
   * Sets the pieces.
   *
   * @param pieces the new pieces
   */
  public void setPieces(ArrayList<Piece> pieces) {
    this.pieces = pieces;
  }

  /**
   * Validate.
   *
   * @param x the x
   * @param y the y
   * @return true, if successful
   */
  public boolean validate(int x, int y) {
    return 1 <= x && x <= 8 && 1 <= y && y <= 8;
  }

  /**
   * Adds the piece.
   *
   * @param piece the piece
   */
  public void addPiece(Piece piece) {
    if (piece == null || !validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
      return;
    }
    for (Piece p : pieces) {
      if (p.checkPosition(piece)) {
        return;
      }
    }
    pieces.add(piece);
  }

  /**
   * Gets the at.
   *
   * @param x the x
   * @param y the y
   * @return the at
   */
  public Piece getAt(int x, int y) {
    for (Piece p : pieces) {
      if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
        return p;
      }
    }
    return null;
  }

  /**
   * Removes the at.
   *
   * @param x the x
   * @param y the y
   */
  public void removeAt(int x, int y) {
    Piece p = getAt(x, y);
    if (p != null) {
      pieces.remove(p);
    }
  }
}
