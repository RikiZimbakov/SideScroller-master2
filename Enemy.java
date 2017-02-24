import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
     * Enemy class adds an imageCounter and an Enemy then scales the image for the Goomba.
     * @param There are no parameters
     * @return Nothing is returned
     */
public class Enemy extends Actor
{
    // Add imageCounter variable here
    private int imageCounter = 3;
    
    // Add Enemy constructor here to scale the image for the Enemy
    public Enemy()
    {
        getImage().scale(25, 25);
    }
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
	 * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add code to have enemy move left here
        move(-2);
         
        /**
         * Check if imageCounter is >= 3. If so, mirror the image horizontally and
         * set imageCounter to 0. Otherwise, increase the imageCounter by 1.
		 * @param There are no parameters
     	 * @return Nothing is returned
         */
        GreenfootImage Enemy = new GreenfootImage("Goomba.png");
        if(imageCounter >= 3)
        {
            Enemy.mirrorHorizontally();
        }
        else
        {
            imageCounter ++;
        }
       /**
     	* Check if the Enemy's x location is <= 0. If so, remove it from the world.
	 	* @param There are no parameters
     	* @return Nothing is returned
     	*/
        //Check if the Enemy's x location is <= 0. If so, remove it from the world
        if( getX() <= 0)
        {
            getWorld().removeObject(this);
        }
    }    
}
