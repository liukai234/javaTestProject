import java.awt.*;

public class Rect implements Shape {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    Graphics g;
    public Rect(int x, int y, int width, int height, Graphics g) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.g = g;
    }

    public void Draw() {
        g.drawRect(x, y, width, height);
    }

    @Override
    public void Draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}
