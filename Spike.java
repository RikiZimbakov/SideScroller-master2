import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spike extends Actor
{
    // Add imageCounter variable here
    private int imageCounter = 3;

    // Add Spike constructor here to scale the image for the Spike
    public Spike()
    {
        getImage().scale(50, 50);
        
    }

    /**
     * checkCollison will get a reference to scrollerWorld and also checks
     * if the enemy is touching fireball and if so add to score and remove 
     * the fireball from the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void checkCollison()
    {
        ScrollerWorld myWorld = (ScrollerWorld)getWorld();
    }

    /**
     * act does what the Spike wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add code to have enemy move left here
        move(-2);

        GreenfootImage Spike = new GreenfootImage("spikes.png");
        if(imageCounter >= 3)
        {
            Spike.mirrorHorizontally();
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
