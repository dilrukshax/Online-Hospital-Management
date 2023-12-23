package com.Medicine;

public class Medicines {

    private String medicineId;
    private String medicineName;
    private String medicineType;
    private String medicineDescription;
    private String medicinePrice;
    private String medicineQuantity;
    private String medicineExpiryDate;
    private String medicineManufacturingDate;
    private String medicineCompany;
    
	public Medicines(String medicineId, String medicineName, String medicineType, String medicineDescription,
			String medicinePrice, String medicineQuantity, String medicineExpiryDate, String medicineManufacturingDate,
			String medicineCompany) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.medicineType = medicineType;
		this.medicineDescription = medicineDescription;
		this.medicinePrice = medicinePrice;
		this.medicineQuantity = medicineQuantity;
		this.medicineExpiryDate = medicineExpiryDate;
		this.medicineManufacturingDate = medicineManufacturingDate;
		this.medicineCompany = medicineCompany;
	}

	public String getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedicineType() {
		return medicineType;
	}

	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}

	public String getMedicineDescription() {
		return medicineDescription;
	}

	public void setMedicineDescription(String medicineDescription) {
		this.medicineDescription = medicineDescription;
	}

	public String getMedicinePrice() {
		return medicinePrice;
	}

	public void setMedicinePrice(String medicinePrice) {
		this.medicinePrice = medicinePrice;
	}

	public String getMedicineQuantity() {
		return medicineQuantity;
	}

	public void setMedicineQuantity(String medicineQuantity) {
		this.medicineQuantity = medicineQuantity;
	}

	public String getMedicineExpiryDate() {
		return medicineExpiryDate;
	}

	public void setMedicineExpiryDate(String medicineExpiryDate) {
		this.medicineExpiryDate = medicineExpiryDate;
	}

	public String getMedicineManufacturingDate() {
		return medicineManufacturingDate;
	}

	public void setMedicineManufacturingDate(String medicineManufacturingDate) {
		this.medicineManufacturingDate = medicineManufacturingDate;
	}

	public String getMedicineCompany() {
		return medicineCompany;
	}

	public void setMedicineCompany(String medicineCompany) {
		this.medicineCompany = medicineCompany;
	}
    

}
