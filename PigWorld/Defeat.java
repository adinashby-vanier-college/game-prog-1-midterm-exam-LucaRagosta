// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Defeat extends World
{

    /**
     * This method shows the text that will appear as well as the coordinates of where it will appear
     */
    public Defeat()
    {
        super(560, 560, 1);
        showTextWithBigBlackFont("You Lose", 180, 200);
    }

    /**
     * This shows the parameters of the text block, such as the font, color and message
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        
        
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(message, x, y);
    }
}
