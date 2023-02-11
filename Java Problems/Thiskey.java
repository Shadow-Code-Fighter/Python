public class Thiskey {
    int g,k;
    Thiskey(int a, int b){
        this.g=a;
        this.k=b;
    }
    void display(){
        System.out.println("a is: "+g+"\nb is: "+k);
    }
    public static void main(String []args){
        Thiskey t1=new Thiskey(10, 20);
        t1.display();
    }
}
