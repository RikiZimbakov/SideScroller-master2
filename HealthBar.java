import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

public class HealthBar extends Actor
{
    private GreenfootImage frame;
    private GreenfootImage healthBar;

    private Color good;
    private Color warning;
    private Color danger;

    private int target;
    private int current;
    private int max;
    private int speed;

    private double ratio;
    private int healthWidth;

    public HealthBar()
    {
        frame = new GreenfootImage(200,30);
        frame.setColor(Color.GRAY);
        frame.fillRect(0, 0, 200, 30);

        healthBar = new GreenfootImage(200,30);
        healthBar.setColor(Color.GRAY);
        healthBar.fillRect(0, 0, 200, 30);

        good = Color.GREEN;
        warning = Color.YELLOW;
        danger = Color.RED;
        max = 1000;
        current = 1000;
        target = current;
        speed = 1;
        updateBar();
    }

    public HealthBar( int c, int m, int s)
    {
        frame = new GreenfootImage(200,30);
        frame.setColor(Color.GRAY);
        frame.fillRect(0, 0, 200, 30);

        healthBar = new GreenfootImage(200,30);
        healthBar.setColor(Color.GRAY);
        healthBar.fillRect(0, 0, 200, 30);

        good = Color.GREEN;
        warning = Color.YELLOW;
        danger = Color.RED;
        max = m;
        current = c;
        target = current;
        speed = s;
        updateBar();
    }

    public HealthBar( int c, int m, int s, Color g, Color w, Color d)
    {
        frame = new GreenfootImage(200,30);
        frame.setColor(Color.GRAY);
        frame.fillRect(0, 0, 200, 30);

        healthBar = new GreenfootImage(200,30);
        healthBar.setColor(Color.GRAY);
        healthBar.fillRect(0, 0, 200, 30);

        good = g;
        warning = w;
        danger = d;
        max = m;
        current = c;
        target = current;
        speed = s;
        updateBar();
    }

    /**
     * act will check if the current score is less then your desired score
     * add the appropriate amount to your health bar and vice versa 
     * It also makes a call to update bar so it updates the health bar every single
     * time a button is pressed
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {                  
        if(current < target)
        {
            current += speed;
            if( current > target)
            {
                current = target;
            }
        }
        else
        {
            current -= speed;
            if( current < target)
            {
                current = target;
            }
        }
        if( current <= 0)
        {
            ScrollerWorld myWorld = (ScrollerWorld)getWorld();
            myWorld.gameOver();
        }
        updateBar();
    }

    /**
     * updateBar will check if the health of the of your bar is above half
     * and change its color to green accordingly. For less then half but 
     * greater then one fourth it will remain yellow and anything less then that
     * and the health bar will turn the color red. It also resets the color each time
     * and sets the font to time new roman. It also adds the score accordingly.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void updateBar()
    {
        GreenfootImage text = new GreenfootImage(200,30);
        double ratio = current/(max*1.0);
        healthWidth = (int)Math.round(ratio * frame.getWidth());
        if(current > max/2)
        {
            healthBar.setColor(good);
        }
        else if(current > max/4)
        {
            healthBar.setColor(warning);
        }
        else
        {
            healthBar.setColor(danger);
        }

        healthBar.clear();
        healthBar.fillRect(0, 0, healthWidth, 30);

        text.clear();
        text.setColor(Color.BLACK);

        text.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        text.drawString(current + "/" + max, 0, 30 - text.getFont().getSize()/2);

        frame.clear();
        frame.setColor(Color.GRAY);
        frame.fillRect(0, 0, 200, 30);
        frame.drawImage(healthBar, 0, 0);
        frame.drawImage(text, frame.getWidth()/3, 0);

        setImage(frame);
    }

    /**
     * add will make sure that your health bar never reads lower then zero or 
     * higher then your max and also makes sure to add the change of your target
     * score accordingly
     * 
     * @param an integer is returned that is responsible for changing your target 
     * score each time
     * @return Nothing is returned
     */
    public void add(int change)
    {
        target = target + change;
        if(target > max)
        {
            target = max;
        }
        else if(target < 0)
        {
            target = 0;
        }
    }

    /**
     * setTarget equads target to be equal to an integer t
     * 
     * @param an integer t that gives the user the potential to change the 
     * target value to whatever is desired
     * @return Nothing is returned
     */
    public void setTarget(int t)
    {
        target = t;
    }

    /**
     * setCurrent equads current to be equal to an integer c
     * 
     * @param an integer c that gives the user the potential to change the 
     * current value to whatever is desired
     * @return Nothing is returned
     */
    public void setCurrent( int c)
    {
        current = c;
    }

    /**
     * setMax equads target to be equal to an integer m
     * 
     * @param an integer m that gives the user the potential to change the 
     * target m to whatever is desired
     * @return Nothing is returned
     */
    public void setMax(int m)
    {
        max = m;
    }

    /**
     * setSpeed equads target to be equal to an integer s
     * 
     * @param an integer s that gives the user the potential to change the 
     * speed value to whatever is desired
     * @return Nothing is returned
     */
    public void setSpeed(int s)
    {
        speed = s;
    }

    /**
     * getMax returns the value of the maximum
     * 
     * @param There are no parameters
     * @return an integer max is returned
     */
    public int getMax()
    {
        return max;
    }

    /**
     * getCurrent returns the value of the current
     * 
     * @param There are no parameters
     * @return an integer currrent is returned
     */
    public int getCurrent()
    {
        return current;
    }
}
