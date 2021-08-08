package principal.mysql.hibernate.Controllers;

import java.util.ArrayList;
import principal.mysql.hibernate.DAO.PersonDAO;
import principal.mysql.hibernate.Helpers.JTableHelper;
import principal.mysql.hibernate.Models.Client;
import principal.mysql.hibernate.Models.Employee;
import principal.mysql.hibernate.Models.Person;

public class MainController {
    private final PersonDAO personDAO;
    /**
     * <p> Practicamente el MainController Method crea manda una conexion a PersonDAO();</p>
     * @param jtable_u donde se cargara la informacion ni bien se conecte a la base de datos
     */
    public MainController(javax.swing.JTable jtable_u){
        //  this.personDAO = new PersonDAO(MySQL.getConnection());
        this.personDAO = new PersonDAO();
        
        //Carga de usuarios a la tabla
        ArrayList<Person> objs = this.personDAO.GetAll();
        //ArrayList<Client> objs_c = this.personDAO.GetAll_Client();
        //ArrayList<Employee> objs_e = this.personDAO.GetAll_Employee();
        
        for(Person p : objs){
            Object[] o = {p.getName(), p.getSurname(), p.getAge()}; 
            JTableHelper.addData(jtable_u, o);
        }        
        javax.swing.JOptionPane.showMessageDialog(null, "BASE DE DATOS CONECTADA");
    }
    /**
     * @param jtable
     * @param name
     * @param surname
     * @param age
     * @param job
     * @param typeEmployee
     * <p> Agrega una persona al sistema, recibiendo como parametro la tabla, y los 3 
     * fundamentales que son nombre[name], apellido[surname] y edad[age], trabajo[job], tipoEmpleado[typeEmployee]
     */
    public void Add(
            javax.swing.JTable jtable, 
            String name, 
            String surname, 
            Integer age, 
            String job,
            String typeEmployee
    ){
        if(name.isEmpty() | surname.isEmpty() | age < 0){
            javax.swing.JOptionPane.showMessageDialog(null, "DEBE LLENAR LOS CAMPOS");
        }else{
            Person p = new Person();
            Client c = new Client();
            Employee e = new Employee();
            if(typeEmployee.isEmpty()){    
                c.setName(name);c.setAge(age);
                c.setSurname(surname);c.setJob(job);
                p = c;
            }else{
                e.setName(name);e.setAge(age);
                e.setSurname(surname);e.setType(typeEmployee);
                p = e;
            }
            if(this.personDAO.Add(p) == true){
                javax.swing.JOptionPane.showMessageDialog(null, "¡DATOS CARGADOS AL SISTEMA!");
                Object[] data = {name, surname, age, typeEmployee, job};
                JTableHelper.addData(jtable, data);
            }else{
                javax.swing.JOptionPane.showMessageDialog(null, "ERROR AL CARGAR AL SISTEMA");
            }
        }
    }
}
