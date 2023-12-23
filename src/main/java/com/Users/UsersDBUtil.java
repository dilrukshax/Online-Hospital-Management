package com.Users;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UsersDBUtil {

    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
    private static boolean isScucess;


    public static boolean validate(String username, String password) {
        boolean isScucess = false;
       
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from users where username='"+username+"' and password='"+password+"'";
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


    public static List<Users> getUsers(String username) {
        ArrayList<Users> user = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from users where username='"+username+"'";
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                String email = rs.getString(4);
                String phone = rs.getString(5);
                String gender = rs.getString(6);
                String age = rs.getString(7);
                String usernameU = rs.getString(8);
                String passwordU = rs.getString(9);
                int usertype = rs.getInt(10);
                

                Users u = new Users(id, name, address, email, phone, gender, age, usernameU, passwordU,usertype);
                user.add(u);
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public static boolean InsertUsers(String name, String address, String email, String phone, String gender,
            String age, String username, String password, String usertype){

        boolean isScucess = false;

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
    
    public static boolean UpdateUser(String id, String name, String address, String email, String phone, String gender, String age, String username, String password ){
        try {
            con = DBConnect.getConnection();    
            stmt = con.createStatement();

            String sql = "update users set name='"+name+"', address='"+address+"', email='"+email+"', phone='"+phone+"', gender='"+gender+"', age='"+age+"', username='"+username+"', password='"+password+"' "
            		+ "where id='"+id+"'";          
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

    public static List<Users> getUsersDetails(String Id){

        int convertedID = Integer.parseInt(Id);
        ArrayList<Users> user = new ArrayList<>();

        try {
            con = DBConnect.getConnection();    
            stmt = con.createStatement();
            String sql = "select * from users where id='"+convertedID+"'";
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                String email = rs.getString(4);
                String phone = rs.getString(5);
                String gender = rs.getString(6);
                String age = rs.getString(7);
                String username = rs.getString(8);
                String password = rs.getString(9);
                int usertype = rs.getInt(10);
                

                Users u = new Users(id, name, address, email, phone, gender, age, username, password,usertype);
                user.add(u);                
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public static boolean deletePatient(String id) {
        int convID = Integer.parseInt(id);

        try {
            con = DBConnect.getConnection();    
            stmt = con.createStatement();
            String sql = "delete from users where id='"+convID+"'";
            int r = stmt.executeUpdate(sql);

            if(r > 0){
                isScucess = true;
            }else{
                isScucess = false;
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isScucess;
    }

}
