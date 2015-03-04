
package threadhw;


public class ThreadHW {


    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread mt = new MyThread("Tom");
        mt.start();
        MyThread mt2 = new MyThread("Bob");
        mt2.start();
    }
    
}
