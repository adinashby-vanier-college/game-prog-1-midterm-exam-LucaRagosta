// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        loss();
        pigtouch();
    }

    /**
     * This method makes it so that when the game is lost it transitions to the defeat screen
     */
    public void loss()
    {
        if (isGameLost()) {
            transitionToDefeat();
        }
    }

    /**
     * This is the random movement generator. it makes the snake move at a speed f 4 but randomly switch directs 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * This method makes  it so that when the snake touches the pig, the pig perishes and dissapears. It also plays the lose noise
     */
    public void pigtouch()
    {
        Actor pig = getOneIntersectingObject(Pig.class);
        if (pig != null) {
            World world = getWorld();
            world.removeObject(pig);
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * This method makes it so that if the pig ceases to exist in the world, then it wold return a true value to the game being lost. This information goes to the following method "transitionToDefeat" and causes the defeat screen to appear
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToDefeat()
    {
        World Defeat =  new Defeat();
        Greenfoot.setWorld(Defeat);
    }
}
