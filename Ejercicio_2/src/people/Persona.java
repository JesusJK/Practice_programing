
package people;

public class Persona {
    private String name;
    private String lastname;
    private String fullname;
    private int age;

    public Persona(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        createrFullName(name, lastname);
    }

   
    private void createrFullName(String name, String lastname) {
        this.fullname = name + " " + lastname;
    }

    public String getFullname() {
        return fullname;
    }
    
    public int getAge() {
        return age;
    }

   
    
    

    
    
}
