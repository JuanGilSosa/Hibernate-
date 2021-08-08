package principal.mysql.hibernate.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client extends Person implements Serializable{

    @Column(name="job")
    private String job;
    
    public Client(){}
    /*
    public void setIdClient(Integer idClient){
        this.idClient = idClient;
    }
    public Integer getIdClient(){
        return this.idClient;
    }
    */
    public void setJob(String job){
        this.job = job;
    }
    
    public String getJob(){
        return this.job;
    }

    @Override
    public String toString() {
        return "Client{" +/*+ "idClient=" + idClient + ",*/ "job=" + job + '}';
    }
    
}
