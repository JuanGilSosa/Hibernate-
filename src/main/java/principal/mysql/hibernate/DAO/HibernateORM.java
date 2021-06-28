package principal.mysql.hibernate.DAO;

import java.io.IOException;
import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateORM {
    
    static SessionFactory sessionFactory;
    
    public HibernateORM(){
        setUp();    
    }
    
    private void setUp(){
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try{
            //sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }catch(HibernateException e){
            System.out.println("Se destruye Session");
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
    
    public Session getSession(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        return session;
    }
    
    public Boolean commit(Session session){
        Boolean is_save = false;
        try{
            session.getTransaction().commit();
            session.close();
            is_save = true;
        }catch(HibernateException e){/***/}
        return is_save;
    }
}
