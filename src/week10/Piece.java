package week10;

public abstract class Piece {
  private int coordinatesX;
  private int coordinatesY;
  private String color;

  /**
   * Instantiates a new piece.
   *
   * @param x the x
   * @param y the y
   */
  public Piece(int x, int y) {
    this.coordinatesX = x;
    this.coordinatesY = y;
    this.color = "white";
  }

  /**
   * Instantiates a new piece.
   *
   * @param x the x
   * @param y the y
   * @param c the c
   */
  public Piece(int x, int y, String c) {
    this.coordinatesX = x;
    this.coordinatesY = y;
    this.color = c;
  }

  /**
   * Gets the coordinates X.
   *
   * @return the coordinates X
   */
  public int getCoordinatesX() {
    return this.coordinatesX;
  }

  /**
   * Sets the coordinates X.
   *
   * @param coordinatesX the new coordinates X
   */
  public void setCoordinatesX(int coordinatesX) {
    this.coordinatesX = coordinatesX;
  }

  /**
   * Gets the coordinates Y.
   *
   * @return the coordinates Y
   */
  public int getCoordinatesY() {
    return this.coordinatesY;
  }

  /**
   * Sets the coordinates Y.
   *
   * @param coordinatesY the new coordinates Y
   */
  public void setCoordinatesY(int coordinatesY) {
    this.coordinatesY = coordinatesY;
  }

  /**
   * Gets the color.
   *
   * @return the color
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Sets the color.
   *
   * @param color the new color
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Check position.
   *
   * @param p the p
   * @return true, if successful
   */
  public boolean checkPosition(Piece p) {
    if (this.coordinatesX == p.coordinatesX && this.coordinatesY == p.coordinatesY) {
      return true;
    }
    return false;
  }

  /**
   * Gets the symbol.
   *
   * @return the symbol
   */
  public abstract String getSymbol();

  /**
   * Can move.
   *
   * @param board the board
   * @param x the x
   * @param y the y
   * @return true, if successful
   */
  public abstract boolean canMove(Board board, int x, int y);
}
