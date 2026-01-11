//class Task extends Thread{
//    public void run() {
//        for(int i=0;i<10;i++){
//            try{
//                Thread.sleep(200);
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//
//            System.out.println("Hello From"+Thread.currentThread().getName());
//        }
//
//    }
//}
//


//class Task implements Runnable{
//    public void run() {
//        for(int i=0;i<10;i++){
//            try{
//                Thread.sleep(200);
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//
//            System.out.println("Hello From "+Thread.currentThread().getName());
//        }
//
//    }
//}



//public class MultiThreadingDemo {
//    static void main() throws Exception {
//        Runnable task1 = new Task();
//        Task task2 = new Task();
//        Thread t1 = new Thread(task1);
//        Thread t2 = new Thread(task2);
//        t1.setName("Task 1 ");
//        t2.setName("Task 2 ");
//        t1.start();
//        t2.start();
//    }
//}

public class MultiThreadingDemo {
    public static void doTask() {
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(200);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            System.out.println("Hello From "+Thread.currentThread().getName());
        }

    }
    static void main() throws Exception {
        Thread t1 = new Thread(()->doTask()); // As the class is Functional Interface we can use lambda Expression
        Thread t2 = new Thread(()->doTask());
        t1.setName("Task 1 ");
        t2.setName("Task 2 ");
        t1.start();
        t2.start();
    }
}
