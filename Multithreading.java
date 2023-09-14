class MyThread extends Thread{
    public void run(){
        int i = 1;
        while(i != 10){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        MyThread t2 = new MyThread();
        t2.start();
    }
}
