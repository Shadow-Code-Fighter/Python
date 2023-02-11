
class A extends Thread{
    public void run(){
        for(int i=1;i<=2;i++){
            System.out.println(i);
        }
        System.out.println("Exit A");
    }    
}
class B extends Thread{
    public void run(){
        for(int j=1;j<=2;j++){
        System.out.println(j);}
        System.out.println("Exit A");
    }
}
class ThreadTest{
    public static void main(String[] args) {
        new A().start();
        new B().start();
        
    }
}
