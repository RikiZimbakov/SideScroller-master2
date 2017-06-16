import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Obstacle extends Actor
{
    // private because it only needs to be accessed in this class
    private int imageCounter = 3;
    private String block;

    /**
     * checkCollison will get a reference to scrollerWorld  
     * public because it needs to be accessed by other classes. 
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void checkCollison()
    {
        GeometryDash myWorld = (GeometryDash)getWorld();
    }

    /**
     * act does what the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * public because it  needs to be accessed by other classes.
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
