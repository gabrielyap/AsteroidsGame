import processing.core.PApplet;
public class Spaceship extends Floater  
{   
    public void setX(int x)
    {
        myCenterX = (double)(x);
    }

    public int getX()
    {
        return (int)myCenterX;
    }

    public void setY(int y)
    {
        myCenterY = (double)(y);
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
        myPointDirection = (double)(degrees);
    }

    public double getPointDirection()
    {
        return myPointDirection;
    }
    //
    public Spaceship(PApplet app)
    {
        super(app);
        corners = 3;
        xCorners = new int[corners];
        yCorners = new int[corners];
        xCorners[0] = -8;
        yCorners[0] = -8;
        xCorners[1] = 16;
        yCorners[1] = 0;
        xCorners[2] = -8;
        yCorners[2] = 8;
        myColor = 255;
        myCenterX = 0;
        myCenterY = 0;
        myVelocityX = 0;
        myVelocityY = 0;
        myPointDirection = 0;
    }
}