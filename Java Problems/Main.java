class Method {
    void show(){
        System.out.println("Method");
    }
    
}
class B extends Method
{
    static void show(){
        System.out.println("Derived");
    }
}
class Main{
    public static void main(String[]args){
       B m= new B();
       m.show();
       // B.show();
    }
}