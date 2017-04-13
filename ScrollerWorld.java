/**
 * Name: (Risto Zimbakov)
 * Teacher: Mr. Hardman
 * Assignment #1, SideScroller
 * Date Last Modified:4/13/2017 
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ScrollerWorld extends World
{
    //Add platformCounter and score variables here
    private int platformCounter = 25;
    private int score = 0;

    /**
     *Constructor for objects of class ScrollerWorld.
     *Corrected score variable made it lower case.
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
     * --prepareWorld adds objects to world to prepare the game for use
     * It also adds platforms at the bottom of the world for our mario character to walk on
     * we also add our Mario to the world here
     * I also added a health bar to the world
     * 
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
        addObject(new HealthBar(), 275, getHeight() - 375);
    }

    /**
     * --act will handle adding platforms to the right side
     * of the world so that the hero doesn't run out of platform to run on. This
     * method will also add Enemies to the world 0.67% of the time and mushrooms
     * a random number of times as well but less then the enemy. The last thing
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

        if( Greenfoot.getRandomNumber(500) < 1 )
        {
            addObject(new Mushroom(), 599, getHeight()- 125);
        }
        displayScore();
    }

    /**
     * gameOver method will display game over message and stop the scenario
     * Added white spaces in between all code
     * @param There are no parameters
     * @return Nothing is returned
     */
    //Add gameOver method here that will display game over message and stop the scenario
    public void gameOver()
    {
        showText("You Have been Defeated! Score:" + score, getWidth()/2, getHeight()/2);
        Greenfoot.stop();
    }

    /**
     * displayScore method will display the score in the top left of the world
     * corrected blank white line after showText line
     * @param There are no parameters
     * @return Nothing is returned
     */ 
    //Add displayScore method here that will display the score in the top left of the world
    private void displayScore()
    {
        showText( "score: " + score, 50, 25);
    }

    /**
     * addToScore method here that will increment the score variable
     * @param There are no parameters
     * @return Nothing is returned
     */
    //Add addToScore method here that will increment the score variable

    public void addToScore()
    {
        score ++;
        displayScore();
    }

    /**
     * --prepare adds to the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * this includes the healthbar add a desired spot in the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void prepare()
    {
        HealthBar healthbar = new HealthBar();
        addObject(healthbar,284,38);
    }
}
