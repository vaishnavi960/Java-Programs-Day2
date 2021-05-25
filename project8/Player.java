package project8;

import java.util.Comparator;

public class Player implements Comparator<Player> {
	  
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
    public  int compare(Player p1, Player p2)
    {
        if (p1.getGame().hashCode() == p2.getGame().hashCode()) {
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
        else if(p1.getGame().hashCode() < p2.getGame().hashCode())
        {
        	return 1;
        }
        else {
            return -1;
        }
    }
  
    @Override public String toString()
    {
        return "Name: "+name +" Age: " + age + " Game: "+game;
    }
}