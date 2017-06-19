/**
 * Name: (Risto Zimbakov)
 * Teacher: Mr. Hardman
 * Assignment Final Geometry Dash
 * Date Last Modified:4/13/2017 
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GeometryDash extends World
{
    //leave all as private because only need to access this class.
    private int platformCounter = 25;
    private GreenfootSound winningSound = new GreenfootSound("trumpet .mp3");
    private GreenfootSound gameSound = new GreenfootSound("StereoMadness .mp3");
    /**
     * GeometryDash is public because it needs to be accessible by
     * everything so we set it as public
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public GeometryDash()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        //Method call to prepareWorld method which will add objects to world
        prepareWorld();

    }

    /**
     * prepareWorld plays the geometry dash song and adds objects to world to prepare the game for use
     * It also adds platforms at the bottom of the world for our mario character to walk on
     * we also add our Mario to the world here. It also added a health bar to the world.
     * The modifier is private because we only want to prepare the world in this class. 
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void prepareWorld()
    {
        gameSound.playLoop();
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
     * method will also add Spikes to the world sa random amount of times.
     * Modifier is public because it needs to be accessed by world and other classes
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */

    public void act()
    {        
        //did not use modifier here becuase only need to use variable in this method
        int obstacleType = Greenfoot.getRandomNumber(400);
        if( Greenfoot.isKeyDown("right") )
        {
            if( platformCounter >= 25 )
            {
                platformCounter = 0;
                addObject(new Platform(), getWidth()-25, getHeight()-8);
            }
            platformCounter++;
        }

        if( obstacleType < 4 )
        {

            if( obstacleType == 0)
            {
                addObject(new OneSpike(), 599, getHeight()- 28);
            }

            if( obstacleType == 1)
            {
                addObject(new TwoSpikes(), 599, getHeight()- 30);
            }

            if( obstacleType == 2)
            {
                addObject(new ThreesSpike(), 599, getHeight()- 34);
            }

            if( obstacleType == 3)
            {
                addObject(new Block(), 599, getHeight()- 34);
            }
        }

    }

    /**
     * gameOver method will display game over message and stop the scenario
     * Added white spaces in between all code
     * Modifier is public because it is accessed by other classes
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    //Add gameOver method here that will display game over message and stop the scenario
    public void gameOver()
    {
        showText("You Have been Defeated! Risto Is Better",getWidth()/2, getHeight()/2);
        stopped();
        Greenfoot.stop();       
    }

    /**
     * champion displays a message when the player wins and stops the senerio while
     * also playing the most satisfying music to the user
     * Uses public modifier because accessed by other classes
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void champion()
    {
        showText("You're Pretty Alright Buddy Guy!",getWidth()/2, getHeight()/2);
        winningSound.play();
        Greenfoot.stop();        
    }

    /**
     * prepare adds to the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * this includes the healthbar add a desired spot in the world
     * Modifier is private so only need to be accessed in this class.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void prepare()
    {
        HealthBar healthbar = new HealthBar();
        addObject(healthbar,284,38);
    }

    /**
     * stopped ends the song when you pause the program or die or win
     * Public because accessed in multiple classes
     * 
     * @param There are no parameters
     * @return nothing is returned
     */
    public void stopped()
    {
        gameSound.stop();
    }
}
