package heroes.juego;

public final class Punto {

  public final int x;
  public final int y;

  public Punto(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "Coord(" + x + ", " + y + ")";
  }

  public int distancia(Punto that) {

    int dx = this.x - that.x;
    int dy = this.y - that.y;

    return (int) Math.sqrt(dx * dx + dy * dy);
  }

  public boolean equals(Punto that) {
    return this.x == that.x && this.y == that.y;
  }

}
