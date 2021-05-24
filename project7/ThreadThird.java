package project7;


public class ThreadThird extends Thread{

Thread t;
ThreadThird(){
t=new Thread(this);
t.start();
}

public void run() {
for(int k=6;k<9;k++) {
System.out.println("ThreadThird : " +k);

}

}

}
