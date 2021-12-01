package week10;

public class Rook extends Piece {
  /**
   * Instantiates a new rook.
   *
   * @param x the x
   * @param y the y
   */
  public Rook(int x, int y) {
    super(x, y);
  }

  /**
   * Instantiates a new rook.
   *
   * @param x the x
   * @param y the y
   * @param c the c
   */
  public Rook(int x, int y, String c) {
    super(x, y, c);
  }

  /**
   * Gets the symbol.
   *
   * @return the symbol
   */
  @Override
  public String getSymbol() {
    return "R";
  }

  /**
   * Can move.
   *
   * @param board the board
   * @param x the x
   * @param y the y
   * @return true, if successful
   */
  @Override
  public boolean canMove(Board board, int x, int y) {
    if (x < 1 || x > 8 || y < 1 || y > 8) {
      return false;
    }
    if (this.getCoordinatesX() == x && this.getCoordinatesY() == y) {
      return true;
    }
    if (this.getCoordinatesX() == x) {
      for (int i = 1; i <= 8; i++) {
        if ((i >= y && i < this.getCoordinatesY()) || (i > this.getCoordinatesY() && i <= y)) {
          Piece p = board.getAt(x, i);
          if (p != null) {
            return i == y && !p.getColor().equals(this.getColor());
          }
        }
      }
      return true;
    } else if (this.getCoordinatesY() == y) {
      for (int i = 1; i <= 8; i++) {
        if ((i >= x && i < this.getCoordinatesX()) || (i > this.getCoordinatesX() && i <= x)) {
          Piece p = board.getAt(i, y);
          if (p != null) {
            return i == x && !p.getColor().equals(this.getColor());
          }
        }
      }
      return true;
    }
    return false;
  }
}
