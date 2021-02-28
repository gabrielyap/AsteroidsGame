import processing.core.PApplet;
import java.util.ArrayList;
public class AsteroidsGame extends PApplet
{
    //your variable declarations here
    Spaceship ship;
    Star star;
    Bullet b;
    ArrayList<Asteroid> astList = new ArrayList<Asteroid>();
    ArrayList<Bullet> bltList = new ArrayList<Bullet>();
    public static void main(String[] args)
    {
        PApplet.main(new String[] {"AsteroidsGame"});
    }

    public void settings()
    {
        size(1000, 1000);
    }

    public void setup() 
    {
        ship = new Spaceship(this);
        star = new Star(this);
        for (int i = 0; i < 6; i++)
        {
            Asteroid a = new Asteroid(this);
            astList.add(i, a);
        }
        ship.setX(500);
        ship.setY(500);
    }

    public void draw() 
    { 
        background(0);
        ship.show();
        ship.move();
        star.show();
        for (int i = 0; i < astList.size(); i++)
        {
            Asteroid as = astList.get(i);
            as.show();
            as.move();
            for (int z = 0; z < bltList.size(); z++)
            {
                Bullet b = bltList.get(z);
                if (dist(b.getX(), b.getY(), as.getX(), as.getY()) <=  20)
                {
                    astList.remove(i);
                    bltList.remove(z);
                }
            }
        }
        for (int i = 0; i < astList.size(); i++)
        {
            Asteroid as = astList.get(i);
            if (dist(as.getX(), as.getY(), ship.getX(), ship.getY()) <= 20)
            {
                astList.remove(i);
            }
        }
        for (int i = 0; i < bltList.size(); i++)
        {
            bltList.get(i).show();
            bltList.get(i).move();
        }
        if (keyPressed)
        {
            if (key == 'q')
            {
                bltList.add(new Bullet(this, ship));
            }
            if (key == 'w')
            {
                ship.accelerate(1);
            }
            if (key == 's')
            {
                ship.accelerate(-1);
            }
            if (key == 'a')
            {
                ship.rotate(10);
            }
            if (key == 'd')
            {
                ship.rotate(-10);
            }
            if (key == 'r')
            {
                ship.setX((int)(Math.random() * 1000) + 1);
                ship.setY((int)(Math.random() * 1000) + 1);
                ship.setPointDirection((int)(Math.random() * 360));
                ship.setVelocityX(0);
                ship.setVelocityY(0);
            }
        }
    }
}