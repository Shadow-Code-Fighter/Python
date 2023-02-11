class invalid extends Exception {
    public invalid(String msg){
        super(msg);}
}

class Different {
    public static void checkage(int age) throws invalid {
        if (age < 18) {
            throw new invalid("age must be grater then age"d);
        }
    }

    public static void main(String[] args) {
        try {
            checkage(14);
        } catch (invalid e) {
            System.out.println(e.getMessage());
        }
    }
}