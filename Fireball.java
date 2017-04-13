import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fireball extends Actor
{
    private boolean goRight;
    private Hero player;
    GreenfootImage Fireball = new GreenfootImage("Fireball.png");

    public Fireball(Hero h)
    {
        player = h;
        goRight = player.getRight();
        setImage(Fireball);
        getImage().scale(25, 25);

    }

    /**
     * act does what the Fireball wants to do. This method is called whenever
     * goRight changes the direction of the Fireball depending which side mario is facing 
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        if(goRight == true)
        {
            setLocation(getX() + 5, getY());
        }
        else
        {
            setLocation(getX() - 5, getY());
        }
        checkCollision();
    }

    /**
     * --checkCollison sees whether Fireball is touching Enemy/ 
     * Firball is touching Mushroom. If so gets 
     * rid of both fireball and enemy/mushroom and 
     * hitting ememy only adds to score
     * Also gets rid of fireball if outside of world on either side of the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkCollision()
    {
        ScrollerWorld myWorld = (ScrollerWorld)getWorld();
        if( isTouching(Mushroom.class) )
        {
            getWorld().removeObject(getOneIntersectingObject(Mushroom.class) );
            getWorld().removeObject(this);
        }
        else if( getX() >=599 )
        {
            getWorld().removeObject(this);
        }
        else if( getX() <=0 )
        {
            getWorld().removeObject(this);
        } 
        else if( isTouching(Enemy.class) )
        {
            getWorld().removeObject(getOneIntersectingObject(Enemy.class) );
            getWorld().removeObject(this);
            myWorld.addToScore();
        }
        else if( getX() >=599 )
        {
            getWorld().removeObject(this);
        }
        else if( getX() <=0 )
        {
            getWorld().removeObject(this);
        }

    }
}
