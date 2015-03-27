package ie.dit;

public class Player extends GameObject
{
	float w, h; // player width and height
	float playerX, playerY;
	
	//player constructor
	Player(float x, float y)
	{
		this.playerX = x;
		this.playerY = y;
		this.w = 50;
		this.h= 50;
		
	}
	
	
	public void move()
	{
		
	}
	
	public void display()
	{
		fill(255);
		rect(playerX, playerY, w,h);
		
	}

	
	
}
