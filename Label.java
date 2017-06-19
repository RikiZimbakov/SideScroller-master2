import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

public class Label extends Actor
{
    // private because it only needs to be accessed in this class
    private String value;
    private int fontSize;
    private Color lineColor = Color.BLACK;
    private Color fillColor = Color.WHITE;
    private final Color TRANSPARENT = new Color(0,0,0,0);

    /**
     * Label will set the fontSize and the value of the label as well while
     * also updating the image. Modifier is public because it needs to be
     * accessed in more then one class
     * 
     * @param There are two parameters. A string named value that sets the
     * value of the label and an integer named fontsize that sets the size
     * of the label
     * @return Nothing is returned
     */
    public Label(String value, int fontSize )
    {
        this.fontSize = fontSize;
        this.value = value;
        updateImage();
    }

    /**
     * Label Changes the integer v to a String value that will represent value 
     * of Label. Modifier is public because it has to be accessed by other classes
     * 
     * @param There are two parameters one named v that will be changed to a string
     * and fontSize that will initiate the size of label
     * @return Nothing is returned
     */
    public Label(int v, int fontSize)
    {
        this(Integer.toString(v), fontSize);
    }

    /**
     * setValue sets value to a new string and updates the image as well
     * Modifier is public because it has to be accessed by other classes
     * 
     * @param There is a string named newValue that allows value to be set as
     * a new string
     * @return Nothing is returned
     */
    public void setValue(String newValue)
    {
        value = newValue;
        updateImage();
    }

    /**
     * setValue sets value to a new integer and updates the image as well
     * Modifier is public because it has to be accessed by other classes
     * 
     * @param There is a integer named v that allows value to be set as
     * a new integer
     * @return Nothing is returned
     */
    public void setValue(int v)
    {
        value = Integer.toString(v);
        updateImage();
    }

    /**
     * setLineColor sets lineColor to a new color and updates the image as well
     * Modifier is public because it has to be accessed by other classes
     * 
     * @param There is a color named l that allows lineColor to be set as
     * a new color
     * @return Nothing is returned
     */
    public void setLineColor(Color l)
    {
        lineColor = l;
        updateImage();
    }

    /**
     * setFillColor sets fillColor to a new color and updates the image as well
     * Modifier is public because it has to be accessed by other classes
     * 
     * @param There is a color named f that allows fillColor to be set as
     * a new color
     * @return Nothing is returned
     */
    public void setFillColor(Color f)
    {
        fillColor = f;
        updateImage();
    }

    /**
     * updateImage sets the image to a new greenfootimage with all of the updated 
     * values, fontsizes, and colors the user desires.
     * Modifier is private because it only needs to update the label in 
     * this class
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void updateImage()
    {
        setImage( new GreenfootImage(value, fontSize, fillColor, TRANSPARENT, lineColor) );
    } 
}