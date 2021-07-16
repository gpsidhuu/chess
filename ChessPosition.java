public class ChessPosition {
    int x;
    int y;

    public ChessPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "ChessPosition{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
