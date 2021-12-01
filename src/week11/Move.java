package week11;

import java.util.HashMap;
import java.util.Map;

public class Move {
  private static final Map<Integer, String> pos = new HashMap<Integer, String>();

  static {
    pos.put(1, "a");
    pos.put(2, "b");
    pos.put(3, "c");
    pos.put(4, "d");
    pos.put(5, "e");
    pos.put(6, "f");
    pos.put(7, "g");
    pos.put(8, "h");
  }

  /** The moved piece. */
  private Piece movedPiece;

  /** The start X. */
  private int startX;

  /** The end X. */
  private int endX;

  /** The start Y. */
  private int startY;

  /** The end Y. */
  private int endY;

  /** The killed piece. */
  private Piece killedPiece;

  /**
   * Instantiates a new move.
   *
   * @param startX the start X
   * @param endX the end X
   * @param startY the start Y
   * @param endY the end Y
   * @param movedPiece the moved piece
   */
  public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
    this.startX = startX;
    this.startY = startY;
    this.endX = endX;
    this.endY = endY;
    this.movedPiece = movedPiece;
    this.killedPiece = null;
  }


  /**
   * Instantiates a new move.
   *
   * @param startX the start X
   * @param endX the end X
   * @param startY the start Y
   * @param endY the end Y
   * @param movedPiece the moved piece
   * @param killedPiece the killed piece
   */
  public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
    this(startX, endX, startY, endY, movedPiece);
    this.killedPiece = killedPiece;
  }

  /**
   * Gets the moved piece.
   *
   * @return the moved piece
   */
  public Piece getMovedPiece() {
    return movedPiece;
  }

  /**
   * Sets the moved piece.
   *
   * @param movedPiece the new moved piece
   */
  public void setMovedPiece(Piece movedPiece) {
    this.movedPiece = movedPiece;
  }

  /**
   * Gets the start X.
   *
   * @return the start X
   */
  public int getStartX() {
    return startX;
  }

  /**
   * Sets the start X.
   *
   * @param startX the new start X
   */
  public void setStartX(int startX) {
    this.startX = startX;
  }

  /**
   * Gets the end X.
   *
   * @return the end X
   */
  public int getEndX() {
    return endX;
  }

  /**
   * Sets the end X.
   *
   * @param endX the new end X
   */
  public void setEndX(int endX) {
    this.endX = endX;
  }

  /**
   * Gets the start Y.
   *
   * @return the start Y
   */
  public int getStartY() {
    return startY;
  }

  /**
   * Sets the start Y.
   *
   * @param startY the new start Y
   */
  public void setStartY(int startY) {
    this.startY = startY;
  }

  /**
   * Gets the end Y.
   *
   * @return the end Y
   */
  public int getEndY() {
    return endY;
  }

  /**
   * Sets the end Y.
   *
   * @param endY the new end Y
   */
  public void setEndY(int endY) {
    this.endY = endY;
  }

  /**
   * Gets the killed piece.
   *
   * @return the killed piece
   */
  public Piece getKilledPiece() {
    return killedPiece;
  }

  /**
   * Sets the killed piece.
   *
   * @param killedPiece the new killed piece
   */
  public void setKilledPiece(Piece killedPiece) {
    this.killedPiece = killedPiece;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return movedPiece.getColor() + "-" + movedPiece.getSymbol() + pos.get(endX) + endY;
  }
}
