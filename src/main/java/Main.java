
public class Main {

    public static void main(String[] args) {

        PersonKT persona = new PersonKT();

        String name =  (persona.getFirstName() !=null) ? persona.getFirstName() : "Elvis Operator";

        System.out.println("name is: "+ name);

    }

}

