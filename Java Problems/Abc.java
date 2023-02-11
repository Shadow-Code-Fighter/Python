import java.io.*;

class OrederOfParrameter {
    public void Student(String name, int roll){
        System.out.println("Name is: "+name+"Roll is: "+roll);
    }
    public void Student(int roll, String name){
        System.out.println("Roll is: "+roll+"Name is: "+name);
    }
}
class Abc{
    public static void main(String[]args){
        OrederOfParrameter O=new OrederOfParrameter();
        O.Student("Gaurav", 01);
        O.Student(2, "Gautam");
    }
}
