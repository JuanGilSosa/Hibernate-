package principal.mysql.hibernate.DAO;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.hibernate.Session;
import principal.mysql.hibernate.Models.Person;

public class PersonDAO {
    
    private final HibernateORM hibernateORM;
    //private final Connection conn;
    
    public PersonDAO(/*Connection conn*/){
        //this.conn = conn;
        this.hibernateORM = new HibernateORM();
    }
    /*
    public Boolean Add(Person p){
        Boolean isSave = false;
        try{
            Statement st = this.conn.createStatement();
            st.execute("INSERT INTO person(name, surname, age) VALUES('"+p.getName()+"','"+p.getSurname()+"','"+p.getAge()+"')");
            st.close();
            isSave = true;
        }catch(SQLException e){
            System.out.println("PersonDAO Method-Add : "+e.getMessage());
        }
        return isSave;
    }
    public ArrayList GetAll(){
        ArrayList<Object> info = new ArrayList<>();
        try{
            Statement st = this.conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM person");
            
            while(rs.next()){
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                Integer age = rs.getInt("age");
                Object[] data = {name, surname, age};
                info.add(data);
            }
            
        }catch(SQLException e){
            System.out.println("PersonDAO Method-GetAll : "+e.getMessage());
        }
        return info;
    }
    */
    public Boolean Add_ORM(Person p){
        Session session = this.hibernateORM.getSession();
        session.save(p);
        return this.hibernateORM.commit(session);
    }
    public ArrayList GetAll(){
        Session session = this.hibernateORM.getSession();
        List result = session.createQuery("from Person").list();
        ArrayList<Person> persons = new ArrayList<>();
        for (Person p : (List<Person>)result){
            persons.add(p);
        }
        return persons;
    }
}
