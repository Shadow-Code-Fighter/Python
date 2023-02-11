interface i1 {
    final int a = 10;

    void display();
}

public class Int1 implements i1 {
    public void display() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Int1 t = new Int1();
        t.display();
        System.out.println(a);
    }
}
