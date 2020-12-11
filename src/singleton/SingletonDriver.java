package singleton;

import sun.awt.windows.WPrinterJob;

public class SingletonDriver {
    public static void main(String[] args) {
        Singleton classSingleton1 = Singleton.getInstance();

        System.out.println(classSingleton1.getInfo()); //Initial class info

        Singleton classSingleton2 = Singleton.getInstance();
        classSingleton2.setInfo("New class info");

        System.out.println(classSingleton1.getInstance() + " " + classSingleton1.getInfo()); //New class info
        System.out.println(classSingleton2.getInstance() + " " + classSingleton2.getInfo()); //New class info;

        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());
        firstThread.start();
        secondThread.start();
    }

    static class FirstThread implements Runnable {

        @Override
        public void run() {
            DclSingleton singleton = DclSingleton.getInstance("First");
            System.out.println(singleton.getValue());
        }
    }

    static class SecondThread implements Runnable {

        @Override
        public void run() {
            DclSingleton singleton = DclSingleton.getInstance("Second");
            System.out.println(singleton.getValue());
        }
    }
}
