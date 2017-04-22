import util.StringUtil;

public class Main {

    public static void main(String[] args) {

        PersonaJava persona = new PersonaJava("Javier");
        final PersonaJava persona2 = persona.copy(); // copy
        final PersonaJava persona3 = persona.copy("Gomez"); // copy
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

    }

}



class PersonaJava{

    private String firstName;
    private String lastName;
    int age;

    public PersonaJava(String firstName) {
        this.firstName = firstName;
    }

    public PersonaJava(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public PersonaJava copy(){
        return new PersonaJava(firstName,lastName,age);

    }

    public PersonaJava copy(String lastName){
        return new PersonaJava(firstName,lastName,age);

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonaJava that = (PersonaJava) o;

        if (age != that.age) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        return lastName != null ? lastName.equals(that.lastName) : that.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
