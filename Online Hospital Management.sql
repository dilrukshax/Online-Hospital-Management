CREATE TABLE `hospital`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `age` VARCHAR(45) NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `usertype` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
  
  CREATE TABLE `hospital`.`appointment` (
  `idappointment` INT NOT NULL AUTO_INCREMENT,
  `patientid` INT NULL,
  `patientname` VARCHAR(45) NULL,
  `date` VARCHAR(45) NULL,
  `time` VARCHAR(45) NULL,
  `description` VARCHAR(100) NULL,
  `doctorid` INT NULL, 
  `doctorname` VARCHAR(45) NULL,
  PRIMARY KEY (`idappointment`), -- Make idappointment the primary key
  INDEX `doctorid_idx` (`doctorid` ASC) VISIBLE,
  CONSTRAINT `doctorid`
    FOREIGN KEY (`doctorid`)
    REFERENCES `hospital`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE `hospital`.`prescription` (
  `pid` INT NOT NULL AUTO_INCREMENT,
  `pdate` VARCHAR(45) NULL,
  `Diagnostics` VARCHAR(45) NULL,
  `pmedicine` VARCHAR(45) NULL,
  `pdescription` VARCHAR(45) NULL,
  `pdoctorname` VARCHAR(45) NULL,
  `pdoctorid` INT NULL,
  `ppatientname` VARCHAR(45) NULL,
  `ppatientid` INT NULL,
  PRIMARY KEY (`pid`)
);

CREATE TABLE `hospital`.`medicine` (
  `medicineId` INT NOT NULL AUTO_INCREMENT,
  `medicineName` VARCHAR(45) NULL,
  `medicineType` VARCHAR(45) NULL,
  `medicineDescription` VARCHAR(100) NULL,
  `medicinePrice` VARCHAR(45) NULL,
  `medicineQuantity` VARCHAR(45) NULL,
  `medicineExpiryDate` VARCHAR(45) NULL,
  `medicineManufacturingDate` VARCHAR(45) NULL,
  `medicineCompany` VARCHAR(45) NULL,
  PRIMARY KEY (`medicineId`),
  UNIQUE INDEX `medicineId_UNIQUE` (`medicineId` ASC) VISIBLE);

  
  