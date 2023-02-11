public class Instance {
    public String Name;
    public Instance(){
        this.Name="Gaurav Sharma";
    }
    public static void main(String[]args){
        Instance name=new Instance();
        System.out.println("Name is: "+name.Name);
    }
}
