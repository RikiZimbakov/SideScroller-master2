/**
 * Name: (Risto Zimbakov)
 * Teacher: Mr. Hardman
 * Assignment #1, SideScroller
 * Date Last Modified: 
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
     * Add platformCounter and score variables here. Also sets initial score to zero.
     * @param There are no parameters
     * @return Nothing is returned
     */
public class ScrollerWorld extends World
{
    //Add platformCounter and score variables here
    private int platformCounter = 25;
    private int Score = 0;
    
   /**
     *Constructor for objects of class ScrollerWorld.
     *Create a new world with 600x400 cells with a cell size of 1x1 pixels.
     *prepareWorld method which will add objects to world
     *display score will be called upon to show the score for amount of gumbas stomped on
     * @param There are no parameters
     * @return Nothing is returned
     */
    public ScrollerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        //Method call to prepareWorld method which will add objects to world
        prepareWorld();
        
        //when created, add method call to displayScore here
        displayScore();
    }
    
    /**
     * prepareWorld adds objects to world to prepare the game for use
     * It also adds platforms at the bottom of the world for our mario character to walk on
     * we also add our Mario to the world here
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void prepareWorld()
    {
        //Add for loop here to fill bottom of world with platforms
        for(int i = 0; i <= getWidth()/50; i++ )
        {
           addObject(new Platform(), i*50, getHeight()- 8); 
        }
        
        //Add Hero object to the world
        addObject(new Hero(), 30, getHeight() - 30);
    }
    
    /**
     * Add an act method here that will handle adding platforms to the right side
     * of the world so that the hero doesn't run out of platform to run on. This
     * method will also add Enemies to the world 0.67% of the time. The last thing
     * the act method will need is a method call to the displayScore method
     * @param There are no parameters
     * @return Nothing is returned
     */
    
    public void act()
    {
        if( Greenfoot.isKeyDown("right") )
        {
            if( platformCounter >= 25 )
            {
                platformCounter = 0;
                addObject(new Platform(), getWidth()-25, getHeight()-8);
            }
            platformCounter++;
        }
        if( Greenfoot.getRandomNumber(150) < 1 )
        {
            addObject(new Enemy(), 599, getHeight()- 27);
        }
        displayScore();
    }
    
    
   /**
     * GameOver method will display game over message and stop the scenario
     * @param There are no parameters
     * @return Nothing is returned
     */
    //Add gameOver method here that will display game over message and stop the scenario
    public void gameOver()
    {
        showText("You Have been Defeated! Score:" + Score, getWidth()/2, getHeight()/2);
        Greenfoot.stop();
    }
   /**
     * DisplayScore method will display the score in the top left of the world
     * @param There are no parameters
     * @return Nothing is returned
     */ 
    //Add displayScore method here that will display the score in the top left of the world
    private void displayScore()
    {
        showText( "score: " + Score, 50, 25);
        
    }
    /**
     * addToScore method here that will increment the score variable
     * @param There are no parameters
     * @return Nothing is returned
     */
    //Add addToScore method here that will increment the score variable
    public void addToscore()
    {
        Score ++;
        displayScore();
    }
}
