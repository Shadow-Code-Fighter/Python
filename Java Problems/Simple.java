class Table{
    synchronized void printT(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(600);
            }catch(Exception e){System.out.println(e);}
            
        }
        }
    }
    class myclass extends Thread{
        Table t;
        myclass(Table t){
            this.t=t;
        }
        public void run(){t.printT(5);}
    }
public class Simple {
        public static void main(String[] args) {
          Table t1=new Table();
          myclass m=new myclass(t1);
          m.start();
           }
        }
     
