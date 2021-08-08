package principal.mysql.hibernate.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;

@Entity
@Table(name="employee")
@DiscriminatorValue("EMP")
public class Employee extends Person implements Serializable {
    
    @Column(name="type")
    private String type; // Blanco o Negro 
    
    public Employee(){}
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }

    @Override
    public String toString() {
        return "Employee{" + "type=" + type + '}' + "All Data = "+super.toString();
    }
    
}
