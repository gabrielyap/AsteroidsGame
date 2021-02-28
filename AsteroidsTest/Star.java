import processing.core.PApplet;
public class Star extends PApplet
{
    private PApplet applet;
    private int[] x;
    private int[] y;
    public Star(PApplet applet_)
    {
        applet = applet_;
        int num = ((int)(Math.random() * 50) + 1);
        x = new int[num];
        y = new int[num];
        for (int i = 0; i < num; i++)
        {
            x[i] = (int)((Math.random() * 1000) + 1);
            y[i] = (int)((Math.random() * 1000) + 1);
        }
    }
    public void show()
    {
        applet.fill(255, 255, 255);
        for (int i = 0; i < x.length; i++)
        {
            applet.ellipse(x[i], y[i], 1, 1);
        }
    }
}