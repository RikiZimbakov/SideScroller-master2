import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class TextBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBox extends Actor
{
    //private because only need to be accessed in this class.
    private GreenfootImage img;
    private boolean border = false;
    private int fontSize;
    private Color foreground;
    private Color background;

    /**
     * TextBox will set border, fontSize, foreground and background to
     * new integer, boolean, and colour values of the textbox. 
     * modifier is public because it needs to be accessed by other classes.
     * 
     * @param There are five parameters message setting the writing and size
     * and many other aspects of the texbox and the others are just setting new
     * values for border, fontSize, foreground and background as previously stated
     * @return Nothing is returned
     */
    public TextBox(String message,int fs, boolean b, Color fg, Color bg )
    {
        border = b;
        fontSize = fs;
        foreground = fg;
        background = bg;

        img = ( new GreenfootImage(message, fontSize, foreground, background) );
        displayMethod();
    }

    /**
     * setText sets img to a new greenfootImge so it allows the user to change 
     * the message of the Textbox, also makes sure we display the method
     * by making a call to displayMethod.
     * modifier is public because it needs to be accessed by other classes.
     * 
     * @param There is a string named message that allows TextBox to be set as
     * a new string message
     * @return Nothing is returned
     */
    public void setText(String message)
    {
        img = ( new GreenfootImage(message, fontSize, foreground, background) );
        displayMethod();
    }

    /**
     * displayMethod sets the image to img and also checks whether border is true 
     * and if this statement is true then it turns te color of img to black and
     * draws a rectangle on top of img at the correct cordinates.
     * Modifier is private because it only needs to display the Text in this 
     * method
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void displayMethod()
    {
        setImage(img);
        if( border == true)
        {
            img.setColor(Color.BLACK);
            img.drawRect(0, 0, img.getWidth() - 1, img.getHeight() - 1);
            setImage(img);
        }

    }   
}
