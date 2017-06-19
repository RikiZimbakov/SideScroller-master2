import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    //private because only need to be accessed in this class
    private TextBox titleBar;
    private TextBox menuItems;
    private MenuCommands menuCommands;
    private int fontSize = 24;
    private boolean visible = false;
    private Color mainFG;
    private Color mainBG;
    private Color secondFG;
    private Color secondBG;
    private int titleHeight;
    private int menuHeight;

    /**
     * Menu sets integers, strings, colors and menuCommands to new values accordingly
     * modifier is public because it needs to be accessed by other classes.
     * 
     * @param There are integers, strings, colors and menuCommands that set new values of corresponding
     * partners.
     * @return Nothing is returned.
     */
    public Menu(String tb, String items, int fs, Color fgMain, Color bgMain, Color fgSecond, Color bgSecond, MenuCommands mc)
    {
        fontSize = fs;
        mainFG = fgMain;
        mainBG = bgMain;
        secondFG = fgSecond;
        secondBG = bgSecond;
        menuCommands = mc;

        titleBar = new TextBox(tb, fontSize, true, mainFG, mainBG); 
        menuItems = new TextBox(items, fontSize, true, secondFG, secondBG);
    }

    /**
     * Menu sets various attributes of menu including its colors
     * modifier is public because it needs to be accessed by other classes.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public Menu()
    {
        this("not initialized", "none", 24, Color.BLACK, Color.lightGray, Color.BLACK, Color.WHITE, null);
    }

    /**
     * addedToWorld adds the titleBar object to World and sets the image of 
     * titleBar with the correct height.
     * modifier is public because it needs to be accessed by other classes.
     * 
     * @param World w allows objects to be added to it from this class.
     * @return Nothing is returned
     */
    public void addedToWorld(World w)
    {
        w.addObject(titleBar, getX(), getY());
        titleHeight = (titleBar.getImage().getHeight());
        menuHeight = (menuItems.getImage().getHeight());
    }

    /**
     * HandleMouse checks whether the mouse was clicked on the title bar. 
     * If so, then checks whether visible is false. If visible is false, 
     * adds the menu items to the world. otherwise removes the menu objects from 
     * the world. Also checks whether mouse is clicked on the the menuItems and makes
     * the appropriate actions.
     * modifier is public because it needs to be accessed by other classes.
     * 
     * @param There are no Parameters
     * @return Nothing is returned
     */
    private void handleMouse()
    {
        MouseInfo mi;
        int menuIndex;
        int x;
        int y;
        if( Greenfoot.mouseClicked(titleBar) == true)
        {
            if ( visible == false)
            {
                getWorld().addObject(menuItems, getX(), getY() +  (titleHeight + menuHeight)/2);
            }
            else
            {
                getWorld().removeObject(menuItems);
            }
            visible =!(visible); 
        }

        if( Greenfoot.mouseClicked(menuItems) == true)
        {
            mi = Greenfoot.getMouseInfo();
            menuIndex =( (mi.getY() - menuItems.getY() + menuHeight / 2) - 1 ) / fontSize;
            menuCommands.execute(menuIndex, getWorld());
            visible =!(visible);
            getWorld().removeObject(menuItems);
        }

    }

    /**
     * act does whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. It handles the mouse
     * modifier is public because it needs to be accessed by other classes.
     * 
     * @param There are no parameters
     * @return Nothing is returned.
     */
    public void act() 
    {
        handleMouse();
    }    
}
