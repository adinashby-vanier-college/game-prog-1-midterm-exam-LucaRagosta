// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * This method executes every other method in the list, if i were to forget to write one of these three down then the game wouldnt function with its intended purpose
     */
    public void act()
    {
        moveAndTurn();
        eat();
        victorycon();
    }

    /**
     * This methos is used to transition to the victory screen and play the win sound after 
     */
    public void victorycon()
    {
        if (isGameWon()) {
            Greenfoot.playSound("win.wav");
            transitionToVictory();
        }
    }

    /**
     * This method is used to make the pig eat the burger as well as play the noise when it does so
     */
    public void eat()
    {
        Actor Burger = getOneIntersectingObject(Burger.class);
        if (Burger != null) {
            World world = getWorld();
            world.removeObject(Burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * This method is used to control the movement of the pig within the world
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("W")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("S")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("A")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("D")) {
            turn(3);
        }
    }

    /**
     * 
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToVictory()
    {
        World Victory =  new Victory();
        Greenfoot.setWorld(Victory);
    }
}
