import java.util.function.ObjIntConsumer;

/**
 * ClassName:ThreadDemo2
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/5/5 23:53
 */
public class ThreadDemo2 {
//    public static void main(String[] args) throws InterruptedException {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.print(Thread.currentThread().getName());
//                }
//            }
//        };
//        Thread t1 = new Thread(runnable);
//        Thread t2 = new Thread(runnable);
//        Thread t3 = new Thread(runnable);
//        t1.setName("A");
//        t2.setName("B");
//        t3.setName("C");
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();
//        t3.start();
//    }
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(()->{
                System.out.print("A");
            });
            Thread t2 = new Thread(()->{
                System.out.print("B");
            });
            Thread t3 = new Thread(()->{
                System.out.print("C");
            });
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
            System.out.println();
        }

    }
}
