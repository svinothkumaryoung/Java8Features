import java.util.Scanner;

interface inter{
    void getData(String n,int m);
}


public class FunctionInterfaceWithTwoArg {
    static inter in=(a,b)->{
       System.out.println("Name is "+ a +" Year is "+b);
    };

    public static void main(String[] args) {
        in.getData("Java 8",2021);
    }
}
