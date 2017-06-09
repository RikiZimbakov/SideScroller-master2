import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Trophy extends Actor
{
    // Add imageCounter variable here
    private int imageCounter = 3;

    // Add Enemy constructor here to scale the image for the Enemy
    public Trophy()
    {
        getImage().scale(50, 50);
    }
    
    /**
     * --checkCollison makes a reference to scroller world and also
     * checks if it is touching fireball and if it is removes both the fireball
     * and the Trophy as well because noone likes baked Trophys
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void checkCollison()
    {
        ScrollerWorld myWorld = (ScrollerWorld)getWorld();
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
        GreenfootImage Trophy = new GreenfootImage("trophy.png");
        if(imageCounter >= 3)
        {
            Trophy.mirrorHorizontally();
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
