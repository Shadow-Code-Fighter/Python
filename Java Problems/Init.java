public class Init {
    {
        System.out.println("Init block");
    }
    Init(){
       
                System.out.println("Default");
    }
    Init(int a,int b){
       System.out.println("A is "+a*b);
   }
    public static void main(String []args){
   new Init(2,3);
    }

}
