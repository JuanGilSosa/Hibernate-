package principal.mysql.hibernate.Models;

public class Person {
    private String name;
    private String surname;
    private Integer age;

    public Person(String name, String surname, Integer age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "----------------Persona---------------" +
                "\nNombre    = " + name +
                "\nApellido  = " + surname + 
                "\nEdad      = " + age + 
                "\n--------------------------------------";
    }
}
