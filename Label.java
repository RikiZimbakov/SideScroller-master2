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
     * Label will intiate the va
     */
    public Label(String value, int fontSize )
    {
        this.fontSize = fontSize;
        this.value = value;
        updateImage();
    }

    public Label(int v, int fontSize)
    {
        this(Integer.toString(v), fontSize);
    }

    /**
     * setValue sets value to a new string and updates the image as well
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
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void updateImage()
    {
        setImage( new GreenfootImage(value, fontSize, fillColor, TRANSPARENT, lineColor) );
    }

    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
