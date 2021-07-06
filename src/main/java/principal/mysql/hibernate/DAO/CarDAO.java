package principal.mysql.hibernate.DAO;

import java.util.List;
import org.hibernate.Session;
import principal.mysql.hibernate.Models.Car;

public class CarDAO {
    private final HibernateORM hibernateORM;
    
    public CarDAO(){
        this.hibernateORM = new HibernateORM();
    }
    
    public Boolean Add(Car c){
        Session session = this.hibernateORM.getSession();
        session.save(c);
        return this.hibernateORM.commit(session);
    }
    public List GetAll(){
        Session session = this.hibernateORM.getSession();
        List data = session.createQuery("from Car").list();
        this.hibernateORM.commit(session);
        return data;
    }
}
