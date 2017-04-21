

public class PersonaJava{

    private String firstName;
    private String lastName;
    int age;

    public PersonaJava() {}

    public PersonaJava(String firstName) {
        this.firstName = firstName;
    }

    public PersonaJava(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public PersonaJava(PersonaJava OldPersona){
        this.firstName = OldPersona.getFirstName();
        this.lastName = OldPersona.getLastName();
        this.age = OldPersona.getAge();
    }

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;    }

    public String getLastName() {return lastName;    }

    public void setLastName(String lastName) {this.lastName = lastName;    }

    public int getAge() {return age;    }

    public void setAge(int age) {this.age = age;    }

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

    @Override
    public String toString() {
        return "PersonaJava{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}