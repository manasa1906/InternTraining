package com.Intern1906.Spring_Freamework.game;

public class gameRunner 
{
	private gamingConsole game;
	public gameRunner(gamingConsole game)
	  {
		  this.game=game;
	  }

public void run() {
	System.out.println("Running game:"+game);
	game.up();
	game.down();
	game.left();
	game.right(); 
}
}
