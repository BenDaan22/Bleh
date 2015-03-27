package ie.dit;

import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet
{
	public void setup()
	{
		size(2048,500);
		//to create the player object
		objects.add(new Player(100,100)); // the player's position
		//Player objects = new Player(100,100);
	}
	
	ArrayList<GameObject> objects = new ArrayList<GameObject>();
	
	public void draw()
	{
		background(0);
		
		//to display every objects in the Game object arryalist
		for(int i = 0 ; i < objects.size(); i++)
		{
			objects.get(i).move();
			objects.get(i).display();
			
		}
	}
	public static void main(String[] args)
	{
		PApplet.main(new String[] {"--present", "ie.dit.Main"});
	}
	
}
