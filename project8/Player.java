package project8;

import java.lang.*;

import java.util.Comparator;

public  class Player implements Comparator<Player> {
	  
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
	public int compare(Player p1, Player p2) {
    
    	int compar =p1.getGame().compareTo(p2.getGame());
        
  
            if (compar == 0) {
            	if (p1.getage() == p2.getage()) {
                    return 0;
                }
                else if (p1.getage() < p2.getage()) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            	 
        if ( compar > 0) {
            return  1;
        }
 
        else {
        	return -1;
        }
    }
   
    
	@Override public String toString()
    {
        return "Name: "+name +" Age: " + age + " Game: "+game;
    }
	
		// TODO Auto-generated method stub
	
}
