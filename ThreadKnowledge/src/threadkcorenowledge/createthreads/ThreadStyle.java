package threadkcorenowledge.createthreads;

/**
 * 方法二： 通过继承 Thread 来创建线程
 */
public class ThreadStyle extends Thread {

    public static void main(String[] args) {
        ThreadStyle threadStyle = new ThreadStyle();
        threadStyle.start();
    }

    @Override
    public void run() {
        System.out.println("通过继承 Thread 来创建线程");
    }
}
