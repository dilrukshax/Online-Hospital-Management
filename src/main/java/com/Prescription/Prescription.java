package com.Prescription;

public class Prescription {
    private int pid;
    private String pdate;
    private String diagnostics;
    private String pmedicine;
    private String pdescription;
    private String pdoctorname;
    private int pdoctorid;
    private String ppatientname;
    private int ppatientid;
    
    
	public Prescription(int pid, String pdate, String diagnostics, String pmedicine, String pdescription,
			String pdoctorname, int pdoctorid, String ppatientname, int ppatientid) {
		super();
		this.pid = pid;
		this.pdate = pdate;
		this.diagnostics = diagnostics;
		this.pmedicine = pmedicine;
		this.pdescription = pdescription;
		this.pdoctorname = pdoctorname;
		this.pdoctorid = pdoctorid;
		this.ppatientname = ppatientname;
		this.ppatientid = ppatientid;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPdate() {
		return pdate;
	}


	public void setPdate(String pdate) {
		this.pdate = pdate;
	}


	public String getDiagnostics() {
		return diagnostics;
	}


	public void setDiagnostics(String diagnostics) {
		this.diagnostics = diagnostics;
	}


	public String getPmedicine() {
		return pmedicine;
	}


	public void setPmedicine(String pmedicine) {
		this.pmedicine = pmedicine;
	}


	public String getPdescription() {
		return pdescription;
	}


	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}


	public String getPdoctorname() {
		return pdoctorname;
	}


	public void setPdoctorname(String pdoctorname) {
		this.pdoctorname = pdoctorname;
	}


	public int getPdoctorid() {
		return pdoctorid;
	}


	public void setPdoctorid(int pdoctorid) {
		this.pdoctorid = pdoctorid;
	}


	public String getPpatientname() {
		return ppatientname;
	}


	public void setPpatientname(String ppatientname) {
		this.ppatientname = ppatientname;
	}


	public int getPpatientid() {
		return ppatientid;
	}


	public void setPpatientid(int ppatientid) {
		this.ppatientid = ppatientid;
	}
    
    
	
  


}
