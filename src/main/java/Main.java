
public class Main {

    public static void main(String[] args) {

        // without @JvmStatic() notation
        int count = PersonKT.Companion.staticMethodCountLetters("Javier");
        int foo = PersonKT.Companion.getFOO();

        // with @JvmStatic() notation
        // int count = PersonKT.staticMethodCountLetters("Javier");
        //int foo = PersonKT.FOO;

        System.out.println("count: "+count);
        System.out.println("foo: "+foo);

    }

}


