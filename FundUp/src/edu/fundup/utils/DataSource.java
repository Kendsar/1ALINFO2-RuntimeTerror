package edu.fundup.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.management.RuntimeErrorException;

/**
 *
 * @author Jubran Saoudi
 */
public class DataSource {
    
    String url = "jdbc:mysql://localhost:3306/[DATABASENAME]";
    String login = "root";
    String password = "";
    private Connection connection;
    private static DataSource instance = null;

    private DataSource() {
    	if(instance != null) {
    		throw new RuntimeException("Use getInstance() method to create instance !");
    	}

    }

    public Connection getConnection() {
    	if(instance == null) {
    		synchronized (DataSource.class) {
				if(instance == null) {
					try{
			            connection=DriverManager.getConnection(url,login,password);
			            System.out.println("Connected");    
			            }
			          catch(SQLException e){
			                e.printStackTrace();
			            }			
					}
			}
    	}
        return connection;
    }
       
    
    

    public static DataSource getInstance() {
        if (instance == null) {
            instance = new DataSource();
        }
        return instance;
    }

}