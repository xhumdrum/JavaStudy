package threadkcorenowledge.createthreads;

/**
 * 方法一： 通过实现 Runnable 接口的方式创建线程
 */
public class RunnableStyle implements Runnable{

    public static void main(String[] args) {
        RunnableStyle runnableStyle = new RunnableStyle();
        Thread thread = new Thread(runnableStyle);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("通过实现 Runnable 接口的方式创建线程");
    }
}
