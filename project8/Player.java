package project8;

public class Player implements Comparable<Player> {

String name;
int age;
String game;


public Player(String name,int age,String game) {

this.name=name;
this.age=age;
this.game=game;
}



@Override
public int compareTo(Player p) {
// TODO Auto-generated method stub
if(game.equals(p)) {


p.sort(age);
}
return age;
}



private void sort(int age2) {
	// TODO Auto-generated method stub
	
}
}