package com.Appointment;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Users.DBConnect;
import com.Users.Users;

public class AppointmentDBUtil {
	private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
    private static boolean isScucess;




    public static  List<Users> getDoctor() {
    	ArrayList<Users> Doctor = new ArrayList<>();
        
       
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from users where usertype = '2'";
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

                Users u = new Users(id, name, address, email, phone, gender, age, usernameU, passwordU, usertype);
                Doctor.add(u);
            }            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        return Doctor;
    }
    
    public static boolean insertAppointment(int patientid, String patientname, String date, String time, String description, int doctorid, String doctorname) {
    	
    	boolean isSuccess = false;
        try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
            String sql = "insert into appointment values (0, '"+patientid+"', '"+patientname+"', '"+date+"', '"+time+"', '"+description+"', '"+doctorid+"', '"+doctorname+"')";
    		

    		System.out.println(sql);
            int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }

    public static List<Appointment> getAppointment(int uid) {
        ArrayList<Appointment> Appointment = new ArrayList<Appointment>();
            
        
            try {
                con = DBConnect.getConnection();
                stmt = con.createStatement();
                String sql = "select * from appointment where patientid = '"+uid+"'";
                System.out.println(sql);
                rs = stmt.executeQuery(sql);
                
                while(rs.next()){
                    int id = rs.getInt(1);
                    int patientid = rs.getInt(2);
                    String patientname = rs.getString(3);
                    String date = rs.getString(4);
                    String time = rs.getString(5);
                    String description = rs.getString(6);
                    int doctorid = rs.getInt(7);
                    String doctorname = rs.getString(8);
    
                    Appointment a = new Appointment(id, patientid, patientname, date, time, description, doctorid, doctorname);
                    Appointment.add(a);
                }            
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
            return Appointment;
    }

    public static List<Appointment> getDoctorAppointment(int uid) {
        
        ArrayList<Appointment> Appointment = new ArrayList<Appointment>();
            
        
            try {
                con = DBConnect.getConnection();
                stmt = con.createStatement();
                String sql = "select * from appointment where doctorid = '"+uid+"'";
                System.out.println(sql);
                rs = stmt.executeQuery(sql);
                
                while(rs.next()){
                    int id = rs.getInt(1);
                    int patientid = rs.getInt(2);
                    String patientname = rs.getString(3);
                    String date = rs.getString(4);
                    String time = rs.getString(5);
                    String description = rs.getString(6);
                    int doctorid = rs.getInt(7);
                    String doctorname = rs.getString(8);
    
                    Appointment a = new Appointment(id, patientid, patientname, date, time, description, doctorid, doctorname);
                    Appointment.add(a);
                }            
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
            return Appointment;
    }

    public static boolean updateappointment(String idappointment, String patientid, String patientname, String date,
            String time, String description, String doctorid, String doctorname) {
        boolean isScucess = false;
                try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "update appointment set patientid='"+patientid+"', patientname='"+patientname+"', date='"+date+"', time='"+time+"', description='"+description+"', doctorid='"+doctorid+"', doctorname='"+doctorname+"' where idappointment='"+idappointment+"'";
            int rs = stmt.executeUpdate(sql);
            System.out.println(sql);

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
    
    public static boolean deleteappointment(String idappointment) {
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "delete from appointment where idappointment='"+idappointment+"'";
            int rs = stmt.executeUpdate(sql);
            System.out.println(sql);

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


        
    
}



     




