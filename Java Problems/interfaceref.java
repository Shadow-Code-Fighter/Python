public interface Myinterface {
    public void doSomthing();

}

public class MycSlass implements Myinterface {
    public void doSomthing() {
        System.out.println("Hello moto");
    }}

public class interfaceref{

    public static void main(String[] args) {
        Myinterface inte = new Myclass();
        inte.doSomthing();

    }
}