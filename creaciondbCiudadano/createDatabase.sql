SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";




/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `censo_db`
--
CREATE DATABASE IF NOT EXISTS `censo_db` DEFAULT CHARACTER SET latin1 COLLATE latin1_general_ci;
USE `censo_db`;

-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `ciudadano`
--
CREATE TABLE `censo_db`.`ciudadano` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(40),
  `apellido` VARCHAR(40) ,
  `edad` tinyint(2) ,
  `fecha` timestamp ,
  `provincia` VARCHAR(30),
  PRIMARY KEY (`id`));


insert into `censo_db`.`ciudadano`(nombre,apellido,edad,fecha,provincia) values ('Alejandro','De Moraiz',25,'1995-09-02','Buenos Aires');
insert into `censo_db`.`ciudadano`(nombre,apellido,edad,fecha,provincia) values ('Maite','Rodriguez',16,'2003-09-08','Buenos Aires');
insert into `censo_db`.`ciudadano`(nombre,apellido,edad,fecha,provincia) values ('Daiana','De Moraiz',27,'1993-11-10','Buenos Aires');
insert into `censo_db`.`ciudadano`(nombre,apellido,edad,fecha,provincia) values ('Alejandro','De Moraiz',25,'1995-09-02','Buenos Aires');
insert into `censo_db`.`ciudadano`(nombre,apellido,edad,fecha,provincia) values ('Alejandro','De Moraiz',25,'1995-09-02','Buenos Aires');



  
