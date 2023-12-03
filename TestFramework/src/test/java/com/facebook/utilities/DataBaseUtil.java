package com.facebook.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.facebook.pageObject.BasePage;

public class DataBaseUtil extends BasePage{
	
	private static final String url =prop.getProperty("dataBaseURL") ;
    private static final String user = prop.getProperty("user") ;
    private static final String pass =prop.getProperty("pass") ;
	
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
  
	
	public void readFromDatabase(String sql) {
		String query = sql;
		try{  
			 
			con =DriverManager.getConnection(url,user,pass);  
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
           

           while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
          
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
           
		
		
	}

}
}

