public class Overloading {
    int Overloading(int a,int b){
       return (a+b);
    }
    double Overloading(double x,double y){
        return (x*y);
    }
    public static void main(String []args){
        Overloading obj=new Overloading();
        System.out.println(obj.Overloading(2, 3));
        System.out.println(obj.Overloading(3.0,2.0));
    }
}
