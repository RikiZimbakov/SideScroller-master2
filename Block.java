import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    /**
     * Block sets the image size of the block.
     * modifier is public because it needs to be accessed by other classes.
     * 
     * @param There are no parameters
     * @return Nothing is returned.
     */
    public Block()
    {
        getImage().scale(50, 50);
    }

    /**
     * act moves the block and also removes it from the world when it reaches
     * the end of the world
     * modifier is public because it needs to be accessed by other classes.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add code to have Obstacle move left here
        move(-2);

        if( getX() <= 0)
        {
            getWorld().removeObject(this);
        }
    }
}
