interface Myiner{
    void connect();
    void disconnect();
}
class OracleDB implements Myiner{
    public void connect(){

    }
    public void disconnect(){

    }
}
class sybaseDB implements Myiner{
    public void connect(){

    }
    public void disconnect(){

    }
}

class frame1{
    public static void main(String []args) throws Exception{
        Class c=Class.forName(args[0]);

        Myiner mi=(Myiner)c.newInstance();
        mi.connect();
        mi.disconnect();
     }

}