// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new Burger();
        addObject(burger, 191, 173);
        Burger burger2 =  new Burger();
        addObject(burger2, 316, 234);
        Burger burger3 =  new Burger();
        addObject(burger3, 466, 115);
        Pig pig =  new Pig();
        addObject(pig, 184, 249);
        Snake snake =  new Snake();
        addObject(snake, 489, 239);
    }
}
