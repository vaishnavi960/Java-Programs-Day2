package project8;

import java.util.TreeSet;

class PlayerSort {
	 public static void main(String args[])
	 {
		 System.out.println("Player Details After Sorting:");
	     TreeSet<Player> play= new TreeSet<>();
	    // add objects to the TreeSet
	    play.add(new Player("Abhay",28,"Hockey"));
	    play.add(new Player("Arun",22,"Golf"));
	    play.add(new Player("Ajay",25,"Football"));
	    // adding an object with same name so its restricting in output
	    play.add(new Player("Arun",24,"Football"));
	     // printing the TreeSet
	     for (Player p : play) {
	         System.out.println(p);
	     }
	 }
}
