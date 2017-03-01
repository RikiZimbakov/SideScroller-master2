import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    private boolean goRight;
    private Hero player;
    GreenfootImage Fireball = new GreenfootImage("Fireball.png");
    /**
     * Sets image to fireball and gets references to Hero
     * @param There are no parameters
     * @return Nothing is returned
     */
    public Fireball(Hero h)
    {
        player = h;
        goRight = player.getRight();
        setImage(Fireball);
        getImage().scale(25, 25);

    }
    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever
     * goRight changes the direction of the Fireball depending which side mario is facing 
     * the 'Act' or 'Run' button gets pressed in the environment.
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
     * Checks whether Fireball is touching Enemy and if so gets 
     * rid of both fireball and enemy and adds to score
     * Also gets rid of fireball if outside of world on either side of the world
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkCollision()
    {
        ScrollerWorld myWorld = (ScrollerWorld)getWorld();

        if( isTouching(Enemy.class) )
        {
            getWorld().removeObject(getOneIntersectingObject(Enemy.class) );
            getWorld().removeObject(this);
            myWorld.addToscore();
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
