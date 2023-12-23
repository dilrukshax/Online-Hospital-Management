package com.Admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


import com.Users.DBConnect;


public class AdminDBUtil {
	
	private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
    private static boolean isScucess;
	
	
	
	public static boolean AddUsers(String name, String address, String email, String phone, String gender,
            String age, String username, String password, String usertype){

         isScucess = false;

        try {
            con = DBConnect.getConnection();    
            stmt = con.createStatement();
            
            String sql = "insert into users values (0,'"+name+"','"+address+"','"+email+"','"+phone+"','"+gender+"','"+age+"','"+username+"','"+password+"','"+usertype+"')";
            int rs = stmt.executeUpdate(sql);

            if(rs > 0){
                isScucess = true;
            }else{
                isScucess = false;
            }            
        } catch (Exception e) {
            e.printStackTrace();
            
        } 
        return isScucess;
    } 

    public static boolean findUser(String username) {
        boolean isScucess = false;
       
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from users where username='"+username+"'";
            rs = stmt.executeQuery(sql);

            if(rs.next()){
                isScucess = true;
            }else{
                isScucess = false;
            }            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        return isScucess;
    }
    
     
     

}


