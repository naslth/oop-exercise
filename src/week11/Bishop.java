package week11;

public class Bishop extends Piece {
  /**
   * Instantiates a new bishop.
   *
   * @param x the x
   * @param y the y
   */
  public Bishop(int x, int y) {
    super(x, y);
  }

  /**
   * Instantiates a new bishop.
   *
   * @param x the x
   * @param y the y
   * @param c the c
   */
  public Bishop(int x, int y, String c) {
    super(x, y, c);
  }

  /**
   * Gets the symbol.
   *
   * @return the symbol
   */
  @Override
  public String getSymbol() {
    return "B";
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
    int i, j;
    if (this.getCoordinatesX() < x) {
      if (this.getCoordinatesY() < y) {
        for (i = this.getCoordinatesX() + 1, j = this.getCoordinatesY() + 1; i <= x
            && j <= y; i++, j++) {
          Piece p = board.getAt(i, j);
          if (p != null) {
            return i == x && j == y && !p.getColor().equals(this.getColor());
          }
        }
        return i == x && j == y;
      } else if (this.getCoordinatesY() > y) {
        for (i = this.getCoordinatesX() + 1, j = this.getCoordinatesY() - 1; i <= x
            && j >= y; i++, j--) {
          Piece p = board.getAt(i, j);
          if (p != null) {
            return i == x && j == y && !p.getColor().equals(this.getColor());
          }
        }
        return i == x && j == y;
      }
    } else {
      if (this.getCoordinatesY() < y) {
        for (i = this.getCoordinatesX() - 1, j = this.getCoordinatesY() + 1; i >= x
            && j <= y; i--, j++) {
          Piece p = board.getAt(i, j);
          if (p != null) {
            return i == x && j == y && !p.getColor().equals(this.getColor());
          }
        }
        return i == x && j == y;
      } else if (this.getCoordinatesY() > y) {
        for (i = this.getCoordinatesX() - 1, j = this.getCoordinatesY() - 1; i >= x
            && j >= y; i--, j--) {
          Piece p = board.getAt(i, j);
          if (p != null) {
            return i == x && j == y && !p.getColor().equals(this.getColor());
          }
        }
        return i == x && j == y;
      }
    }
    return false;
  }
}
