import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Trophy extends Actor
{
    // private because it only needs to be accessed in this class
    private int imageCounter = 3;
    private GreenfootImage trophy = new GreenfootImage("trophy.png");
    /**
     * Trophy scales the image to the right size and is public because it
     * needs to be accessed by other classes.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public Trophy()
    {
        getImage().scale(50, 50);
    }
    
    /**
     * --checkCollison makes a reference to scroller world and also
     * checks if it is touching fireball and if it is removes both the fireball
     * and the Trophy as well because noone likes baked Trophys
     * public because it  needs to be accessed by other classes.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void checkCollison()
    {
        GeometryDash myWorld = (GeometryDash)getWorld();
    }

    /**
     * act does whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * public because it  needs to be accessed by other classes.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        move(-2);
        if(imageCounter >= 3)
        {
            trophy.mirrorHorizontally();
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
