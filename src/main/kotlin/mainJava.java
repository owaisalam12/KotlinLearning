import java.io.IOException;

public class mainJava {


    public static void main(String[] args) {
      //  System.out.println("hello :"+main.Companion.foo());
       // main.Companion.sum(1,2,4);
        try {
            main.Companion.foo1();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringUtilKt.repeat();

    }

    public static void foo(){
        System.out.println("Foo: Bar");
    }

}
