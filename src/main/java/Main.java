import util.StringUtil;

public class Main {

    public static void main(String[] args) {

        PersonaJava persona = new PersonaJava("Javier");
        final PersonaJava persona2 = new PersonaJava(persona); // copy
        final PersonaJava persona3 = new PersonaJava(persona); // copy
        persona3.setLastName("Gomez");

        if(persona.equals(persona2))
            System.out.println("Hello "+persona.getFirstName());
        else
            System.out.println("not equal");

        if(!persona.equals(persona3))
            System.out.println("old "+persona.getLastName()+" new "+persona3.getLastName());

        for(int i=0;i < 3 ;i++){
            StringUtil.coffeNow("zz "+i+" zz");
        }

        // No equivalent to infix function

        PersonKT personKT = new PersonKT("Pepe","Perez",20);
        System.out.println("Kotlin: "+personKT.toString());

        personKT.specialConstructor("Pedro");// method Overload

    }

}


