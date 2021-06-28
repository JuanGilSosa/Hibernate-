package principal.mysql.hibernate.DAO;

import java.sql.*;
import java.util.ArrayList;
import principal.mysql.hibernate.Models.Person;

public class PersonDAO {
    private final Connection conn;
    
    public PersonDAO(Connection conn){
        this.conn = conn;
    }
    
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
}
