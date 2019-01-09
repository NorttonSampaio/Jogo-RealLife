-- MySQL Script generated by MySQL Workbench
-- Wed Nov 28 04:45:47 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema reallife
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema reallife
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `reallife` DEFAULT CHARACTER SET utf8 ;
USE `reallife` ;

-- -----------------------------------------------------
-- Table `reallife`.`necessidades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reallife`.`necessidades` (
  `idNecessidade` INT NOT NULL AUTO_INCREMENT,
  `inteligencia` INT NOT NULL,
  `fome` TINYINT NOT NULL,
  `sono` TINYINT NOT NULL,
  `necessidades` TINYINT NOT NULL,
  `higiene` TINYINT NOT NULL,
  `social` TINYINT NOT NULL,
  `diversao` TINYINT NOT NULL,
  PRIMARY KEY (`idNecessidade`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `reallife`.`jogador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reallife`.`jogador` (
  `idJogador` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `dinheiro` DOUBLE NOT NULL,
  `dia` INT NOT NULL,
  `horario` VARCHAR(5) NOT NULL,
  `necessidades_idNecessidade` INT NOT NULL,
  PRIMARY KEY (`idJogador`),
  INDEX `fk_jogador_necessidades_idx` (`necessidades_idNecessidade` ASC),
  CONSTRAINT `fk_jogador_necessidades`
    FOREIGN KEY (`necessidades_idNecessidade`)
    REFERENCES `reallife`.`necessidades` (`idNecessidade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `reallife`.`comodo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reallife`.`comodo` (
  `idComodo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `possui` TINYINT NOT NULL,
  PRIMARY KEY (`idComodo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `reallife`.`item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reallife`.`item` (
  `idItem` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idItem`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `reallife`.`item_pode_fazer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reallife`.`item_pode_fazer` (
  `idFazer` INT NOT NULL AUTO_INCREMENT,
  `opcao` VARCHAR(45) NOT NULL,
  `necessidades_idNecessidade` INT NOT NULL,
  `item_idItem` INT NOT NULL,
  `tempo` INT NOT NULL,
  PRIMARY KEY (`idFazer`),
  INDEX `fk_item_pode_fazer_necessidades1_idx` (`necessidades_idNecessidade` ASC),
  INDEX `fk_item_pode_fazer_item1_idx` (`item_idItem` ASC),
  CONSTRAINT `fk_item_pode_fazer_necessidades1`
    FOREIGN KEY (`necessidades_idNecessidade`)
    REFERENCES `reallife`.`necessidades` (`idNecessidade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_pode_fazer_item1`
    FOREIGN KEY (`item_idItem`)
    REFERENCES `reallife`.`item` (`idItem`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `reallife`.`cidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reallife`.`cidade` (
  `idCidade` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCidade`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `reallife`.`catalogo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reallife`.`catalogo` (
  `idCatalogo` INT NOT NULL AUTO_INCREMENT,
  `custo` VARCHAR(45) NOT NULL,
  `comodo_idComodo` INT NOT NULL,
  `possui` TINYINT NOT NULL,
  `item_idItem` INT NOT NULL,
  PRIMARY KEY (`idCatalogo`),
  INDEX `fk_catalogo_comodo1_idx` (`comodo_idComodo` ASC),
  INDEX `fk_catalogo_item1_idx` (`item_idItem` ASC),
  CONSTRAINT `fk_catalogo_comodo1`
    FOREIGN KEY (`comodo_idComodo`)
    REFERENCES `reallife`.`comodo` (`idComodo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_catalogo_item1`
    FOREIGN KEY (`item_idItem`)
    REFERENCES `reallife`.`item` (`idItem`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `reallife`.`cidade_pode_fazer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `reallife`.`cidade_pode_fazer` (
  `id` INT UNSIGNED NOT NULL,
  `opcao` VARCHAR(45) NOT NULL,
  `necessidades_idNecessidade` INT NOT NULL,
  `cidade_idCidade` INT NOT NULL,
  `custo` DOUBLE NOT NULL,
  `pagamento` DOUBLE NOT NULL,
  `tempo` INT NOT NULL,
  `inteligenciaNecessaria` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_cidade_pode_fazer_necessidades1_idx` (`necessidades_idNecessidade` ASC),
  INDEX `fk_cidade_pode_fazer_cidade1_idx` (`cidade_idCidade` ASC),
  CONSTRAINT `fk_cidade_pode_fazer_necessidades1`
    FOREIGN KEY (`necessidades_idNecessidade`)
    REFERENCES `reallife`.`necessidades` (`idNecessidade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cidade_pode_fazer_cidade1`
    FOREIGN KEY (`cidade_idCidade`)
    REFERENCES `reallife`.`cidade` (`idCidade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;