import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
     public Block()
    {
        getImage().scale(50, 50);
    }
    
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
