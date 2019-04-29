package newpackage;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 100;
		yPos = 100;
		width = 30;
		height = 50;
		color = Color.BLACK;
	}

	public Block(int x, int y) 
  {
		setPos(x,y);
		width = 30;
		height = 50;
		color = Color.BLACK;
	}
	
	public Block(int x, int y, int width)
   {
		setPos(x , y);
		setWidth(width);
		height = 50;
		color = Color.BLACK;
		
	}
	
	public Block(int x, int y, int width, int height) 
  {
		setPos(x,y);
		setWidth(width);
		setHeight(height);
		color = Color.BLACK;
	}
	
	public Block(int x, int y, int width, int height, Color color)
   {
		setPos(x,y);
		setWidth(width);
		setHeight(height);
		setColor(color);
	}
	
   //add the other set methods
   public void setPos(int x , int y) 
   {
	   setX(x);
	   setY(y);
   }
   
   public void setX(int x) 
   {
	   xPos = x;
   }
   
   public void setY(int y)
    {
	   yPos = y;
   }
   
   public void setHeight(int h)
    {
	   height = h;
   }
   
   public void setWidth(int w) 
   {
	   width = w;
   }

   public void setColor(Color col)
   {
	   color = col;

   }

   public void draw(Graphics window)
   {
    window.setColor(color);
    window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block a = (Block) obj;
		if(xPos == a.getX() && yPos == a.getY() && width == a.getWidth() && height == a.getHeight() && color.getRGB() == a.getColor().getRGB()) 
    {
			return true;
		}
		return false;
	}   

   public int getX()
    {
	   return xPos;
   }
   
   public int getY()
    {
	   return yPos;
   }
   
   public int getWidth() 
   {
	   return width;
   }
   
   public int getHeight()
    {
	   return height;
   }
   
   public Color getColor() 
   {
	   return color;
   }

   public String toString() 
   {
	   String blank = xPos + "," + yPos + "," + width + "," + height + "," + color.toString();
	   return blank;
   }
}
	
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {


   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      //window.setColor(color);
      //window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {


   }
   
	public boolean equals(Object obj)
	{




		return false;
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
}