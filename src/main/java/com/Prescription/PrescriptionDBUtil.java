package com.Prescription;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Users.DBConnect;



public class PrescriptionDBUtil {

    private static Connection con = null;
    private static Statement stmt = null;
    private static java.sql.ResultSet rs = null;
    private static boolean isScucess;


    public static boolean insertPrescription(String pdate, String Diagnostics, String pmedicine, String pdescription, String pdoctorname, int pdoctorid, String ppatientname, int ppatientid) {
        boolean isScucess = false;

        

        try {
            con = DBConnect.getConnection();    
            stmt = con.createStatement();
            
            String sql = "insert into prescription values (0,'"+pdate+"','"+Diagnostics+"','"+pmedicine+"','"+pdescription+"','"+pdoctorname+"','"+pdoctorid+"','"+ppatientname+"','"+ppatientid+"')";
            System.out.println(sql);
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

    public static List<Prescription> getPrescription(String doctorid) {
        ArrayList<Prescription> pres = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from prescription where pdoctorid='"+doctorid+"'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                int pid = rs.getInt(1);
                String pdate = rs.getString(2);
                String Diagnostics  = rs.getString(3);
                String pmedicine = rs.getString(4);
                String pdescription = rs.getString(5);
                String pdoctorname = rs.getString(6);
                int pdoctorid = rs.getInt(7);
                String ppatientname = rs.getString(8);
                int ppatientid  = rs.getInt(9);
                

                Prescription p = new Prescription(pid, pdate, Diagnostics, pmedicine, pdescription, pdoctorname, pdoctorid, ppatientname, ppatientid);
                pres.add(p);
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pres;
    }

    public static boolean UpdatePrescription(String pid, String pdate, String Diagnostics, String pmedicine, String pdescription, String pdoctorname, String pdoctorid, String ppatientname, String ppatientid ){
        try {
            con = DBConnect.getConnection();    
            stmt = con.createStatement();

            String sql = "update prescription set pdate='"+pdate+"', Diagnostics='"+Diagnostics+"', pmedicine='"+pmedicine+"', pdescription='"+pdescription+"', pdoctorname='"+pdoctorname+"', pdoctorid='"+pdoctorid+"', ppatientname='"+ppatientname+"', ppatientid='"+ppatientid+"' where pid='"+pid+"'";          
            System.out.println(sql);
            int rs = stmt.executeUpdate(sql);
//            System.out.println(sql);

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

    public static boolean deletePrescription(String pid) {
        int convId = Integer.parseInt(pid);
        
        try {
            con = DBConnect.getConnection();    
            stmt = con.createStatement();
            String sql = "delete from prescription where pid='"+convId+"'";
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
