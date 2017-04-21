
public class Main {

    public static void main(String[] args) {

        PersonaJava persona = new PersonaJava("javier");
    }

}



class PersonaJava{

    private String firstName;
    private String lastName;
    int age;

    public PersonaJava(String firstName) {
        this.firstName = firstName;
    }
}
