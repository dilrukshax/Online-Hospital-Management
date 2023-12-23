package com.Medicine;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Users.DBConnect;

public class MedicineDBUtil {

    private static boolean isScucess;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
    


    public static boolean insertMedicine(String medicineName, String medicineType, String medicineDescription, String medicinePrice, String medicineQuantity, String medicineExpiryDate, String medicineManufacturingDate, String medicineCompany) {
        

        isScucess = false;

        try {
            con = DBConnect.getConnection();    
            stmt = con.createStatement();
            
            String sql = "insert into medicine values (0 ,'"+medicineName+"','"+medicineType+"','"+medicineDescription+"','"+medicinePrice+"','"+medicineQuantity+"','"+medicineExpiryDate+"','"+medicineManufacturingDate+"','"+medicineCompany+"')";
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



    public static boolean findMedicine(String medicinename) {
       
        boolean isScucess = false;
        
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from medicine where medicineName='"+medicinename+"'";
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



    public static List<Medicines> getMedicineDetails(String medicinename) {
        ArrayList<Medicines> Medicines = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from medicine where medicineName='"+medicinename+"'";
            rs = stmt.executeQuery(sql);
            System.out.println(sql);

            while(rs.next()){
                String medicineId = rs.getString(1);
                String medicineName = rs.getString(2);
                String medicineType = rs.getString(3);
                String medicineDescription = rs.getString(4);
                String medicinePrice = rs.getString(5);
                String medicineQuantity = rs.getString(6);
                String medicineExpiryDate = rs.getString(7);
                String medicineManufacturingDate = rs.getString(8);
                String medicineCompany = rs.getString(9);
                
                Medicines m = new Medicines(medicineId, medicineName, medicineType, medicineDescription, medicinePrice, medicineQuantity, medicineExpiryDate, medicineManufacturingDate, medicineCompany);
                Medicines.add(m);
            }
            
        } catch (Exception e) {
            e.printStackTrace();            
        }
        return Medicines ;
    }



    public static boolean updateMedicine(String medicineId, String medicineName, String medicineType,
            String medicineDescription, String medicinePrice, String medicineQuantity, String medicineExpiryDate,
            String medicineManufacturingDate, String medicineCompany) {

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "update medicine set medicineName='"+medicineName+"',medicineType='"+medicineType+"',medicineDescription='"+medicineDescription+"',medicinePrice='"+medicinePrice+"',medicineQuantity='"+medicineQuantity+"',medicineExpiryDate='"+medicineExpiryDate+"',medicineManufacturingDate='"+medicineManufacturingDate+"',medicineCompany='"+medicineCompany+"' where medicineId='"+medicineId+"'";
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



    public static boolean deleteMedicine(String medicineID) {
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "delete from medicine where medicineId='"+medicineID+"'";
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
