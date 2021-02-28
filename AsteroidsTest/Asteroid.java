import processing.core.PApplet;
public class Asteroid extends Floater
{
    private int rotSpeed;
    public Asteroid(PApplet app)
    {
        super(app);
        corners = 6;
        xCorners = new int[corners];
        yCorners = new int[corners];
        xCorners[0] = -11;
        yCorners[0] = -8;
        xCorners[1] = 7;
        yCorners[1] = -8;
        xCorners[2] = 13;
        yCorners[2] = 0;
        xCorners[3] = 6;
        yCorners[3] = 10;
        xCorners[4] = -11;
        yCorners[4] = 8;
        xCorners[5] = -5;
        yCorners[5] = 0;
        rotSpeed = ((int)(Math.random() * 8) - 4);
        while (rotSpeed == 0)
        {
            rotSpeed = ((int)(Math.random() * 4) - 2);
        }
        myColor = 255;
        myCenterX = (int)((Math.random() * 1000) + 1);
        myCenterY = (int)((Math.random() * 1000) + 1);
        myVelocityX = ((Math.random() * 7) - 3);
        while (myVelocityX == 0)
        {
            myVelocityX = ((Math.random() * 7) - 3);
        }
        myVelocityY = ((Math.random() * 7) - 3);
        while (myVelocityY == 0)
        {
            myVelocityY = ((Math.random() * 7) - 3);
        }
    }
    @Override
    public void move()
    {
        rotate(rotSpeed);
        super.move();
    }
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
