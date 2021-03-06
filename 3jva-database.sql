

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema SupTrips
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SupTrips
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SupTrips` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `SupTrips` ;

-- -----------------------------------------------------
-- Table `SupTrips`.`Users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SupTrips`.`Users` (
  `idbooster` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `password` VARCHAR(45) NOT NULL COMMENT '',
  `firstname` VARCHAR(45) NULL COMMENT '',
  `lastname` VARCHAR(45) NULL COMMENT '',
  `email` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`idbooster`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SupTrips`.`Trips`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SupTrips`.`Trips` (
  `idtrip` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `depart_campus` VARCHAR(45) NULL COMMENT '',
  `depart_date` DATE NULL COMMENT '',
  `arrive_campus` VARCHAR(45) NULL COMMENT '',
  `arrive_date` DATE NULL COMMENT '',
  `airport_name` VARCHAR(45) NULL COMMENT '',
  `Users_idbooster` INT NULL COMMENT '',
  PRIMARY KEY (`idtrip`)  COMMENT '',
  INDEX `fk_Trips_Users_idx` (`Users_idbooster` ASC)  COMMENT '',
  CONSTRAINT `fk_Trips_Users`
    FOREIGN KEY (`Users_idbooster`)
    REFERENCES `SupTrips`.`Users` (`idbooster`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

