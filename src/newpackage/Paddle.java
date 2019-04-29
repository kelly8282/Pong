package newpackage;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
      speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y) 
   {
	   super(x,y);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int speed)
    {
	   super(x,y);
	   setSpeed(speed);
   }
   
   public Paddle(int x, int y, int width, int height) 
   {
	   super(x,y,width,height);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int width, int height, Color color) 
   {
	   super(x,y,width,height,color);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int width, int height, int speed) 
   {
	   super(x,y,width,height);
	   setSpeed(speed);
   }
   
   public Paddle(int x, int y, int width, int height, Color color, int speed)
    {
	   super(x,y,width,height,color);
	   setSpeed(speed);
   }
   
   public void setSpeed(int s) 
   {
	   speed = s;
   }
   
   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY()-speed);
	   draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY()+speed);
	   draw(window);
   }

 
   public int getSpeed() 
   {
	   return speed;
   }
   
   

	public String toString() 
  {
		String blank =super.toString()+"," + getSpeed();
		return blank;
	}
}






   public void moveUpAndDraw(Graphics window)
   {


   }

   public void moveDownAndDraw(Graphics window)
   {


   }

   //add get methods
   
   
   //add a toString() method
}