package principal.mysql.hibernate.Controllers;

import java.util.ArrayList;
import principal.mysql.hibernate.DAO.MySQL;
import principal.mysql.hibernate.DAO.PersonDAO;
import principal.mysql.hibernate.Helpers.JTableHelper;
import principal.mysql.hibernate.Models.Person;

public class MainController {
    private final PersonDAO personDAO;
    /**
     * <p> Practicamente el MainController Method crea manda una conexion a PersonDAO();</p>
     * @param jtable donde se cargara la informacion ni bien se conecte a la base de datos
     */
    public MainController(javax.swing.JTable jtable){
        //  this.personDAO = new PersonDAO(MySQL.getConnection());
        this.personDAO = new PersonDAO();
        /*
            ArrayList<Object> obj = this.personDAO.GetAll();
            for(Object o : obj){
                JTableHelper.addData(jtable, ((Object[])o));
            }
            javax.swing.JOptionPane.showMessageDialog(null, "BASE DE DATOS CONECTADA");
        */
        
    }
    
    public void Add(javax.swing.JTable jtable, String name, String surname, Integer age){
        Person p = new Person(name, surname, age);
        if(name.isEmpty() | surname.isEmpty() | age < 0){
            javax.swing.JOptionPane.showMessageDialog(null, "DEBE LLENAR LOS CAMPOS");
        }else{
            if(this.personDAO.Add_ORM(p) == true){
                javax.swing.JOptionPane.showMessageDialog(null, "¡PERSONA CARGADA AL SISTEMA!");
                Object[] data = {name, surname, age};
                JTableHelper.addData(jtable, data);
            }else{
                javax.swing.JOptionPane.showMessageDialog(null, "ERROR AL CARGAR AL SISTEMA");
            }
        }
    }
    
}
