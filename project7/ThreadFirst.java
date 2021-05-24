package project7;
public class ThreadFirst implements Runnable{

Thread t;
ThreadFirst(){
t=new Thread(this);
t.start();
}

public void run() {
for(int i=1;i<3;i++) {
System.out.println("ThreadFirst: " +i);

}
}

}