public class Test{
    static{
    System.out.println("static block1 is Executed");
   // System.exit(2);
    }
    static{
        System.out.println("static block2 is Executed");
      // System.exit(0);
        }
    public static void main(String[]args){System.out.println("main");}
    }