package project7;

public class ThreadSecond extends Thread{

Thread t;
ThreadSecond(){
t=new Thread(this);
t.start();
}

public void run() {
for(int j=3;j<6;j++) {
System.out.println("ThreadSecond : " +j);

}
}

}