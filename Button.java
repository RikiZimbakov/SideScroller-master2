import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    //private as only need to be accessed in this class
    private int fontSize;
    private String firstImage;
    private String secondImage;
    GreenfootImage text1;
    GreenfootImage text2;

    /**
     * Button sets fontSize, firstImage, secondImage to new values and also sets the image
     * of the button to look like its unpressed when the world starts.
     * modifier is public because it needs to be accessed by other classes.
     * 
     * @param There are four parameters 1 integers and three strings that set new 
     * values to fontSize, firstImage, secondImage.
     * @return Nothing is returned.
     */
    public Button(int fs, String f, String s, String t)
    {
        fontSize = fs;
        firstImage = f;
        secondImage = s;

        text1 = new GreenfootImage(t, fontSize, Color.WHITE, new Color(0,0,0,0) );
        text2 = new GreenfootImage(t, fontSize, Color.BLACK, new Color(0,0,0,0) );
        setImage(firstImage);

        getImage().drawImage(text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);

    }

    /**
     * Button sets firstImage and secondImage to new values.
     * modifier is public because it needs to be accessed by other classes.
     */
    public Button(String f, String s)
    {
        firstImage = f;
        secondImage = s;
        setImage(firstImage);
    }

    /**
     * act makes a call to handleMouseClicks each time the program is run
     * modifier is public because it needs to be accessed by other classes.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        handleMouseClicks();
    }

    /**
     * handleMouseClicks checks whether mouse has been pressed on button and if so
     * changes the colour of the button to show ite been pressed and also after the user
     * releases the button the colour goes back to the original colour.
     * Modifier is private because it only needs to display the Text in this 
     * method
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void handleMouseClicks()
    {
        if(Greenfoot.mousePressed(this))
        {
            setImage(secondImage);
            getImage().drawImage(text2,(getImage().getWidth() - text2.getWidth())/2, (getImage().getHeight() - text2.getHeight())/2);
        }
        else if(Greenfoot.mouseClicked(this))
        {
            setImage(firstImage);
            getImage().drawImage(text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
            clickedAction();
        }
    }

    /**
     * clickedAction changes the uiMainWorld to a new world and also plays sound file.
     * Modifier is private because it only needs to display the Text in this 
     * method
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void clickedAction()
    {
        GeometryDash newWorld = new GeometryDash();
        Greenfoot.setWorld( newWorld );
    }
}
