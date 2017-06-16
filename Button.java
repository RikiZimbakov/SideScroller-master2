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
    private int fontSize;
    private String firstImage;
    private String secondImage;
    GreenfootImage text1;
    GreenfootImage text2;

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

    public Button(String f, String s)
    {
        firstImage = f;
        secondImage = s;
        setImage(firstImage);
    }

    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleMouseClicks();
    }

    /**
     * handleMouseClicks checks whether mouse has been pressed on button and if so
     * changes the colour of the button to show ite been pressed and also after the user
     * releases the button the colour goes back to the original colour.
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
