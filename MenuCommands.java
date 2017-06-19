import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface MenuCommands
{
    /**
     * excute allows the interface of the class to become more formal by
     * making a contact between the class and the outside world. This is 
     * enforced by the build time of the compiler.
     * modifier is public because it needs to be accessed by other classes.
     * 
     * @param There is a integer named idx that allows the interface to run smoothly
     * with the World w. World w acts as a reference.
     * 
     * @return Nothing is returned
     */
    public void execute(int idx, World w);
}
