class abc{
    static void m1(){
        System.out.println("base m1");
    }
}
class abc1 extends abc
{
    static void m1(){
        System.out.println("derived m1");
    }
}
class Main1{
   public static void main(String[] args) {
    abc a= new abc1();
     a.m1();
        
    }

}