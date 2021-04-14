/* Based on the ecs 100 template
 * Code for ??
 * Name: Regan Meynell
 * Date: 15/04/21
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;


/** <description of class Garden>
 */
public class Garden{
    
    // Fields
    private Flower f1 = new Flower(50,100,20, 50, Color.blue);
    private Flower f2 = new Flower(100, 100, 30, 50, Color.green);
    private Flower f3 = new Flower(150, 100, 10, 50, Color.red);
    
    public Garden(){
    UI.initialise();
    UI.addButton("Grow", this::growGarden);
    UI.addButton("Quit", UI::quit);
    }
    
    /**
     * Script to animate the objects
     */
    private void growGarden() {
        f1.draw();
        f2.draw();
        f3.draw();
        f1.grow();
        f2.grow();
        f1.grow();
        f3.grow();
        f2.erase();
    }

    public static void main(String[] args){
        Garden obj = new Garden();
    }

}

