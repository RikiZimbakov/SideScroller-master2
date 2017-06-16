import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TwoSpikes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwoSpikes extends Obstacle
{
    /**
     * TwoSpikes scales the image to the right size and is public because it
     * needs to be accessed by other classes.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public TwoSpikes()
    {
        getImage().scale(45, 35);
    }
}
