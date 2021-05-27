package project8;

import java.lang.*;

import java.util.Comparator;

public  class Player implements Comparable<Player> {
	  
    private String name;
    private int age;
    private String game;
    
  
    // constructor
    public Player(String name, int age,String game)
    {
        this.name = name;
        this.age = age;
        this.game=game;
    }  
    public Player() {}

    public String getName() { 
    	return name; 
    	}
  
    public int getage() {
    	return age;
    	}
    public String getGame() { 
    	return game; 
    	}
    
    @Override
	public int compareTo(Player p) {
		// TODO Auto-generated method stub
		if(name.equals(p.getName()))
    	{
    		return 0;
    	}
    	else if(game.equals(p.getGame())) {
    		return age-p.getage();
    	}
    	else {
    		return game.compareTo(p.getGame());
    	}
    	
	}
    
	@Override public String toString()
    {
        return "Name: "+name +" Age: " + age + " Game: "+game;
    }
	
	
	
}