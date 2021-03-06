package cn.liukai234.mydraw.shapes;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;

public class Pentagon implements Shape {
    private int top;
    private int left;
    private int width;
    private int height;
    private GC gcMain;

    public static String Type = "Rect";

    public Pentagon() {}
    public Pentagon(int top, int left, int width, int height, GC gc){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
        this.gcMain=gc;
    }

	private Color paintColor = null;
	public void setPaintColor(Color paintColor) {
		this.paintColor = paintColor;
	}
    
	private int lineStyle = SWT.LINE_SOLID;
	public void setLineStyle(int lineStyle) {
		this.lineStyle = lineStyle;
	}

	private int lineWidth = 1;
	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
	}
	
    @Override
    public void draw() {
    	gcMain.setLineStyle(lineStyle);
		gcMain.setLineWidth(lineWidth);
		gcMain.setForeground(paintColor);
        int Ax, Ay, Bx, By, Cx, Cy, Dx, Dy, Ex, Ey;
        Ax = top + width / 2; Ay = left;
        Bx = top; By = (int)(Math.tan(Math.toRadians(36.0)) * 0.5 * width + left);
        Cx = (int)(top + Math.tan(Math.toRadians(36.0)) * 0.5 * height); Cy = left + height;
        Dx = (int)(top + width - Math.tan(Math.toRadians(36.0)) * 0.5 * height); Dy = left + height;
        Ex = top + width; Ey = (int)(Math.tan(Math.toRadians(36.0)) * 0.5 * width + left);

        int[] PointArray = {Ax, Ay, Bx, By, Cx, Cy, Dx, Dy, Ex, Ey};
        gcMain.drawPolygon(PointArray);
    }

	String str = null;
	public String getString() {
		str = getClass().getName() + " " + top + " " + left + " " + width + " " + height + " " + paintColor.toString() + " " + lineStyle + " " + lineWidth + " ";
		return str;
	}
    
    public void setTop(int top) { this.top = top; }
    public void setLeft(int left) { this.left = left; }
    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
    public void setGC(GC gcMain) { this.gcMain = gcMain; }
}
