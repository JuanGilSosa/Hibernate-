package principal.mysql.hibernate.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name="person")
public class Person implements Serializable {
    
    @Id
    @GeneratedValue(generator="increment")
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="age")
    private Integer age;

    public Person(){
        
    }
    
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

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
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
