import processing.core.PApplet;
public class Bullet extends Floater
{
    private PApplet applet;
    public Bullet(PApplet applet_, Spaceship theShip)
    {
        super(applet_);
        myCenterX = theShip.getX();
        myCenterY = theShip.getY();
        myPointDirection = theShip.getPointDirection();
        double dRadians = myPointDirection * (Math.PI / 180);
        myVelocityX = 5 * Math.cos(dRadians) + myVelocityX;
        myVelocityY = 5 * Math.sin(dRadians) + myVelocityY;
        myColor = 255;
        corners = 4;
        xCorners = new int[corners];
        yCorners = new int[corners];
        xCorners[0] = -5;
        yCorners[0] = -0;
        xCorners[1] = 5;
        yCorners[1] = 0;
        xCorners[2] = 5;
        yCorners[2] = 2;
        xCorners[3] = -2;
        yCorners[3] = 5;
    }
    // @Override
    // public void show()
    // {
        // applet.ellipse(getX(), getY(), 10, 10);
    // }
    public void setX(int x)
    {
        myCenterX = x;
    }
    public int getX()
    {
        return (int)myCenterX;
    }
    public void setY(int y)
    {
        myCenterY = y;
    }
    public int getY()
    {
        return (int)myCenterY;
    }
    public void setVelocityX(double x)
    {
        myVelocityX = x;
    }
    public double getVelocityX()
    {
        return myVelocityX;
    }
    public void setVelocityY(double y)
    {
        myVelocityY = y;
    }
    public double getVelocityY()
    {
        return myVelocityY;
    }
    public void setPointDirection(int degrees)
    {
        myPointDirection = degrees;
    }
    public double getPointDirection()
    {
        return myPointDirection;
    }
}