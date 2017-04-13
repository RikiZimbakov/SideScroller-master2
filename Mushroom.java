import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mushroom extends Actor
{
    // Add imageCounter variable here
    private int imageCounter = 3;

    // Add Enemy constructor here to scale the image for the Enemy
    public Mushroom()
    {
        getImage().scale(25, 25);
    }
    
    /**
     * --checkCollison makes a reference to scroller world and also
     * checks if it is touching fireball and if it is removes both the fireball
     * and the mushroom as well because noone likes baked mushrooms
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void checkCollison()
    {
        ScrollerWorld myWorld = (ScrollerWorld)getWorld();
        if( isTouching(Fireball.class) )
        {
            getWorld().removeObject(getOneIntersectingObject(Mushroom.class) );
            getWorld().removeObject(getOneIntersectingObject(Fireball.class) );
        }
    }

    /**
     * act does whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        move(-2);
        GreenfootImage mushroom = new GreenfootImage("Shroom.png");
        if(imageCounter >= 3)
        {
            mushroom.mirrorHorizontally();
        }
        else
        {
            imageCounter ++;
        }

        if( getX() <= 0)
        {
            getWorld().removeObject(this);
        }
    }    
}
