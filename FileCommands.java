import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FileCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileCommands implements MenuCommands 
{
    /**
     * excute allows allows the user to click on any of the four buttons created
     * from Menu and through this a message will displayed depending on 
     * which button is pressed.
     * 
     * @param There is a integer named idx that allows interface to run smoothly
     * with the World w. World w acts as reference.
     * 
     * @return Nothing is returned
     */
    public void execute(int idx, World w)
    {
        if( idx == 0)
        {
            System.out.println("Running New Command…");
        }
        else if( idx == 1)
        {
            System.out.println("Running Open Command…");
        }
        else if( idx == 2)
        {
            System.out.println("Running Save Command…");
        }
        else if( idx == 3)
        {
            System.out.println("Running Close Command…");
        }
        else if( idx == 4)
        {
            System.out.println("Running Exit Command…");
            Greenfoot.stop();
            System.exit(1);
        }
    }

    /**
     * Act - do whatever the FileCommands wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
