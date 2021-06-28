package principal.mysql.hibernate.DAO;

import java.sql.*;

public class MySQL {
    public static Connection conn = null;
    private static final String URL = "jdbc:mysql://localhost:3306/usuarios?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "43386816Mas";
    
    private MySQL(){
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USER,PASS);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar BD: " + e.getMessage() + " | Class: " + e.getClass());
        }
    }
    
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static Connection getConnection(){
        if(conn == null){
            new MySQL();
        }
        return conn;
    }
   
    public static void closeConnection(){
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException e){
                System.out.println("Error al cerrar DB: " + e.getMessage());
            }
        }
    }
}
