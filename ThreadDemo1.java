/**
 * ClassName:ThreadDemo1
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/5/5 23:04
 */
public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.setName("a");
        t2.setName("b");
        t3.setName("c");
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();

    }
}
