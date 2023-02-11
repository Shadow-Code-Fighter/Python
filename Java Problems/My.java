class MyThread implements Runnable{
   public void run(){
        System.out.println(Thread.currentThread().getName());
    }

   // public void start() {System.out.println("Hey");
    //}
}
class My {
    public static void main(String[]args){
        int n=4;
        for(int i=0;i<n;i++){

        

        //MyThread m=new MyThread();
        //Thread t=new Thread(m);
        //t.start();

       MyThread m1=new MyThread();
        m1.run();
    }
}}