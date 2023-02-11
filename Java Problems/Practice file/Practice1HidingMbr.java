 class animal{
     protected int legs=4;
     public void speak(){
        System.out.println("Speak animals");
     }
}
class dog extends animal{
    protected int legs=6;
    @Override
    public void speak(){
        super.speak();
        System.out.println("Speak dogs");
    }
}
public class Practice1HidingMbr {
    public static void main(String[]args){
       animal A=new dog();
       A.speak();
        //System.out.println(A.legs);
        //System.out.println(super.legs);
    }
}
