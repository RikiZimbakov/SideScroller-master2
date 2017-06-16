import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Name: (Risto Zimbakov)
 * Teacher: Mr. Hardman
 * Assignment: Final Assignment Geometry Dash
 * Date Last Modified: 6/17/2017
 */
public class UIMainWorld extends World
{
    /**
     * UIMainWorld sets the world to the appropriate size and also 
     * makes the world run so the user does not have to click run 
     * everytime
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        testActors();
        Greenfoot.start();
    }

    /**
     * testActors adds a button, label, textbox, and Menu to world location of the 
     * users choosing. We only need to access this method inside this class there
     * for it is private
     * 
     * @param There are no Parameters
     * @return Nothing is returned
     */
    private void testActors()
    {
        addObject( new Button(15,"button-green.png", "button-blue.png", "IF\nYOU DARE" ),300, 160);
        addObject( new Menu("File","New\nOpen\nSave\nClose\nExit",24, Color.BLACK, Color.RED, Color.BLUE, Color.YELLOW, new FileCommands()),550, 20);
        addObject( new TextBox("Are You Ready for a Challenge",45, false, Color.WHITE, Color.RED),300, 250);
        addObject( new Label("Impossible Game",40),300,100);        
    } 
}

