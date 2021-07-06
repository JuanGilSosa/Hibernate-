package principal.mysql.hibernate.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name="car")
public class Car implements Serializable{
    
    @Id
    @GeneratedValue(generator="increment")
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="patent")
    private String patent;
    
    /**
     * <p>Constructor
    */
    public Car(){}
    /*
    public Car(Integer id, String name, String patent){
        this.id     = id;
        this.name   = name;
        this.patent = patent;
    }
    public Car(String name, String patent){
        this(0, name, patent);
    }
    */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }
    
}
