import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        if( isTouching(Fireball.class) )
        {
            myWorld.addToScore();
            getWorld().removeObject(getOneIntersectingObject(Fireball.class) );
        }
    }

    /**
     * act does what the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add code to have enemy move left here
        move(-2);

        GreenfootImage Enemy = new GreenfootImage("Goomba.png");
        if(imageCounter >= 3)
        {
            Enemy.mirrorHorizontally();
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
