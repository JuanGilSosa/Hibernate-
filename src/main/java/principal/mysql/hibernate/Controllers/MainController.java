package principal.mysql.hibernate.Controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import principal.mysql.hibernate.DAO.CarDAO;
import principal.mysql.hibernate.DAO.ClientDAO;
import principal.mysql.hibernate.Helpers.JTableHelper;
import principal.mysql.hibernate.Models.Car;
import principal.mysql.hibernate.Models.Client;
import principal.mysql.hibernate.Models.Person;

public class MainController {
    private final CarDAO carDAO;
    private final ClientDAO clientDAO;
    /**
     * <p> Practicamente el MainController Method crea manda una conexion a PersonDAO();</p>
     * @param jtable_u donde se cargara la informacion ni bien se conecte a la base de datos
     * @param jtable_c donde se cargara la informacion ni bien se conecte a la base de datos
     */
    public MainController(javax.swing.JTable jtable_u, javax.swing.JTable jtable_c){
        //  this.personDAO = new PersonDAO(MySQL.getConnection());
        this.clientDAO = new ClientDAO();
        this.carDAO    = new CarDAO();
        
        //Carga de usuarios a la tabla
        ArrayList<Person> objs = this.clientDAO.GetAll();
        for(Person p : objs){
            Object[] o = {p.getName(), p.getSurname(), p.getAge()}; 
            JTableHelper.addData(jtable_u, o);
        }
        
        //Carga de autos a la tabla
        List cars = this.carDAO.GetAll();
        Iterator<Car> it = cars.iterator();
        while(it.hasNext()){
            Car c = it.next();
            Object[] o = {c.getName(), c.getPatent()};
            JTableHelper.addData(jtable_c, o);
        }
        
        javax.swing.JOptionPane.showMessageDialog(null, "BASE DE DATOS CONECTADA");
    }
    /**
     * @param jtable
     * @param name
     * @param surname
     * @param age
     * @param job
     * <p> Agrega una persona al sistema, recibiendo como parametro la tabla, y los 3 
     * fundamentales que son nombre[name], apellido[surname] y edad[age], trabajo[job]
     */
    public void Add(
            javax.swing.JTable jtable, 
            String name, 
            String surname, 
            Integer age, 
            String job
    ){
        if(name.isEmpty() | surname.isEmpty() | age < 0){
            javax.swing.JOptionPane.showMessageDialog(null, "DEBE LLENAR LOS CAMPOS");
        }else{
            Client c = new Client();
            c.setName(name);c.setAge(age);
            c.setSurname(surname);c.setJob(job);
            if(this.clientDAO.Add_Client(c) == true){
                if(this.clientDAO.Add_Client(c) == true){
                    javax.swing.JOptionPane.showMessageDialog(null, "¡CLIENTE CARGADO AL SISTEMA!");
                    Object[] data = {name, surname, age, job};
                    JTableHelper.addData(jtable, data);
                }
                
            }else{
                javax.swing.JOptionPane.showMessageDialog(null, "ERROR AL CARGAR AL SISTEMA");
            }
        }
    }
    
    /**
     * @param jtable
     * @param name
     * @param patent
     * <p> Agrega un auto al sistema, recibiendo como parametro la tabla, y los dos
     * fundamentales que son nombre [name] y patente [patent]
     */
    public void Add(javax.swing.JTable jtable, String name, String patent){
        if(name.isEmpty() | patent.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null, "DEBE LLENAR LOS CAMPOS");
        }else{
            Car myCar = new Car();
            myCar.setName(name); myCar.setPatent(patent);
            if(this.carDAO.Add(myCar) == true){
                javax.swing.JOptionPane.showMessageDialog(null, "¡AUTO CARGADO AL SISTEMA!");
                Object[] data = {name, patent};
                JTableHelper.addData(jtable, data);
            }else{
                javax.swing.JOptionPane.showMessageDialog(null, "ERROR AL CARGAR AL SISTEMA");
            }
        }
    }
}
