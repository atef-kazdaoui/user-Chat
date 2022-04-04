package crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import cnxDB.CnxJdbc;
import entity.userEntity;


public class userCrud {
	 private static userCrud instance;
	    private Statement st;
	    private ResultSet rs;
	          Connection  myConnex;

	    public  userCrud() {
	    	CnxJdbc cs=CnxJdbc.getInstance();
	        try {
	            st=cs.getCnx().createStatement();
	        } catch (SQLException ex) {
	           
	        }
	    }
	    
	    public static userCrud getInstance(){
	        if(instance==null) {
	            instance=new userCrud();
	        }
	        return instance;
	    }


	
	    public userEntity getUser(String email){
	        String req="select * from user where email='"+email+"'";
	       
	        userEntity user = new userEntity();
	        try {
	            rs=st.executeQuery(req);
	            while(rs.next()){
	            	
	            	user.setEmail(rs.getString("email"));
	                user.setNom(rs.getString("nom"));
	                user.setPrenom(rs.getString("prenom"));
	                user.setPassword(rs.getString("motDePasse"));
	                
	            }
	            
	        } catch (SQLException ex) {
	          
	        }
	        return user;
	    }
	    public void ajouterUSer(userEntity user) {
	        String req="insert into user"
	                + " (email,nom,motDePasse,prenom)"
	                + " values ('"+user.getEmail()+"','"+user.getNom()+"','"+user.getPassword()+"','"+user.getPrenom()+"')";
	       
	        
	        
	        
	        try {
	            st.executeUpdate(req);
	            System.out.println("user bien ajouter");
	        } catch (SQLException ex) {
	            Logger.getLogger(userCrud.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }   
	 
}

