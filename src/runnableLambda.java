public class runnableLambda {
    public static void main(String[] args) throws InterruptedException {

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 3; i++) {
//                    System.out.println("Hola soy el hilo" +
//                            Thread.currentThread().getName() +
//                            "|");
//                }
//            }
//        };

        Runnable runnable = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hola soy el hilo" +
                        Thread.currentThread().getName() +
                        "|");
            }
        };


        Thread myThread = new Thread(runnable);
        Thread myThread2 = new Thread(runnable);
        Thread myThread3 = new Thread(runnable);
        Thread myThread4 = new Thread(runnable);
        Thread myThread5 = new Thread(runnable);

        myThread.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();

        myThread.join();
        myThread2.join();
        myThread3.join();
        myThread4.join();
        myThread5.join();
    }
}
