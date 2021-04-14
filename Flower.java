import ecs100.*;
import java.awt.Color;
/**
 * Flower support class
 * Creates a flower of a size and color
 * can grow
 *
 * @author Regan Meynell
 * @version 15/04/21
 */
public class Flower
{
    // instance variables - replace the example below with your own
    private double flowerX = -100; // x position of the flower
    private double flowerY = -100; // y position of the flower
    
    private int flowerSize;     // flower Size
    private int flowerHeight;    // flower height
    
    private double left;        // left side of the flower
    private double top;     // top of flower
    private double bottom;  // bottom of flower
    
    private Color color;    //color of flower

    /**
     * Constructor for objects of class Flower
     */
    public Flower(double x, double y, int size, int stem, Color col)
    {
        // initialise instance variables
        this.flowerX = x;
        this.flowerY = y;
        this.flowerSize = size;
        this.flowerHeight = stem;
        this.color = col;
        
        // set the top, left, and bottom
        this.setTop();
        this.setLeft();
        this.setBottom();
    }
    
    /**
     * Set left
     */
    public void setLeft() {
        this.left = this.flowerX - this.flowerSize/2.0;
    }
    
    /**
     * Set top
     */
    public void setTop() {
        this.top = this.flowerY - this.flowerSize/2.0;
    }
    /**
     * Set bottom
     */
    public void setBottom() {
        this.bottom = this.flowerY - this.flowerHeight;
    }
    
    /**
     * Draw the flower on screen
     */
    public void draw() {
        // draw stem
        UI.setColor(Color.green);   // set color of stem
        UI.setLineWidth(2);         // set width of stem
        UI.drawLine(flowerX, flowerY, flowerX, bottom); // draw in stem
        
        // draw flower
        UI.setColor(this.color);    // set color of flower
        UI.fillOval(left, top, flowerSize, flowerSize); // draw the flower
        UI.sleep(500);              // wait
    }
    
    /**
     * Erase a rectangle around the current obj
     */
    public void erase() {
        UI.eraseRect(left, top, flowerSize+1, bottom+1);
    }
    
    /**
     * Make the flower grow
     */
    public void grow() {
        this.erase();
        this.flowerY -= 10;     // increase the height
        this.flowerSize += 10;  // increase the bulb
        
        // set the new position
        this.setTop();
        this.setLeft();
        this.draw();
    }
}
        

