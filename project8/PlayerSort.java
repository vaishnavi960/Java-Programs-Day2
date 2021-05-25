package project8;

import java.util.TreeSet;

class PlayerSort {
	 public static void main(String args[])
	 {
		 System.out.println("Player Details After Sorting:");
	     TreeSet<Player> play= new TreeSet<>(new Player());
	    // add objects to the TreeSet
	    play.add(new Player("Abhay",22,"Football"));
	    play.add(new Player("Arun",30,"Golf"));
	    play.add(new Player("Ajay",18,"Hockey"));
	    // adding an object with same id
	    play.add(new Player("Arun",32,"Football"));
	     // printing the TreeSet
	     for (Player p : play) {
	         System.out.println(p);
	     }
	 }
}
