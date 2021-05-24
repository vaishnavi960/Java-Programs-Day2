package project8;


import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PlayerSort {

public static void main(String[] args) {
// TODO Auto-generated method stub


SortedSet<Player> set = new TreeSet<Player>();
Player p1=new Player("abhay",20,"Football");
Player p2=new Player("anushka",26,"Football");
Player p3=new Player("anup",28,"Hockey");

set.add(p1);
set.add(p2);
set.add(p3);

for(Player p:set) {
System.out.println(p.name + " " + p.age + " " + p.game);

}
}
}
