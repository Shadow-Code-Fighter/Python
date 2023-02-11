public class Chaining {
    Chaining(){
        this(5);
        System.out.println("First construcor");
    }
    Chaining(int a){
        this(7,3);
        System.out.println(a);
    }
    Chaining(int x, int y){
        System.out.println(x*y);
    }
    public static void main(String[]args){
        new Chaining();
    }
}
