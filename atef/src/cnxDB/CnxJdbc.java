package cnxDB;
import java.sql.*;
import java.util.logging.Logger;


public class CnxJdbc {


	/*Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");*/
	 String url="jdbc:mysql://localhost:3306/user";
     String login="root";
     String pwd="";
     Connection cnx;
    private static CnxJdbc instance;

    public Connection getCnx() {
        return cnx;
    }
    
    
    private CnxJdbc() {
        try {
            cnx=DriverManager.getConnection(url, login, pwd);
        } catch (SQLException ex) {
            
        }
    }
    
   public static CnxJdbc getInstance(){
       
       if(instance==null)
           instance=new CnxJdbc();
       return instance;
   }
    
	

}
