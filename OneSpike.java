import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OneSpike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OneSpike extends Obstacle
{
    /**
     * OneSpike scales the image to the right size and is public because it
     * needs to be accessed by other classes.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public OneSpike()
    {
        getImage().scale(35, 25);
    }
}
