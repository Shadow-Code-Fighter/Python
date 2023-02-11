class Runnabled{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1= new Thread(new Runnabled().new Runnable1());
        t1.start();
    }
private class Runnable1 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
}