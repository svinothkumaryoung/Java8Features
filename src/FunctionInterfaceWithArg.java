interface in1
{
    void getData(String n);
}

public class FunctionInterfaceWithArg {
    static in1 i=(b)->
    {
        System.out.println("The Value u recieved is "+b);
    };

    public static void main(String[] args) {
        i.getData("Java 8");
    }
}
