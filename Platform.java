import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Platform extends Actor
{
    //Add constructor here to scale the platform's image
    /**
     * Platform scales the image to the right size and is public because it
     * needs to be accessed by other classes.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public Platform()
    {
        getImage().scale(100, 16);
    }

    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. 
     * Also remove platforms if it's x coordinate is < 0.
     * public because it  needs to be accessed by other classes.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add code to move platforms if right key is pressed
        if( Greenfoot.isKeyDown("right") )
        {
            move(-1);
        }

        // Add code to remove platforms if it's x coordinate is < 0
        if( getX() < 0)
        {
            getWorld().removeObject(this);
        }
    }    
}
