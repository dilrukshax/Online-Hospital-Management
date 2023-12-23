package com.Appointment;

public class Appointment {
    private int idappointment;
    private int patientid;
    private String patientname;
    private String date;
    private String time;
    private String description;
    private int doctorid;
    private String doctorname;
    
    
	public Appointment(int idappointment, int patientid, String patientname, String date, String time,
			String description, int doctorid, String doctorname) {
		super();
		this.idappointment = idappointment;
		this.patientid = patientid;
		this.patientname = patientname;
		this.date = date;
		this.time = time;
		this.description = description;
		this.doctorid = doctorid;
		this.doctorname = doctorname;
	}


	public int getidappointment() {
		return idappointment;
	}


	public void setidappointment(int idappointment) {
		this.idappointment = idappointment;
	}


	public int getpatientid() {
		return patientid;
	}


	public void setpatientid(int patientid) {
		this.patientid = patientid;
	}


	public String getpatientname() {
		return patientname;
	}


	public void setpatientname(String patientname) {
		this.patientname = patientname;
	}


	public String getdate() {
		return date;
	}


	public void setdate(String date) {
		this.date = date;
	}


	public String gettime() {
		return time;
	}


	public void settime(String time) {
		this.time = time;
	}


	public String getdescription() {
		return description;
	}


	public void setdescription(String description) {
		this.description = description;
	}


	public int getdoctorid() {
		return doctorid;
	}


	public void setdoctorid(int doctorid) {
		this.doctorid = doctorid;
	}


	public String getDoctorname() {
		return doctorname;
	}


	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
    
	
}
